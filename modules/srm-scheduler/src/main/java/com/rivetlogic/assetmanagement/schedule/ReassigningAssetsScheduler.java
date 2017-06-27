package com.rivetlogic.assetmanagement.schedule;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.rivetlogic.assetmanagement.service.AssetRequestLocalServiceUtil;

@Component(
		immediate = true,
		service = ReassigningAssetsScheduler.class
)
public class ReassigningAssetsScheduler extends BaseSchedulerEntryMessageListener{
	@Override
	protected void doReceive(Message message) throws Exception {
		LOG.info("Entering Reassigning Assets Scheduled Job");

		try {
			AssetRequestLocalServiceUtil.reasignAssets();
		} catch (PortalException e) {
			LOG.error("Error Reassigning Assets", e);
		} catch (SystemException e) {
			LOG.error("Error Reassigning Assets", e);
		}

		LOG.info("Ending Reassigning Assets Scheduled Job");
	}
	
	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(
			TriggerFactoryUtil.createTrigger(
				getEventListenerClass(), getEventListenerClass(),
				1, TimeUnit.MINUTE) );

		_schedulerEngineHelper.register(
			this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}
	
	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	private volatile ModuleServiceLifecycle _moduleServiceLifecycle;

	@Reference(unbind = "-")
	private volatile SchedulerEngineHelper _schedulerEngineHelper;

	@Reference(unbind = "-")
	private volatile TriggerFactory _triggerFactory;

	private static final Log LOG = LogFactoryUtil.getLog(ReassigningAssetsScheduler.class);
}

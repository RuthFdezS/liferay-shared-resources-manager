create index IX_EF4FF2A3 on rivetlogic_Asset (companyId, groupId, userId);
create index IX_18D9A923 on rivetlogic_Asset (groupId);
create index IX_CA57459B on rivetlogic_Asset (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C09A76DD on rivetlogic_Asset (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_83F71A41 on rivetlogic_AssetCategory (companyId, groupId, userId);
create index IX_58895A45 on rivetlogic_AssetCategory (groupId);
create index IX_F87FBAB9 on rivetlogic_AssetCategory (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C9F99B7B on rivetlogic_AssetCategory (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5873A2B8 on rivetlogic_AssetLocation (companyId, groupId, userId);
create index IX_96B86F2E on rivetlogic_AssetLocation (groupId);
create index IX_52DF1BF0 on rivetlogic_AssetLocation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2C5DDE72 on rivetlogic_AssetLocation (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_12B73AAE on rivetlogic_AssetMessage (companyId, groupId);
create index IX_A2365AFE on rivetlogic_AssetMessage (groupId);
create index IX_CA857A20 on rivetlogic_AssetMessage (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C56608A2 on rivetlogic_AssetMessage (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7F38D970 on rivetlogic_AssetRequest (companyId, groupId, userId);
create index IX_92A70376 on rivetlogic_AssetRequest (groupId);
create index IX_CBED8A8 on rivetlogic_AssetRequest (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EDF5692A on rivetlogic_AssetRequest (uuid_[$COLUMN_LENGTH:75$], groupId);
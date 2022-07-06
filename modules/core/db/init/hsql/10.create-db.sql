-- begin TIMETABLE_SERVICE
create table TIMETABLE_SERVICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SERVICE_TYPE varchar(255) not null,
    START_DATE timestamp not null,
    DURATION integer not null,
    BUS_ID varchar(36),
    DESCRIPTION longvarchar,
    --
    primary key (ID)
)^
-- end TIMETABLE_SERVICE
-- begin TIMETABLE_BUS
create table TIMETABLE_BUS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BUS_NUMBER varchar(255) not null,
    DRIVER_NAME varchar(255),
    DRIVER_PHONE varchar(255) not null,
    --
    primary key (ID)
)^
-- end TIMETABLE_BUS

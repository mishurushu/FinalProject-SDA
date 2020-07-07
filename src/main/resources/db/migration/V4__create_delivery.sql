create table Delivery
(
 deliveryId int(5) unsigned auto_increment primary key,
 locationCountry varchar (500)not null,
 locationCity varchar(500)not null,
 locationStreet varchar(500)not null,
 locationNumber int(200)not null,
 productDataTime varchar(500) not null
)
create table Product
(
 productId int(5) unsigned auto_increment primary key,
 productName varchar (1000) not null,
 descriptionProduct int(5) unsigned,
 foreign key(descriptionProduct) references description(descriptionId),
 priceProduct int(100) not null ,
 deliveryProduct int(5) unsigned,
 foreign key(deliveryProduct) references delivery(deliveryId),
 cook int(5) unsigned,
 foreign key(cook) references user(userId),
 consumer int(5) unsigned,
 foreign key (consumer) references user(userId)
)
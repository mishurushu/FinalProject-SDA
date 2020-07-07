create table user
(
  userId int(5) unsigned auto_increment primary key,
  userName varchar(50) not null,
  userType int(5) unsigned,
  foreign  key (userType) references userType(typeId)
)
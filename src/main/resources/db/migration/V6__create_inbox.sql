create table inbox
(
  inboxId int(5) unsigned auto_increment primary key,
  content varchar(8000) not null,
  authrId int(5) unsigned,
  foreign  key (authrId) references user(userId)
)
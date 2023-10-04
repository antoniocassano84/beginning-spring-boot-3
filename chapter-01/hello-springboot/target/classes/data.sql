DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id serial not null primary key,
                       name varchar(100) NOT NULL,
                       email varchar(100)
);

insert into users(id, name, email) values(1,'Siva','siva@gmail.com');
insert into users(id, name, email) values(2,'Prasad','prasad@gmail.com');
insert into users(id, name, email) values(3,'Reddy','reddy@gmail.com');

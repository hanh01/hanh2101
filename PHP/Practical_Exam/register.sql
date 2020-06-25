CREATE DATABASE practical_exam;
USE practical_exam;

CREATE TABLE users(
id int(11),
fullname varchar(128),
username varchar(16),
email varchar(200),
password char(200),
PRIMARY KEY (id)) ENGINE InnoDB;

INSERT INTO users(id,fullname, username, email, password)
    VALUES('1','hanh','hanh','hanh2101@gmail.com','123');
INSERT INTO users(id,fullname, username, email, password)
    VALUES('2','hanh1','hanh1','dohonghanh2101@gmail.com','123');

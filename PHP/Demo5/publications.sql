CREATE DATABASE publications;
USE publications;

CREATE TABLE classics(
author varchar(128),
title varchar(128),
category varchar(16),
year smallint ,
isbn char(13),
INDEX(author(20)),
INDEX(title(20)),
INDEX(category(4)),
INDEX(year),
PRIMARY KEY (isbn) ENGINE InnoDB;

ALTER TABLE classics ADD FULLTEXT(author,title);
INSERT INTO classics(author, title, category, year, isbn)
    VALUES('Charles Dickens','Little Dorrit','Fiction','1857','9780141439969');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Mark Twain','The Adventures of Tom Sawyer','Fiction','1876','7643723885');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Jane Austen ','Pride and Prejudice','Fiction','1811','921736247324');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Charles Darwin','The Origin of of Species','Non-Fiction','1856','92736214737');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('Charles Dickens','The Old Curiosity','Fiction','1841','97643723885');
INSERT INTO classics(author,title,category,year,isbn)
    VALUES('William Shakespeare','Romeo and Juliet','play','1594','902348732478');

CREATE TABLE customers(
name varchar(128),
isbn varchar(13),
PRIMARY KEY (isbn)) ENGINE InnoDB;

INSERT INTO customers(name,isbn)
   value('Joe Bloggs','9780099533474');
INSERT INTO customers(name,isbn)
   value('Mary Smith','9213246632672');
INSERT INTO customers(name, isbn)
   value('Jack & Wilson','97543265743');


SELECT * from customers;
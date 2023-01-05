CREATE DATABASE sql_Joins;
USE sql_Joins;

CREATE TABLE customer(
  customer_id INT NOT NULL PRIMARY KEY, 
  name VARCHAR(20)
);

CREATE TABLE orders(
  order_id INT NOT NULL PRIMARY KEY, amoutn INT, 
  customer int
);

insert into customer 
values 
  (1, 'Mandar'), 
  (2, 'Vishal'), 
  (3, 'Kaustubh'), 
  (4, 'Rutuja'), 
  (5, 'Sarvesha'), 
  (6, 'Purva'), 
  (7, 'Sreeram'), 
  (8, 'Utsav');
  
insert into orders 
values 
  (1, 200, 9), 
  (2, 500, 1), 
  (3, 400, 11), 
  (4, 600, 20), 
  (5, 1500, 4);
  
SELECT 
  * 
FROM 
  customer;
  
SELECT 
  * 
FROM 
  orders;
  
SELECT 
  customer.customer_id, 
  customer.name, 
  orders.amoutn 
FROM 
  customer 
  INNER JOIN orders ON customer.customer_id = orders.customer;
  
SELECT 
  customer.customer_id, 
  customer.name, 
  orders.amoutn 
FROM 
  customer 
  LEFT OUTER JOIN orders ON customer.customer_id = orders.customer;
  
SELECT 
  customer.customer_id, 
  customer.name, 
  orders.amoutn 
FROM 
  customer 
  RIGHT OUTER JOIN orders ON customer.customer_id = orders.customer;
  
SELECT 
  customer.customer_id, 
  customer.name, 
  orders.amoutn 
FROM 
  customer 
  LEFT OUTER JOIN orders ON customer.customer_id = orders.customer 
UNION 
SELECT 
  customer.customer_id, 
  customer.name, 
  orders.amoutn 
FROM 
  customer 
  RIGHT OUTER JOIN orders ON customer.customer_id = orders.customer;
  
SELECT 
  * 
FROM 
  customer NATURAL 
  JOIN orders 
WHERE 
  customer.customer_id = orders.order_id;
  
SELECT 
  * 
FROM 
  orders NATURAL 
  JOIN customer 
WHERE 
  customer.customer_id = orders.order_id;

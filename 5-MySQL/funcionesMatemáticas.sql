USE sakila;
SELECT * FROM payment;
-- SUM()   AVG()   COUNT()

SELECT customer_id, amount FROM payment;

SELECT COUNT(*) FROM payment;
SELECT COUNT(*) FROM payment  WHERE staff_id = 2;  -- cuenta los elementos 

-- Cantidad de clientes distintos
SELECT COUNT(DISTINCT customer_id) FROM payment;  -- cuenta valores distintos

-- SUM 
SELECT SUM(amount) AS 'total de rentas' FROM payment;  -- suma los datos de una columna
SELECT SUM(amount) AS 'total de rentas' FROM payment WHERE staff_id =2;

SELECT customer_id, SUM(amount) FROM payment GROUP BY customer_id ORDER BY SUM(amount) DESC;

-- ORDER BY / GROUP BY
SELECT * FROM payment ORDER BY staff_id; 
SELECT * FROM payment GROUP BY staff_id; -- Agrupa pero omite valores repetidos

-- AVG()   regresa un promedio 
SELECT AVG(amount) AS Promedio FROM payment;
SELECT customer_id, AVG(amount) FROM payment GROUP BY customer_id ORDER BY AVG(amount) DESC;


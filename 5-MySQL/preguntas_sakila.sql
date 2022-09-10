USE sakila;
-- las direcciones de cada ciudad
SELECT * FROM address;
SELECT address FROM address GROUP BY address ORDER BY district;
SELECT address FROM address GROUP BY district ORDER BY district DESC;
SELECT customer_id, SUM(amount) FROM payment GROUP BY customer_id ORDER BY SUM(amount) DESC;

SELECT address FROM address ORDER BY district  DESC;

-- peliculas que están hechas en cada idioma.
SELECT * FROM film;
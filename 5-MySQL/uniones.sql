USE tienda;
SELECT * FROM clientes;
SELECT * FROM compra;

-- Para unir tablas con Inner Join
-- Explícita: 
SELECT * 
FROM clientes       -- seleccionamos la base tabla para la union
INNER JOIN compra   -- especificamos la tabla que queremos agregar
ON clientes.cliente_id = compra.cliente_id;   -- indicamos las columas que están relacionadas tabla.columna1 = tabla.columa2

SELECT clientes.cliente_id AS 'numero de cliente', clientes.nombre, compra.*
FROM clientes
INNER JOIN compra
On clientes.cliente_id = compra.cliente_id;

-- Union implícita.alter
SELECT * 
FROM clientes, compra -- ponemos las tablas que queremos juntar
WHERE clientes.cliente_id = compra.cliente_id; -- ponemos la condicion. "cuando ambas tbalas tengan una coincidencia entonces muestra"

-- Union LEFT JOIN
SELECT * 
FROM clientes -- seleccionamos la tabla primaria
LEFT JOIN compra  -- ponemos la tabla secundaria
ON clientes.cliente_id = compra.cliente_id; -- ponemos las columnas que están relacionadas

-- Union Right join 
SELECT * 
FROM clientes -- seleccionamos la tabla primaria
RIGHT JOIN compra  -- ponemos la tabla secundaria
ON clientes.cliente_id = compra.cliente_id; -- ponemos las columnas que están relacionadas

-- mostrar las direcciones de cada pais => VAmos a hacer una relación triple
USE sakila;
SELECT * FROM address;
SELECT * FROM city;
SELECT * FROM country;

SELECT     -- Esta es la primera relacion 
address.address, 
city.city,
city.country_id
FROM address
INNER JOIN city
ON address.city_id = city.city_id;

SELECT   -- Union triple
country.country AS Pais,   -- estas son las 3 columnas que vamos avisualizar
city.city AS Ciudad, 
address.address AS Dirección
FROM country  -- de qué tabla vamos a buscar 
INNER JOIN city ON city.country_id = country.country_id   -- esta es la primer relacion
INNER JOIN address ON address.address_id = city.city_id; -- esta es la segunda relacion
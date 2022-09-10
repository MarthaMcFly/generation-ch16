USE sakila;
show tables;
select * from film where title like 'story';
SHOW DATABASES;
CREATE DATABASE generation;
USE generation;
SELECT * FROM cohorte_16;
INSERT INTO cohorte_16(nombre, apellido, companeros, dirección, proyecto)
VALUES ('maria', 'vargas', 7, 'edo, de mexico', 'mentora');
DELETE FROM cohorte_16 where idcohorte_id = 3;
UPDATE cohorte_16 SET nombre = 'juanito', apellido = 'perez' where idcohorte_16 = 2;
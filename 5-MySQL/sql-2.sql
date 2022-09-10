USE tienda;
SELECT * FROM clientes;
CREATE TABLE compra (
orden_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
cliente_id INT NOT NULL,
fecha_compra DATE NOT NULL,
total DECIMAL(5,2) NOT NULL,
cantidad_productos INT NOT NULL
);
CREATE TABLE clientes (
cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre CHAR(50) NOT NULL,
apellido CHAR(50) NOT NULL,
telefono CHAR(50) NOT NULL,
direccion VARCHAR(150) NOT NULL
);

SELECT * FROM compra;
SELECT * FROM clientes;
DROP table clientes,
TRUNCATE TABLE compra;
TRUNCATE TABLE clientes;
DROP table compra;

-- Para agregar llave foránea
ALTER TABLE compra -- Se selecciona primero la tabla
ADD CONSTRAINT fk_clientes_compra  -- nombre de la llave
FOREIGN KEY (cliente_id)  -- desde donde va a salir la llave
REFERENCES clientes (cliente_id); -- hacia donde va la llave

-- borrar llave foránea
ALTER TABLE compra 
DROP FOREIGN KEY fk_clientes_compra;

INSERT INTO compra (cliente_id, fecha_compra, total, cantidad_productos)
VALUES (1, '2022-09-06', 300.50, 2);

INSERT INTO clientes(nombre, apellido, telefono, direccion)
VALUES ('Pedro', 'Paramo', '55555555234', 'Comala'),
 ('Raul', 'Sanchez', '55555555234', 'Comala'),
 ('Victor', 'Fernández', '55555555234', 'Comala');


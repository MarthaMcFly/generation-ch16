CREATE DATABASE ejercicio_relaciones;
USE ejercicio_relaciones;
CREATE TABLE instructor(
instructor_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
cumpleanios DATE NOT NULL,
rfc VARCHAR(255) NOT NULL,
supervisor VARCHAR(255) NOT NULL, 
sesiones VARCHAR(255) NOT NULL
);
INSERT INTO instructor(nombre, edad, cumpleanios, rfc, supervisor, sesiones) VALUES ('raul', 33, '1980-05-29', 'AMD893716', 'Marina', 'sesiones tecnicas');
INSERT INTO instructor(nombre, edad, cumpleanios, rfc, supervisor, sesiones) VALUES ('vic', 40, '1989-06-28', 'POK896812', 'Marina', 'sesiones tecnicas');

ALTER TABLE cohorte -- Se selecciona primero la tabla
ADD CONSTRAINT fk_id_instructor  -- nombre de la llave
FOREIGN KEY (instructor_id)  -- desde donde va a salir la llave
REFERENCES instructor(instructor_id); -- hacia donde va la llave

ALTER TABLE cohorte -- Se selecciona primero la tabla
ADD CONSTRAINT fk_id_alumno  -- nombre de la llave
FOREIGN KEY (alumnos_id)  -- desde donde va a salir la llave
REFERENCES alumno(alumno_id); -- hacia donde va la llave

CREATE TABLE cohorte(
cohorte12_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
alumnos_id INT NOT NULL,
instructor_id INT NOT NULL,
numero_alumnos INT NOT NULL,
horario VARCHAR(255) NOT NULL,
tipo_sesiones VARCHAR(255) NOT NULL,
ciudad VARCHAR (255) NOT NULL);
INSERT INTO cohorte(instructor_id, numero_alumnos, horario, tipo_sesiones, ciudad) VALUES (3, 47, matutino, tecnica, cdmx);

CREATE TABLE alumno(
alumno_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL,
curp VARCHAR(255) NOT NULL,
rfc VARCHAR(255) NOT NULL,
nivel_ingles VARCHAR(255) NOT NULL,
anomestaciones INT NOT NULL);
INSERT INTO alumno(nombre, edad, curp, rfc, nivel_ingles, anomestaciones) VALUES ('mar', 29, 'SHDI9384729', 'JFO03848', 'B1', 0);
INSERT INTO alumno(nombre, edad, curp, rfc, nivel_ingles, anomestaciones) VALUES ('zul', 18, 'SJFI9374595', 'EUF03374', 'B1', 0);
SELECT * FROM alumno;

CREATE TABLE equipo(
equipo_id VARCHAR(255) NOT NULL PRIMARY KEY,
alumno_id INT NOT NULL,
nombre VARCHAR(255) NOT NULL,
cantidad_integrantes INT NOT NULL,
logo VARCHAR(255) NOT NULL);
INSERT INTO equipo (nombre, cantidad_integrantes, logo) VALUES ('krelboing', 8, 'AKAN');

ALTER TABLE equipo -- Se selecciona primero la tabla
ADD CONSTRAINT fk_id_equipo  -- nombre de la llave
FOREIGN KEY (alumno_id)  -- desde donde va a salir la llave
REFERENCES alumno (alumno_id); -- hacia donde va la llave

CREATE TABLE direccion(
direccion_id VARCHAR(255) NOT NULL PRIMARY KEY,
alumno_id INT NOT NULL,
calle VARCHAR(255) NOT NULL,
pais VARCHAR(255) NOT NULL,
cp INT NOT NULL);
INSERT INTO direccion(calle, pais, cp) VALUES ('Avenida Siempre viva 742', 'mexico', 13459);
SELECT * FROM instructor;

ALTER TABLE direccion
ADD CONSTRAINT fk_id_Alumnos
FOREIGN KEY (alumno_id)
REFERENCES alumno(alumno_id);

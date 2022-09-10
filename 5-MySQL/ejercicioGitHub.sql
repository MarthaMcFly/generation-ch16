USE newgeneration;
SELECT 
/*1. EJECUTAR EL CODIGO */
SELECT Students.*, Countries.name country FROM Students INNER JOIN Countries ON Students.nationality = Countries.idCountries;

/* 2. Modifique la sentencia SQL anterior para que una la tabla Students con la tabla IDTypes para conocer el tipo de identificación
de cada estudiante. */

SELECT Students.*,  idtypes.name 
FROM Students 
INNER JOIN idtypes 
ON idtypes.id_Types = students.Idtype;

/*3. Escriba una instrucción SQL adicional para UNIRSE a la tabla Estudiantes con la tabla 
CourseHasStudent para obtener el código de los cursos en los que está inscrito cada estudiante. */
  -- tabla courses_has_students
  -- tabla students
  SELECT Students.*, idtypes.name, courses_has_students.* FROM Students INNER JOIN idtypes ON Students.IdType_id = idtypes.id_idtypes
INNER JOIN courses_has_students ON Students.idStudent = courses_has_students.students_id_student;

/* 4. Escriba una consulta SQL para unir la tabla CourseHasStudent con la tabla Courses para obtener 
el nombre de la información del curso con la ID de estudiante de los estudiantes inscritos en el curso.
*/
 SELECT courses_has_students.* , courses.name, courses.credits, courses.module_code 
 FROM courses_has_students 
 INNER JOIN courses 
 ON courses_has_students.course_code = courses.code ;

/*5. Ahora que tiene las dos consultas, use INNER JOIN para combinar los resultados de las consultas 
(esto se denomina consultas anidadas y le permitirá combinar consultas SQL para ordenar los datos de 
la manera que desee). */
  
  
  
  
  
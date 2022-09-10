USE world;
SELECT * FROM country;
SELECT * FROM country where Population between 1000000 and 2000000;

-- OR / AND / !
SELECT * FROM country WHERE  Continent = 'Asia' || Continent ='Europe';

-- IN 
select * from country where Continent IN ('Asia', 'Europe', 'North America');
select * from country where Continent NOT IN ('Asia', 'Europe', 'North America');

-- Filtrar valores NULL
SELECT * FROM country WHERE IndepYear IS NULL;

-- LIKE / % / _
SELECT * FROM country WHERE  Name LIKE '%as';
SELECT * FROM country WHERE  Name LIKE '%e_a';



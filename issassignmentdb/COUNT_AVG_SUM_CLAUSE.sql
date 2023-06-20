use issassignmentdb;

-- The COUNT() function returns the number of rows that matches a specified criterion.
-- The AVG() function returns the average value of a numeric column. 
-- The SUM() function returns the total sum of a numeric column. 

-- select count(FirstName)
-- select avg(Salary)
select sum(Salary)
from Persons

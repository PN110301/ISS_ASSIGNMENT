use issassignmentdb;

-- The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions.

SELECT COUNT(PersonID), City
FROM Persons
GROUP BY City
HAVING COUNT(PersonID) > 1;
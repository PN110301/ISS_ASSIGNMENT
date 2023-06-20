use issassignmentdb;

-- The UNION operator is used to combine the result-set of two or more SELECT statements.

SELECT City FROM Persons
UNION
SELECT City FROM OrderData
ORDER BY City;
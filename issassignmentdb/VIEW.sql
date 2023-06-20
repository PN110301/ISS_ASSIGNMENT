use issassignmentdb;

CREATE VIEW MUM_Persons AS
SELECT FirstName, LastName
FROM Persons
WHERE City = 'Mumbai';

SELECT * FROM MUM_Persons
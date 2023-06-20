use issassignmentdb;

-- The RIGHT JOIN keyword returns all records from the right table (table2), and the matching records (if any) from the left table

SELECT OrderData.OrderID, Persons.LastName, Persons.FirstName
FROM OrderData
RIGHT JOIN Persons ON OrderData.PersonID = Persons.PersonID
ORDER BY OrderData.OrderID;
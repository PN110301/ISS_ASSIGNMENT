use issassignmentdb;

-- The LEFT JOIN keyword returns all records from the left table (Customers), even if there are no matches in the right table

SELECT Persons.FirstName, OrderData.OrderID
FROM Persons
LEFT JOIN OrderData ON Persons.PersonID = OrderData.PersonID
ORDER BY Persons.FirstName;
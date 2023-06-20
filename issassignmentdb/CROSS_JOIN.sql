use issassignmentdb;

-- The CROSS JOIN keyword returns all records from both tables 

SELECT Persons.FirstName, OrderData.OrderID
FROM Persons
CROSS JOIN OrderData;
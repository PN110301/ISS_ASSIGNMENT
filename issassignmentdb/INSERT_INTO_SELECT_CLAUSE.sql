use issassignmentdb;

-- The INSERT INTO SELECT statement copies data from one table and inserts it into another table.
-- The INSERT INTO SELECT statement requires that the data types in source and target tables matches.

INSERT INTO Persons (FirstName, City)
SELECT OrderID, OrderDate FROM OrderData;
use issassignmentdb;

-- A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
-- The INNER JOIN keyword selects records that have matching values in both tables.

create table OrderData(
OrderID int,
PersonID int,
OrderDate varchar(255),
City varchar(255)
);
drop table OrderData;

insert into OrderData values (2,2,'23-09-21','Mumbai');
insert into OrderData values (4,5,'22-09-21','Banglore');
insert into OrderData values (7,9,'21-09-21','Kolkata');

SELECT OrderData.OrderID, Persons.FirstName, OrderData.OrderDate
FROM OrderData
INNER JOIN Persons ON OrderData.PersonID=Persons.PersonID;
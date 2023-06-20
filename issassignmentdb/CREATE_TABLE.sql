use issassignmentdb;

-- The column parameters specify the names of the columns of the table.

-- The datatype parameter specifies the type of data the column can hold (e.g. varchar, integer, date, etc.).
CREATE TABLE Persons (
    PersonID int,
    FirstName varchar(255),
    LastName varchar(255),
    Salary int,
    Address varchar(255),
    City varchar(255)
); 

drop table Persons


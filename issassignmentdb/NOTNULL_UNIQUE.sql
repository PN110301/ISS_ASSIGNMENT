use issassignmentdb;

-- The NOT NULL constraint enforces a column to NOT accept NULL values.
-- The UNIQUE constraint ensures that all values in a column are different.

CREATE TABLE Employee (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CONSTRAINT UC_Person UNIQUE (ID,LastName)
);
use issassignmentdb;

-- The CREATE INDEX statement is used to create indexes in tables.

CREATE INDEX idx_lastname
ON Persons (LastName);

select * from Persons
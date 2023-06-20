use issassignmentdb;

-- Auto-increment allows a unique number to be generated automatically when a new record is inserted into a table.

CREATE TABLE Persons1 (
    Personid int NOT NULL AUTO_INCREMENT,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Personid)
);

ALTER TABLE Persons1 AUTO_INCREMENT=100;

INSERT INTO Persons1 (FirstName,LastName)
VALUES ('Lars','Monsen');

select * from Persons1
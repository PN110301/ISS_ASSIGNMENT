use issassignmentdb;

-- The DEFAULT Constraint is used to fill a column with a default and fixed value. 
-- The value will be added to all new records when no other value is provided.

CREATE TABLE Info (
ID int NOT NULL,
Name varchar(255),
Age int,
Location varchar(255) DEFAULT 'Noida'
);
INSERT INTO Info VALUES (4, 'Mira', 23, 'Delhi');
INSERT INTO Info VALUES (5, 'Hema', 27,DEFAULT);
INSERT INTO Info VALUES (6, 'Neha', 25, 'Delhi');
INSERT INTO Info VALUES (7, 'Khushi', 26,DEFAULT);
Select * from Info;
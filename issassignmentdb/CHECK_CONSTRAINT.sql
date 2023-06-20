use issassignmentdb;

-- Check Constraint is used to specify a predicate that every tuple must satisfy in a given relation.

CREATE TABLE student(
        StudentID INT NOT NULL,
        Name VARCHAR(30) NOT NULL,
        Age INT NOT NULL,
        GENDER VARCHAR(9),
        check(Age >= 17)
        );
        
-- There won’t be any database update and as the age < 17 years.
INSERT INTO student(STUDENTID, NAME, AGE, GENDER) 
VALUES (1006, 'Ram', 16, 'Male');
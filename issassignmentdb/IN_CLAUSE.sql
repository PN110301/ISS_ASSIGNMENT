use issassignmentdb;

-- The IN operator allows you to specify multiple values in a WHERE clause.
-- The IN operator is a shorthand for multiple OR conditions.

select City
from Persons
where City in ('Mumbai','Ahmedabad')
use issassignmentdb;

-- The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates.
-- The BETWEEN operator is inclusive: begin and end values are included.

select *
from Persons
where Salary between 10000 and 70000
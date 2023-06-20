use issassignmentdb;

-- The AND and OR operators are used to filter records based on more than one condition:
-- The AND operator displays a record if all the conditions separated by AND are TRUE.
-- The OR operator displays a record if any of the conditions separated by OR is TRUE.
-- The NOT operator displays a record if the condition(s) is NOT TRUE.

select *
from Persons
-- where City='Mumbai' and LastName='Sharma'
-- where City='Banglore' or City='Ahmedabad'
where not City='Mumbai'




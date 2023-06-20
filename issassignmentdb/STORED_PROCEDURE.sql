use issassignmentdb;

select * from Persons;

call get_persons(@record);

select @record as total;

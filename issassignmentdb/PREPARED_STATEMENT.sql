use issassignmentdb;

prepare statement1 from 'select ? + ? as sum';
set @a=10;
set @b=5;

execute statement1 using @a , @b;

prepare stmt2 from 'select FirstName,LastName from Persons where Salary=?';
set @Salary=20000;
execute stmt2 using @Salary;
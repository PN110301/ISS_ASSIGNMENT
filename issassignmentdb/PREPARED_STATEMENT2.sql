use issassignmentdb;

-- The prepared statement or parameterized statement is used to execute the same statements repeatedly with high efficiency. It takes advantage of the client/server binary protocol.
-- Prepared statement passes the query that contains placeholders (?) to the MySQL Server

call get_info('Persons');
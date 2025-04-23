USE JavaFullStack;
-- Create the table
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    email VARCHAR(100),
    enrollment_date DATE
);

-- Insert random entries
INSERT INTO students (student_id, first_name, last_name, date_of_birth, email, enrollment_date)
VALUES
(1, 'John', 'Doe', '2000-04-15', 'johndoe@example.com', '2019-08-20'),
(2, 'Jane', 'Smith', '1999-10-22', 'janesmith@example.com', '2018-09-15'),
(3, 'Mark', 'Johnson', '2001-02-03', 'markjohnson@example.com', '2020-01-10'),
(4, 'Emily', 'Davis', '2000-07-25', 'emilydavis@example.com', '2019-08-15'),
(5, 'Michael', 'Williams', '1998-12-05', 'michaelwilliams@example.com', '2017-07-30');

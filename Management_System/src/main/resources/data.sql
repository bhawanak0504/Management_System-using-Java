-- Inserting data into the Department Table
INSERT INTO department (name) VALUES ('HR');
INSERT INTO department (name) VALUES ('IT');
INSERT INTO department (name) VALUES ('Finance');

-- Inserting data into the Employee Table
INSERT INTO employee (name, position, salary, department_id) VALUES ('Alice Johnson', 'HR Manager', 60000, 1);
INSERT INTO employee (name, position, salary, department_id) VALUES ('Bob Smith', 'Software Engineer', 80000, 2);
INSERT INTO employee (name, position, salary, department_id) VALUES ('Charlie Brown', 'Accountant', 50000, 3);
INSERT INTO employee (name, position, salary, department_id) VALUES ('Diana Prince', 'IT Support', 45000, 2);
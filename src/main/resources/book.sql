CREATE TABLE book
(
    id          VARCHAR(255) NOT NULL,
    name        VARCHAR(255),
    employee_id VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT book_employee_fk FOREIGN KEY (employee_id) REFERENCES employee (id)
);

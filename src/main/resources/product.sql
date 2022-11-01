DROP TABLE IF EXISTS product;
CREATE TABLE product
(
    id          VARCHAR(255),
    description VARCHAR(255),
    price       numeric,
    PRIMARY KEY (id)
);

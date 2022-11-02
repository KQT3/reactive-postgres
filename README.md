#### https://medium.com/@dasi.rajesh08/spring-boot-crud-operations-using-reactive-postgresql-driver-r2dbc-c7bf282b73b7
#### https://github.com/hantsy/spring-r2dbc-sample
#### https://www.sipios.com/blog-tech/handle-the-new-r2dbc-specification-in-java
```
CREATE TABLE product
(
id integer,
description character varying(255),
price numeric,
PRIMARY KEY (id)
);
```


```
-- DROP TABLE IF EXISTS product;
CREATE TABLE IF NOT EXISTS product
(
    id          VARCHAR(255),
    description VARCHAR(255),
    price       numeric,
    PRIMARY KEY (id)
);

```

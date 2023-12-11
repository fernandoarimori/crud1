CREATE TABLE tb_user (
    id tinyint NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    age int NOT NULL,
    register varchar(255) NOT NULL,
    email varchar (255) NOT NULL,
    category_place varchar (7)  NOT NULL,
    PRIMARY KEY (id)
);
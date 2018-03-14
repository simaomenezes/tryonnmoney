CREATE TABLE tb_categoria (
 codigo BIGSERIAL CONSTRAINT pk_cat PRIMARY KEY,
 nome varchar(30) NOT NULL
);


CREATE SEQUENCE public.cat_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
INSERT INTO tb_categoria(nome) values ('Lazer');
INSERT INTO tb_categoria(nome) values ('Alimentação');
INSERT INTO tb_categoria(nome) values ('Supermercado');
INSERT INTO tb_categoria(nome) values ('Farmácia');
INSERT INTO tb_categoria(nome) values ('Outros');
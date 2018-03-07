CREATE TABLE tb_categoria (
	codigo integer NOT NULL,
 	nome varchar(50) NOT NULL
);

INSERT INTO tb_categoria(codigo, nome) values (1, 'Lazer');
INSERT INTO tb_categoria(codigo, nome) values (2, 'Alimentação');
INSERT INTO tb_categoria(codigo, nome) values (3, 'Supermercado');
INSERT INTO tb_categoria(codigo, nome) values (4, 'Farmácia');
INSERT INTO tb_categoria(codigo, nome) values (5, 'Outros');
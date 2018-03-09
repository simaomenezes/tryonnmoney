CREATE TABLE tb_pessoa (
	codigo integer NOT NULL,
 	nome varchar(50) NOT NULL,
 	ativo BOOLEAN NOT NULL,
    logradouro varchar(100),
    numero varchar(20),
    complemento varchar(50),
    bairro varchar(50),
    cep varchar(20),
    cidade varchar(50),
    estado varchar(20)
);

CREATE SEQUENCE public.pessoa_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (1,'João Lucas', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (2,'JJ PP', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (3,'Lucas', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (4,'Gabriel', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (5,'João Felipe', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (6,'Fernanda', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (7,'Fabricia', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (8,'Diego', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (9,'Ana Paula', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(codigo, nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values (10,'João VII', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
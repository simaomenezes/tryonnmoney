CREATE TABLE tb_pessoa (
	codigo BIGSERIAL CONSTRAINT pk_pe PRIMARY KEY,
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

INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('João Lucas', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('JJ PP', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Lucas', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Gabriel', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('João Felipe', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Fernanda', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Fabricia', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Diego', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Ana Paula', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
INSERT INTO tb_pessoa(nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('João VII', true, 'Anadia', '458A', 'Algum lugar', 'centro', '3658-85', 'Pacajus', 'ce');
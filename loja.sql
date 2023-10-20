create database loja;
use loja;
create table produto(
id_produto int primary key auto_increment,
nome varchar(30) not null,
descricao varchar (200) not null,
estoque int not null,
preco double not null
);
create table cliente(
id_cliente int auto_increment primary key ,
nome varchar(30) not null,
telefone varchar(15) not null,
email varchar(50) not null
);
create table adiministrador(
id_adm int auto_increment primary key,
usuario varchar(50) not null,
senha  varchar(50) not null
);
create table gerente(
id_gerente int auto_increment primary key,
usuario varchar(50) not null,
senha  varchar(50) not null
);
create table funcionario(
id_funcionario int auto_increment primary key,
usuario varchar(50) not null,
senha  varchar(50) not null
);

INSERT INTO adiministrador(usuario,senha)
VALUES('adm','adm123');
INSERT INTO gerente(usuario,senha)
VALUES('grt','grt123');
INSERT INTO funcionario(usuario,senha)
VALUES('fun','fun123');

INSERT INTO produto(nome,descricao,preco,estoque)
VALUES('ggggg','gyffhf','10.0',10);



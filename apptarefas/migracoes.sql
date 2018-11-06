--migra��es sql

create database "transpoBrasil";

--tabela projeto
create table projetos (
    id serial not null primary key,
    nome varchar(100) not null,
    descricao varchar(1000) not null,
    status varchar(100),
    "dataHoraCriacao" timestamp not null,
    "dataHoraAtualizacao" timestamp not null,
    "dataHoraFim" timestamp not null
);

create table usuarios(
	id serial not null primary key,
	nome varchar(120) not null,
    email varchar(120) not null,
    senha varchar (20) not null,
    "dataHoraCriacao" timestamp not null,
    "dataHoraAtualizacao" timestamp not null,
    status varchar(100) not null
);






create table situacao(
	id serial not null primary key,
	nome varchar(120) not null,
	tipo varchar(120) not null, 
	"dataHoraCriacao" timestamp not null, 
	"dataHoraAtualizacao" timestamp not null,
	"dataHoraRemocao" timestamp,
	status varchar(100) not null
);



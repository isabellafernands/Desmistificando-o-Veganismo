create database site;
use site;

drop database site;

create table Usuario(
nome_Usuario varchar(20) not null primary key,
senha varchar(20) not null,
nomeInteiro varchar(150) not null,
dataNascimento date not null,
admin int(1)
)engine=innodb;

create table Publicacao(
id_Publ int not null,
nome_Usuario varchar(20) not null,
conteudo varchar(5000) not null,
dataPubl date,
titulo varchar(30),
primary key (id_publ, nome_Usuario),
foreign key (nome_Usuario) references Usuario (nome_usuario)
)engine=innodb;

create table Comentario(
id_Publ int not null,
nome_usuario varchar(20) not null,
id_coment int not null,
dataComent date,
conteudo varchar(500),
primary key(id_Publ, nome_usuario, id_coment),
foreign key (id_Publ) references Publicacao (id_Publ),
foreign key (nome_usuario) references usuario (nome_usuario)
)engine=innodb;


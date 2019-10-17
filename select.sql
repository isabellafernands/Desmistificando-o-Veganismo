select * from Usuario;
Select * from Publicacao;
select * from Comentario;

select * from Usuario where nomeInteiro like 'P%';
select nome_usuario from Usuario where dataNascimento like '%2000%';
select nome_usuario, nomeInteiro from Usuario where admin='1';


select nome_usuario, conteudo from comentario where id_publ = 1;
select nome_usuario, conteudo from comentario where nome_usuario = 'Raiane154';
select conteudo, nome_usuario, datacoment from comentario where datacoment like '2018-10%';
select datacoment, nome_usuario, count(*) from comentario group by datacoment;

select * from publicacao order by titulo;
select dataPubl, titulo, count(*) from publicacao order by titulo;
select nome_usuario, conteudo from Publicacao where nome_usuario like '%a%';


select * from Publicacao 
inner join comentario on publicacao.nome_usuario=comentario.nome_usuario;

select publicacao.nome_usuario, comentario.nome_usuario, comentario.datacoment, publicacao.dataPubl
from publicacao inner join comentario on comentario.datacoment=publicacao.dataPubl;

select u.nome_usuario, u.nomeInteiro, c.nome_usuario, c.conteudo 
from usuario as u inner join comentario as c on u.nome_usuario=c.nome_usuario
where c.conteudo like '%Bom%';
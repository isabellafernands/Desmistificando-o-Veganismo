insert into Usuario (nome_usuario, senha, nomeInteiro, dataNascimento, admin)
values('Isabella123', '123456', 'Isabella Fernanda Barbosa', '2000-04-18', 1),
('PedroB', '170718', 'Pedro Bartolomei Oliveira e Silva', '2003-02-22', 1),
('Raiane154', '1547Raiane', 'Raiane Esheley', '2002-03-16', 0),
('VictorBernardo', 'Bernardo123987', 'Victor Bernardo','2001-05-20', 0),
('Thais147', 'T123654789', 'Thais Maria', '2003-10-28', 0),
('BrunoBorelli', 'borelliBruno','Bruno Borelli','2001-09-27',0),
('Selme894', 'Selmev14d40', 'Selme Barretto', '2002-11-15',0),
('Erika45', 'Erika123456', 'Erika Cristina Oliveira', '2001-08-25', 0),
('PedroTeressan', 'Teressan9', 'Pedro Teressan', '2001-06-27',0);

insert into publicacao (id_publ, nome_usuario, conteudo, dataPubl, titulo)
values(1, 'Isabella123', 'texto texto texto texto texto texto texto1', '2018-09-20', 'Titulo'),
(2,'PedroB', 'texto texto texto texto texto2', '2018-10-02', 'Titulo2'),
(3, 'Isabella123', 'textotextotexto textotextotexto texto texto texto3', '2018-10-03', 'Título3'),
(4, 'PedroB', 'texto texto texto4', '2018-10-05', 'Título4'),
(5, 'PedroB', 'textotexto texto texto teeeeeeexto texto5', '2018-10-09', 'Titulo5'); 

insert into Comentario (id_Publ, nome_usuario, id_coment, dataComent, conteudo)
values(1, 'Raiane154', 1, '2018-09-22', 'Muito bom!'),
(1, 'Isabella123', 2, '2018-09-22', 'Obrigada!'),
(2, 'Thais147', 3, '2018-10-03', 'Gostei muito! Top.'),
(2, 'PedroB', 4, '2018-10-05', 'Obrigado!'),
(4, 'BrunoBorelli', 5, '2018-10-05', 'UUUUUUUUUH RUIIIM!'),
(4, 'PedroB', 6, '2018-10-06', ':('),
(5, 'Selme894', 7, '2018-10-10', 'É, então. Não gostei.'),
(5, 'Isabella123', 8, '2018-10-10', 'Poxa, na próxima quem sabe você goste!'),
(3, 'Raiane154', 9, '2018-10-04', 'Adorei o conteúdo! Aguardo mais textos sobre! :D'),
(3, 'Thais147', 10, '2018-10-07', 'Que legal! Não sabia disso!'),
(3, 'Isabella123', 11, '2018-10-08', 'Obrigada!');

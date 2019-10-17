package Principal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import DAO.ComentarioDAO;
import DAO.PublicacaoDAO;
import DAO.UsuarioDAO;
import modelo.Comentario;
import modelo.Publicacao;
import modelo.Usuario;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);		

		String nomeUsuario, senha, nomeInteiro, titulo, conteudo, dataNasc, dataComent, dataPubl;
		int admin, idComent, idPubl, desejo;

		System.out.println("O que deseja fazer? (Digite o n�mero correspondendo ao seu desejo.)");

		System.out.println("1 - Fazer Cadastro");
		System.out.println("2 - Fazer Publica��o");
		System.out.println("3 - Fazer Coment�rio");
		System.out.println("4 - Pesquisar Publica��es");
		System.out.println("5 - Pesquisar Coment�rios");

		desejo=entrada.nextInt();

		switch (desejo) {
		case 1:
			System.out.println("Insira seu nome de usu�rio");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva sua senha");
			senha=entrada.nextLine();

			System.out.println("Escreva seu nome inteiro");
			nomeInteiro=entrada.nextLine();

			System.out.println("Escreva sua data de nascimento no seguinte formato: (ano-m�s-dia)");
			dataNasc=entrada.nextLine();

			System.out.println("Voc� � um dos administradores? Digite 1 pra sim e 0 para n�o.");
			admin=entrada.nextInt();

			Usuario usuario = new Usuario(nomeUsuario, senha, nomeInteiro, dataNasc, admin);
			UsuarioDAO.insereUsuario(usuario);
			Usuario usuario1 = new Usuario (nomeUsuario, senha, nomeInteiro, dataNasc,admin);
			UsuarioDAO.insereUsuario(usuario1);

			break;

		case 2:

			System.out.println("Escreva o n�mero de Identifica��o da publica��o");
			idPubl=entrada.nextInt();

			System.out.println("Escreva seu nome de usu�rio");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva o conte�do da publica��o");
			conteudo=entrada.nextLine();

			System.out.println("Escreva a data da publica��o no seguinte formato: (ano-m�s-dia)");
			dataPubl=entrada.nextLine();

			System.out.println("Escreva o t�tulo da publica��o");
			titulo=entrada.nextLine();

			Publicacao publicacao = new Publicacao(idPubl, nomeUsuario, conteudo, dataPubl, titulo);
			PublicacaoDAO.inserePublicacao(publicacao);
			Publicacao publicacao1 = new Publicacao(idPubl, nomeUsuario, conteudo, dataPubl, titulo);
			PublicacaoDAO.inserePublicacao(publicacao1);
			break;

		case 3:

			System.out.println("Escreva o n�mero de Identifica��o da publica��o que voc� quer comentar");
			idPubl=entrada.nextInt();

			System.out.println("Escreva seu nome de usu�rio");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva o n�mero de identifuca��o do seu coment�rio");
			idComent=entrada.nextInt();

			System.out.println("Escreva a data da publica��o no seguinte formato: (ano-m�s-dia)");
			dataComent=entrada.nextLine();

			System.out.println("Escreva o conte�do do Coment�rio");
			conteudo=entrada.nextLine();

			Comentario comentario = new Comentario(idPubl, nomeUsuario, idComent, dataComent, conteudo);
			ComentarioDAO.insereComentario(comentario);
			Comentario comentraio1 = new Comentario(idPubl, nomeUsuario, idComent, dataComent, conteudo);
			ComentarioDAO.insereComentario(comentario);

			break;

		case 4:
			
			ResultSet rs1 = PublicacaoDAO.consultaPublicacao();
			try {
				while (rs1.next()) {
					idPubl=rs1.getInt("id_publ");
					nomeUsuario=rs1.getString("nome_Usuario");
					conteudo=rs1.getString("conteudo");
					dataPubl=rs1.getString("dataPubl");
					titulo=rs1.getString("titulo");
					System.out.println("id_Publ "+ idPubl + "nome_Usuario "+ nomeUsuario +
							"conteudo" + conteudo + "dataPubl" + dataPubl + "titulo" + titulo);
				} 
			}catch (SQLException e) {
					e.printStackTrace();
			}
			break;
			
		case 5:			

			ResultSet rs2 = ComentarioDAO.consultaComentario();
			try {
				while (rs2.next()) {
					idPubl=rs2.getInt("id_publ");
					nomeUsuario=rs2.getString("nome_Usuario");
					idComent=rs2.getInt("id_Coment");
					dataComent=rs2.getString("dataComent");
					conteudo=rs2.getString("conteudo");
					System.out.println("id_Publ "+ idPubl + "nome_Usuario "+ nomeUsuario +
							"id_Coment" + idComent + "dataComent" + dataComent + "conteudo" + conteudo);
				} 
			}catch (SQLException e) {
					e.printStackTrace();
			}
			
			break;
		default:
			break;
		}


	}
}

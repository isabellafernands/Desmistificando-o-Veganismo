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

		System.out.println("O que deseja fazer? (Digite o número correspondendo ao seu desejo.)");

		System.out.println("1 - Fazer Cadastro");
		System.out.println("2 - Fazer Publicação");
		System.out.println("3 - Fazer Comentário");
		System.out.println("4 - Pesquisar Publicações");
		System.out.println("5 - Pesquisar Comentários");

		desejo=entrada.nextInt();

		switch (desejo) {
		case 1:
			System.out.println("Insira seu nome de usuário");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva sua senha");
			senha=entrada.nextLine();

			System.out.println("Escreva seu nome inteiro");
			nomeInteiro=entrada.nextLine();

			System.out.println("Escreva sua data de nascimento no seguinte formato: (ano-mês-dia)");
			dataNasc=entrada.nextLine();

			System.out.println("Você é um dos administradores? Digite 1 pra sim e 0 para não.");
			admin=entrada.nextInt();

			Usuario usuario = new Usuario(nomeUsuario, senha, nomeInteiro, dataNasc, admin);
			UsuarioDAO.insereUsuario(usuario);
			Usuario usuario1 = new Usuario (nomeUsuario, senha, nomeInteiro, dataNasc,admin);
			UsuarioDAO.insereUsuario(usuario1);

			break;

		case 2:

			System.out.println("Escreva o número de Identificação da publicação");
			idPubl=entrada.nextInt();

			System.out.println("Escreva seu nome de usuário");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva o conteúdo da publicação");
			conteudo=entrada.nextLine();

			System.out.println("Escreva a data da publicação no seguinte formato: (ano-mês-dia)");
			dataPubl=entrada.nextLine();

			System.out.println("Escreva o título da publicação");
			titulo=entrada.nextLine();

			Publicacao publicacao = new Publicacao(idPubl, nomeUsuario, conteudo, dataPubl, titulo);
			PublicacaoDAO.inserePublicacao(publicacao);
			Publicacao publicacao1 = new Publicacao(idPubl, nomeUsuario, conteudo, dataPubl, titulo);
			PublicacaoDAO.inserePublicacao(publicacao1);
			break;

		case 3:

			System.out.println("Escreva o número de Identificação da publicação que você quer comentar");
			idPubl=entrada.nextInt();

			System.out.println("Escreva seu nome de usuário");
			nomeUsuario=entrada.nextLine();

			System.out.println("Escreva o número de identifucação do seu comentário");
			idComent=entrada.nextInt();

			System.out.println("Escreva a data da publicação no seguinte formato: (ano-mês-dia)");
			dataComent=entrada.nextLine();

			System.out.println("Escreva o conteúdo do Comentário");
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

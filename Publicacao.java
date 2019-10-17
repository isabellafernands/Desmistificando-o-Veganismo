package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Publicacao {
	
	private String conteudo, titulo, nomeUsuario, dataPubl;
	private int idPubl;
	
	/**
	 * 
	 * @param idPubl
	 * @param titulo
	 * @param nomeUsuario
	 * @param dataPubl
	 * @param conteudo
	 */
	
	public Publicacao(int idPubl, String titulo, String nomeUsuario, String dataPubl, String conteudo) {
		
		this.conteudo=conteudo;
		this.titulo=titulo;
		this.nomeUsuario=nomeUsuario;
		this.dataPubl=dataPubl;
		this.idPubl=idPubl;
		
	}
	
	/**
	 * 
	 * @return
	 */

	public String getConteudo() {
		return conteudo;
	}
	
	/**
	 * 
	 * @param conteudo
	 */

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * 
	 * @param titulo
	 */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	/**
	 * 
	 * @param nomeUsuario
	 */

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getDataPubl() {
		return dataPubl;
	}
	
	/**
	 * 
	 * @param dataPubl
	 */

	public void setDataPubl(String dataPubl) {
		this.dataPubl = dataPubl;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getIdPubl() {
		return idPubl;
	}

	/**
	 * 
	 * @param idPubl
	 */
	
	public void setIdPubl(int idPubl) {
		this.idPubl = idPubl;
	}

	
}

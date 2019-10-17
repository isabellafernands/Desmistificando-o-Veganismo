package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Comentario {
	
	private String conteudo, nomeUsuario, dataComent;
	private int idPubl, idComent;
	
	/**
	 * 
	 * @param idComent
	 * @param nomeUsuaio
	 * @param idPubl
	 * @param conteudo
	 * @param dataComent
	 */
	
	public Comentario(int idComent, String nomeUsuaio, int idPubl, String conteudo, String dataComent) {
				
		this.conteudo=conteudo;
		this.nomeUsuario=nomeUsuario;
		this.idComent=idComent;
		this.idPubl=idPubl;
		this.dataComent=dataComent;
		
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
	
	/**
	 * 
	 * @return
	 */

	public int getIdComent() {
		return idComent;
	}
	
	/**
	 * 
	 * @param idComent
	 */

	public void setIdComent(int idComent) {
		this.idComent = idComent;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getDataComent() {
		return dataComent;
	}
	
	/**
	 * 
	 * @param dataComent
	 */

	public void setDataComent(String dataComent) {
		this.dataComent = dataComent;
	}

	
}

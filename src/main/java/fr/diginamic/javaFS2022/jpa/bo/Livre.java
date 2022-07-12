package fr.diginamic.javaFS2022.jpa.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "livre")
public class Livre {
	
	@Id
	private Integer id;
	
	@Column(name = "titre")
	private String titre;
	
	@Column(name = "auteur")
	private String auteur;

	/**
	 * 
	 */
	public Livre() {}

	/**
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Livre(Integer id, String titre, String auteur) {
		//super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livre [id=");
		builder.append(id);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", auteur=");
		builder.append(auteur);
		builder.append("]");
		return builder.toString();
	}
	
}

package sn.djibi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private int quantite;
	private int prix;

	public Produit() {
	}

	public Produit(int id, String nom, int quantite, int prix) {
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit{" +
				"id=" + id +
				", nom='" + nom + '\'' +
				", quantite=" + quantite +
				", prix=" + prix +
				'}';
	}
}

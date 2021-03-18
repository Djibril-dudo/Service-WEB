package sn.djibi.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


public class EtudiantBean {
	
	private Long id;
	private String numeroEtudiant;
	private String prenom;
	private String nom;
	public EtudiantBean() {
	}
	public EtudiantBean(Long id, String numeroEtudiant, String prenom, String nom) {
		super();
		this.id = id;
		this.numeroEtudiant = numeroEtudiant;
		this.prenom = prenom;
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}

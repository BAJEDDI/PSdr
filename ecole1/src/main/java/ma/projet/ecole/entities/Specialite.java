package ma.projet.ecole.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Specialite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	private String code;
	private String libelle;
	@OneToMany
	private List<Professeur> professeurs;
	public Specialite() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	@Override
	public String toString() {
		return "Specialite [id=" + id + ", code=" + code + ", libelle=" + libelle + ", professeurs=" + professeurs
				+ "]";
	}

}

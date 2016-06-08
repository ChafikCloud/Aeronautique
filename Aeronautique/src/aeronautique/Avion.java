package aeronautique;

public class Avion {
	
	 private int numero;
     private String nom;
     private String loc;
     private int capacite;
     private int enPlus;
     private int vol;
     
     
/**
 * Constructeur avion
 * @param numero
 * @param nom
 * @param loc
 * @param capacite
 */
	public Avion(int numero, String nom, String loc, int capacite) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.loc = loc;
		this.capacite = capacite;
		this.enPlus = 30;
	}


	
/**
 * geters pour Localisation
 * @return
 */
	public String getLoc() {
		return loc;
	}




	public void setLoc(String loc) {
		this.loc = loc;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	@Override
	public String toString() {
		return "Avion [numero=" + numero + ", nom=" + nom + ", loc=" + loc + ", capacite=" + capacite + "]";
	}
     
   

}

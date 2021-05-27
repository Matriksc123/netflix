package Refact;

import java.util.ArrayList;

public class Client {
	private String nif;
	private String nom;
	private String telefon;
	private ArrayList<Lloguer> lloguers;
	private static final double EUROS_PER_UNITAT_DE_COST = 30;

	public Client(String nif, String nom, String telefon) {
		this.nif = nif;
		this.nom = nom;
		this.telefon = telefon;
		this.lloguers = new ArrayList<Lloguer>();
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public String informe() {
    	return composaCapçelera() + composaDetall() + composaPeu();
    }
    public  int bonificacionsTotals() {
    	int bonificacions = 0;
    	for (Lloguer lloguer: lloguers) {
	    	bonificacions += lloguer.bonificacions();
    	}
    	return bonificacions;
    }
    public double importTotal() {
    	double total = 0;
    	for (Lloguer lloguer: lloguers) {
	    	total += lloguer.aPagar()*EUROS_PER_UNITAT_DE_COST;
    	}
    	return total;
    }
    public String composaCapçelera() {
    	return "Informe de lloguers del client " +
    	        getNom() +
    	        " (" + getNif() + ")\n";
    }
    public String composaDetall() {
    	String resultat = "";
    	for (Lloguer lloguer: lloguers) {
	        resultat += "\t" +
	            lloguer.getVehicle().getMarca() +
	            " " +
	            lloguer.getVehicle().getModel() + ": " +
	            (lloguer.aPagar() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";
	    }
    	return resultat;
    }
    public String composaPeu() {
    	return "Import a pagar: " + importTotal() + "€\n" +
	        "Punts guanyats: " + bonificacionsTotals() + "\n";
    }
    public String informeHTML() {
        return composaCapsaleraHTML() + composaDetallHTML() + composaPeuHTML();
    }
    public String composaCapsaleraHTML() {
        return "<h1>Informe de lloguers</h1>\n" + "<p>Informe del client <em>" + getNom() + "</em> (<strong>" + getNif() + "</strong>)</p>\n";
    }
    public String composaDetallHTML() {
    	String resultat = "<table>\n" + "\t<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>\n";
    	for (Lloguer lloguer: lloguers) {
	        resultat += "\t<tr><td>" +
	            lloguer.getVehicle().getMarca() +
	            "</td><td>" +
	            lloguer.getVehicle().getModel() + "</td><td>" +
	            (lloguer.aPagar() * EUROS_PER_UNITAT_DE_COST) + "€</td></tr>" + "\n";
	    }
    	resultat += "</table>\n";
    	return resultat;
    }
    public String composaPeuHTML() {
        return "<p>Import a pagar: <em>" + bonificacionsTotals() + "€</em></p>\n" + "<p>Punts guanyats: <em>" + bonificacionsTotals() + "</em></p>\n";
    }
    
}

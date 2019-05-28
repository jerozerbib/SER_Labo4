/*
 -----------------------------------------------------------------------------------
 Laboratoire : SER - Laboratoire 4 - xsl - xpath
 Fichier     : Pays.java
 Auteur(s)   : Jeremy Zerbib, Baptiste Hardrick, Mickael Bonjour
 Date        : 16/05/2019
 But         : Definition du pays selon les criteres de la donnee
 Remarque(s) :

 -----------------------------------------------------------------------------------
*/

public class Pays {
    private String nom, capitale, drapeau, continent, sousContinent;
    private int population;
    private double superficie;
    private Langages langages;

    public String getNom() {
        return nom;
    }

    public String getCapitale() {
        return capitale;
    }

    public String getDrapeau() {
        return drapeau;
    }

    public String getContinent() {
        return continent;
    }

    public String getSousContinent() {
        return sousContinent;
    }

    public int getPopulation() {
        return population;
    }

    public double getSuperficie() {
        return superficie;
    }

    public Langages getLangages() {
        return langages;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public void setDrapeau(String drapeau) {
        this.drapeau = drapeau;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSousContinent(String sousContinent) {
        this.sousContinent = sousContinent;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setLangages(Langages langages) {
        this.langages = langages;
    }
}

/*
 -----------------------------------------------------------------------------------
 Laboratoire : SER - Laboratoire 4 - xsl - xpath
 Fichier     : Langages.java
 Auteur(s)   : Jeremy Zerbib, Baptiste Hardrick, Mickael Bonjour
 Date        : 16/05/2019
 But         : Definition des langues parlees dans un pays, selon les criteres de la donnee
 Remarque(s) : Un exemple complet de balise est fourni ci-dessous

 -----------------------------------------------------------------------------------
*/


import java.util.ArrayList;

public class Langages {
    private ArrayList<String> nom;

    /**
     * Constructeurs des langues
     * @param nom nom des langues parlees
     */
    public Langages(ArrayList<String> nom) {
        this.nom = nom;
    }

    public ArrayList<String> getNom() {
        return nom;
    }
}

package extractClass_after;

public class Poulailler {
    int oeufsCollectes = 0;
    int nbPoules = 0;

    public Poulailler() {
    }

    public int getOeufsCollectes() {
        return oeufsCollectes;
    }

    public void setOeufsCollectes(int oeufsCollectes) {
        this.oeufsCollectes = oeufsCollectes;
    }

    public int getNbPoules() {
        return nbPoules;
    }

    public void setNbPoules(int nbPoules) {
        this.nbPoules = nbPoules;
    }

    void collecterOeuf() {
        oeufsCollectes += nbPoules * 2;
        System.out.println("Collecte d'oeuf dans le poulailler.");
    }
}
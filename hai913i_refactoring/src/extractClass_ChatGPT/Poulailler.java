package extractClass_ChatGPT;

// Nouvelle classe pour gérer la collecte d'œufs dans le poulailler
public class Poulailler {

    private int oeufsCollectes = 0;
    private int nbPoules = 0;

    public Poulailler(int nbPoules) {
        this.nbPoules = nbPoules;
    }

    public void collecterOeuf() {
        oeufsCollectes += nbPoules * 2;
        System.out.println("Collecte d'oeuf dans le poulailler.");
    }

    public int getOeufsCollectes() {
        return oeufsCollectes;
    }
}

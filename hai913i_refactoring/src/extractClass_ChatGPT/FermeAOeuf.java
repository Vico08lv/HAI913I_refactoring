package extractClass_ChatGPT;

public class FermeAOeuf {

    private int oeufsALaVente = 0;
    private int nbPoules = 0;
    private Poulailler poulailler; // Utilisation de la nouvelle classe

    public FermeAOeuf(int nbPoules) {
        this.nbPoules = nbPoules;
        this.poulailler = new Poulailler(nbPoules); // Initialisation du poulailler
    }

    public int getOeufsALaVente() {
        return oeufsALaVente;
    }

    public void setOeufsALaVente(int oeufsALaVente) {
        this.oeufsALaVente = oeufsALaVente;
    }

    public int getNbPoules() {
        return nbPoules;
    }

    public void setNbPoules(int nbPoules) {
        this.nbPoules = nbPoules;
        this.poulailler = new Poulailler(nbPoules); // Mise à jour du nombre de poules dans le poulailler
    }

    public void remplirStockOeufsAVendre() {
        poulailler.collecterOeuf(); // Utilisation de la méthode de collecte dans le poulailler
        oeufsALaVente += poulailler.getOeufsCollectes();
        System.out.println("Stock d'oeuf à la vente rempli. " + oeufsALaVente + " oeufs à la vente.");
    }

    public void vendreOeuf(int n) {
        if (n <= oeufsALaVente) {
            oeufsALaVente -= n;
            System.out.println("Vente de " + n + " oeufs. Plus que " + oeufsALaVente + " oeufs à la vente.");
        } else {
            System.out.println("Pas assez d'oeuf disponible. " + n + " oeufs demandés, mais seulement " + oeufsALaVente + " oeufs disponibles à la vente.");
        }
    }
}

package extractClass;

public class FermeAOeufBase {

    private int oeufsALaVente = 0;
    private int oeufsCollectes = 0;
    private int nbPoules = 0;


    public int getOeufsALaVente() {
        return oeufsALaVente;
    }

    public void setOeufsALaVente(int oeufsALaVente) {
        this.oeufsALaVente = oeufsALaVente;
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

    private void collecterOeuf(){
        oeufsCollectes += nbPoules * 2;
        System.out.println("Collecte d'oeuf dans le poulailler.");
    }

    public void remplirStockOeufsAVendre(){
        collecterOeuf();
        oeufsALaVente += oeufsCollectes;
        System.out.println("Stock d'oeuf à la vente rempli. " + oeufsALaVente + " oeufs à la vente.");
    }

    public void vendreOeuf(int n) {
        if (n <= oeufsALaVente) {
            oeufsALaVente -= n;
            System.out.println("Vente de " + n + " oeufs. Plus que " + oeufsALaVente + " oeufs à la vente.");
        } else {
            System.out.println("Pas assez d'oeuf disponible. " + n +" oeufs demandés, mais seulement " + oeufsALaVente + " oeufs disponibles à la vente.");
        }
    }

}

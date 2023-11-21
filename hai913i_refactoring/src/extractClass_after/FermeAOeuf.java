


package extractClass_after;

public class FermeAOeuf {

    private final Poulailler poulailler = new Poulailler();
    private int oeufsALaVente = 0;


    public int getOeufsALaVente() {
        return oeufsALaVente;
    }

    public void setOeufsALaVente(int oeufsALaVente) {
        this.oeufsALaVente = oeufsALaVente;
    }

    public int getOeufsCollectes() {
        return poulailler.getOeufsCollectes();
    }

    public void setOeufsCollectes(int oeufsCollectes) {
        poulailler.setOeufsCollectes(oeufsCollectes);
    }

    public int getNbPoules() {
        return poulailler.getNbPoules();
    }

    public void setNbPoules(int nbPoules) {
        poulailler.setNbPoules(nbPoules);
    }

    private void collecterOeuf(){
        poulailler.collecterOeuf();
    }

    public void remplirStockOeufsAVendre(){
        poulailler.collecterOeuf();
        oeufsALaVente += poulailler.getOeufsCollectes();
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

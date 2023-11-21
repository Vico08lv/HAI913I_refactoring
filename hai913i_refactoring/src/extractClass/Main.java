package extractClass;

public class Main {
    public static void main(String[] args) {


        FermeAOeufBase ferme = new FermeAOeufBase();
        ferme.setNbPoules(10);
        System.out.println("Nombre d'oeufs disponibles à la vente : " + ferme.getOeufsALaVente());
        ferme.vendreOeuf(10);
        ferme.remplirStockOeufsAVendre();
        System.out.println("Nombre d'oeufs disponibles à la vente : " + ferme.getOeufsALaVente());
        ferme.vendreOeuf(30);
        ferme.vendreOeuf(15);

    }
}

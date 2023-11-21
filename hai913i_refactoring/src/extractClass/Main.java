package extractClass;

public class Main {
    public static void main(String[] args) {


        //Créé une ferme à oeufs
        FermeAOeufBase ferme = new FermeAOeufBase();

        //Ajoute des poules dans la ferme
        ferme.setNbPoules(10);

        System.out.println("Nombre d'oeufs disponibles à la vente : " + ferme.getOeufsALaVente());

        //Vente de 10 oeufs
        ferme.vendreOeuf(10);

        //Remplir le stock d'oeufs à vendre
        ferme.remplirStockOeufsAVendre();

        System.out.println("Nombre d'oeufs disponibles à la vente : " + ferme.getOeufsALaVente());

        //Vente de 30 oeufs et de 15 oeufs
        ferme.vendreOeuf(30);
        ferme.vendreOeuf(15);

    }
}

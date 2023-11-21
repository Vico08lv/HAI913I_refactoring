package extractClass_after;


/**
 * Resultat : Extraction de classe fonction
 * il extrait les methods et attributs dans ma nouvelle classe poulailler
 * Il tranforme les méthodes dans FermeAOeuf en fonction de l'utilisation dans le main
 */
public class Main {
    public static void main(String[] args) {


        //Créé une ferme à oeufs
        FermeAOeuf ferme = new FermeAOeuf();

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

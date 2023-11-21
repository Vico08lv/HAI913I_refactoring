package pushDown_after;

public class MainFerme {

    /**
     * Default : la méthode pondre dans Animal est spécifique à Poule
     */

    /*
    Le main fonctionne de la même façon.
    La méthode pondre a été push down aux sous classes de Animal
    - à la classe Poule qui utilise la méthode pondre
    - à la classe Vache qui ne l'utilise pas...
    Le refactoring n'a donc pas push down dans les seules sous classes qui implémentent cette méthode.
    */

    public static void main(String[] args) {
        Vache vache = new Vache();
        vache.brouter();
        vache.vivre();

        Poule poule = new Poule();
        poule.aPondu();
        poule.vivre();
    }

}

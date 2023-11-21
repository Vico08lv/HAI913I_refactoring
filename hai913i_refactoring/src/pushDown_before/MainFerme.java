package pushDown_before;

public class MainFerme {

    /**
     * Default : la méthode pondre dans Animal est spécifique à Poule
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

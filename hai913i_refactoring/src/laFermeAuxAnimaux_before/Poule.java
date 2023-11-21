package laFermeAuxAnimaux_before;

public class Poule extends Animal{


    private Oeuf oeuf;


    
    
    

    public void aPondu()
    {
        oeuf = pondre(Calibre.M);
        System.out.println("cocorico");
    }


    @Override
    public void vivre() {
        System.out.println("Super");
    }
}

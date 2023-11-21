package laFermeAuxAnimaux_before;

public class Vache extends Animal {


    public void brouter()
    {
        System.out.println("miam");
    }


    @Override
    public void vivre() {
        System.out.println("merci");
    }
}

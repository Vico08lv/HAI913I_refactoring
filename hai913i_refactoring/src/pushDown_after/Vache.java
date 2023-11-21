package pushDown_after;

public class Vache extends Animal {


    public void brouter()
    {
        System.out.println("miam");
    }


    @Override
    public void vivre() {
        System.out.println("merci");
    }

    public Oeuf pondre(Calibre calibre)
    {
        return new Oeuf(calibre);
    }
}

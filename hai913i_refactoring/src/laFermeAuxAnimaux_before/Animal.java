package laFermeAuxAnimaux_before;

public abstract  class Animal {

    public abstract void vivre();



    public Oeuf pondre(Calibre calibre)
    {
        return new Oeuf(calibre);

    }

}

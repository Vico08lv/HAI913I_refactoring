package extractInterface_IDE;

class ListeTableau implements IListeTableau {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object get(int i) {return null;}
    private void secretLT(){}
    public static void staticLT() {}
    int nbLT;
}
class ListeChainee implements IListeChainee {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object get(int i) {return null;}
    @Override
    public Object peek() {return null;}
    @Override
    public Object poll() {return null;}
    private void secretLC(){}
}
class QueueDoubleEntree implements IQueueDoubleEntree {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object peek() {return null;}
    @Override
    public Object poll() {return null;}
    private void secretQDE(){}
}
class QueueAvecPriorite implements IQueueAvecPriorite {
    @Override
    public boolean add(Object o) {return true;}
    @Override
    public boolean isEmpty() {return true;}
    @Override
    public Object peek() {return null;}
    @Override
    public Object poll() {return null;}
    public Object comparator() {return null;}
    private void secretQAP(){}
}
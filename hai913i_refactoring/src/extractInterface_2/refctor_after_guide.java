//package extractInterface_2;
//
////e vais te guider get ne dois pas etre dans queue donc les methodes de la'interface la plus haute contient les methodes commune a tous
//
//
//package extractInterface_2;
//
//public interface IBaseList {
//    boolean add(Object o);
//    boolean isEmpty();
//}
//
//public interface IListe extends IBaseList {
//    Object get(int i);
//}
//
//public interface IListeChainee extends IListe {
//    Object peek();
//    Object poll();
//}
//
//public interface IQueue extends IBaseList {
//    Object peek();
//    Object poll();
//}
//
//public interface IQueueWithPriority extends IQueue {
//    Object comparator();
//}
//package extractInterface_2;
//
//public class ListeTableau implements IListe {
//    @Override
//    public boolean add(Object o) { return true; }
//    @Override
//    public boolean isEmpty() { return true; }
//    @Override
//    public Object get(int i) { return null; }
//    private void secretLT() {}
//    public static void staticLT() {}
//    int nbLT;
//}
//
//public class ListeChainee implements IListeChainee {
//    @Override
//    public boolean add(Object o) { return true; }
//    @Override
//    public boolean isEmpty() { return true; }
//    @Override
//    public Object get(int i) { return null; }
//    @Override
//    public Object peek() { return null; }
//    @Override
//    public Object poll() { return null; }
//    private void secretLC() {}
//}
//
//public class QueueDoubleEntree implements IQueue {
//    @Override
//    public boolean add(Object o) { return true; }
//    @Override
//    public boolean isEmpty() { return true; }
//    @Override
//    public Object peek() { return null; }
//    @Override
//    public Object poll() { return null; }
//    private void secretQDE() {}
//}
//
//public class QueueAvecPriorite implements IQueueWithPriority {
//    @Override
//    public boolean add(Object o) { return true; }
//    @Override
//    public boolean isEmpty() { return true; }
//    @Override
//    public Object peek() { return null; }
//    @Override
//    public Object poll() { return null; }
//    @Override
//    public Object comparator() { return null; }
//    private void secretQAP() {}
//}

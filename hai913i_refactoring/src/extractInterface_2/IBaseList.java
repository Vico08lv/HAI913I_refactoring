//package extractInterface_2;
//
//public interface IBaseList {
//    boolean add(Object o);
//    boolean isEmpty();
//    Object get(int i);
//}
//
//public interface IListeTableau extends IBaseList {
//    // Ajoutez des méthodes spécifiques à IListeTableau si nécessaire
//}
//
//public interface IListeChainee extends IBaseList {
//    Object peek();
//    Object poll();
//    // Ajoutez des méthodes spécifiques à IListeChainee si nécessaire
//}
//
//public interface IQueue extends IBaseList {
//    Object peek();
//    Object poll();
//    // Ajoutez des méthodes spécifiques à IQueue si nécessaire
//}
//
//public interface IQueueWithPriority extends IQueue {
//    Object comparator();
//    // Ajoutez des méthodes spécifiques à IQueueWithPriority si nécessaire
//}
//
//
//public class ListeTableau implements IListeTableau {
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
//    public Object get(int i) { return null; }
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
//    public Object get(int i) { return null; }
//    @Override
//    public Object peek() { return null; }
//    @Override
//    public Object poll() { return null; }
//    @Override
//    public Object comparator() { return null; }
//    private void secretQAP() {}
//}
//

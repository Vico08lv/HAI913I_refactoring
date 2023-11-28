package extractInterface_IDE;

public interface IListeChainee {
    boolean add(Object o);

    boolean isEmpty();

    Object get(int i);

    Object peek();

    Object poll();
}

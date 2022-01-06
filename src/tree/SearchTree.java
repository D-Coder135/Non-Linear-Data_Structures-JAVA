package tree;

public interface SearchTree<E> {
    boolean add(E item);

    boolean contains(E target);

    E find(E target);
}

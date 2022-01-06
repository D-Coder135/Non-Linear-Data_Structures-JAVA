package trees.binarySearchTree.implementation;

import trees.SearchTree;
import trees.binaryTree.implementation.BinaryTree;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E> {

    /**
     * Starter method find.
     * pre: The target object must implement the Comparable interface.
     *
     * @param target The Comparable object being sought
     * @return The object, if found, otherwise null
     */
    @Override
    public E find(E target) {
        return find(root, target);
    }

    /**
     * Recursive find method.
     *
     * @param localRoot The local subtree's root
     * @param target    The object being sought
     * @return The object, if found, otherwise null
     */
    private E find(Node<E> localRoot, E target) {
        if (localRoot == null) {
            return null;
        }
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public boolean contains(E target) {
        return false;
    }

    @Override
    public E delete(E target) {
        return null;
    }

    @Override
    public boolean remove(E target) {
        return false;
    }
}

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

        // Compare the target with the data field at the root.
        int compResult = target.compareTo(localRoot.data);
        if (compResult == 0) {
            return localRoot.data;
        } else if (compResult < 0) {
            return find(localRoot.left, target);
        } else {
            return find(localRoot.right, target);
        }
    }

    /**
     * Starter method add.
     * pre: The object to insert must implement the
     * Comparable interface.
     *
     * @param item The object being inserted
     * @return true if the object is inserted, false
     * if the object already exists in the tree
     */

    @Override
    public boolean add(E item) {
        boolean addReturn = false;
        root = add(root, item, addReturn);
        return addReturn;
    }

    /**
     * Recursive add method.
     * post: The data field addReturn is set true if the item is added to
     * the tree, false if the item is already in the tree.
     *
     * @param localRoot The local root of the subtree
     * @param item      The object to be inserted
     * @return The new local root that now contains the
     * inserted item
     */
    private Node<E> add(Node<E> localRoot, E item, boolean addReturn) {
        if (localRoot == null) {
            // item is equal to localRoot.data
            addReturn = true;
            return new Node<>(item);
        } else if (item.compareTo(localRoot.data) == 0) {
            // item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        }
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

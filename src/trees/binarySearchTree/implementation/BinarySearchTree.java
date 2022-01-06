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
        } else if (item.compareTo(localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left = add(localRoot.left, item, addReturn);
            return localRoot;
        } else {
            // item is greater than localRoot.data
            localRoot.right = add(localRoot.right, item, addReturn);
            return localRoot;
        }
    }

    @Override
    public boolean contains(E target) {
        return false;
    }

    /**
     * Starter method delete.
     * post: The object is not in the tree.
     *
     * @param target The object to be deleted
     * @return The object deleted from the tree
     * or null if the object was not in the tree
     * @throws ClassCastException if target does not implement
     *                            Comparable
     */

    @Override
    public E delete(E target) {
        E deleteReturn = null;
        root = delete(root, target, deleteReturn);
        return deleteReturn;
    }

    /**
     * Recursive delete method.
     * post: The item is not in the tree;
     * deleteReturn is equal to the deleted item
     * as it was stored in the tree or null
     * if the item was not found.
     *
     * @param localRoot The root of the current subtree
     * @param item      The item to be deleted
     * @return The modified local root that does not contain
     * the item
     */

    private Node<E> delete(Node<E> localRoot, E item, E deleteReturn) {
        if (localRoot == null) {
            // item is not in the tree
            deleteReturn = null;
            return localRoot;
        }

        // Search for item to delete
        int compResult = item.compareTo(localRoot.data);
        if (compResult < 0) {
            // item is smaller than localRoot.data
        }
        return null;
    }

    @Override
    public boolean remove(E target) {
        return false;
    }
}

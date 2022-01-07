package trees.avlTree.implementation;

import trees.avlTree.BinarySearchTreeWithRotate;
import trees.avlTree.avlNode.AVLNode;

public class AVLTree<E extends Comparable<E>> extends BinarySearchTreeWithRotate<E> {

    public boolean increase;

    /**
     * add starter method.
     *
     * @param item The item being inserted.
     * @return true if the object is inserted; false
     * if the object already exists in the tree
     * @throws ClassCastException if item is not Comparable
     * @pre the item to insert implements the Comparable interface.
     */
    @Override
    public boolean add(E item) {
        increase = false;
        root = add((AVLNode<E>) root, item);
        return addReturn;
    }

    /**
     * Recursive add method. Inserts the given object into the tree.
     *
     * @param localRoot The local root of the subtree
     * @param item      The object to be inserted
     * @return The new local root of the subtree with the item inserted
     * @post addReturn is set true if the item is inserted,
     * false if the item is already in the tree.
     */
    private AVLNode<E> add(AVLNode<E> localRoot, E item) {
        if (localRoot == null) {
            addReturn = true;
            increase = true;
            return new AVLNode<>(item);
        }

        if (item.compareTo(localRoot.data) == 0) {
            // Item is already in the tree.
            increase = false;
            addReturn = false;
            return localRoot;
        } else if (item.compareTo(localRoot.data) < 0) {

        }
    }
}

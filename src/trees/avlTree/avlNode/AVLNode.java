package trees.avlTree.avlNode;

import trees.binaryTree.implementation.BinaryTree;

/**
 * Class to represent an AVL Node. It extends the
 * BinaryTree.Node by adding the balance field.
 */

public class AVLNode<E> extends BinaryTree.Node<E> {

    public static final int LEFT_HEAVY = -1;

    public static final int BALANCED = 0;

    public static final int RIGHT_HEAVY = 1;

    private int balance;

    /**
     * Construct a node with the given item as the data field.
     *
     * @param item The data field
     */
    public AVLNode(E item) {
        super(item);
    }

    /** add starter method.
     @pre the item to insert implements the Comparable interface.
     @param item The item being inserted.
     @return true if the object is inserted; false
     if the object already exists in the tree
     @throws ClassCastException if item is not Comparable
     */

    /**
     * Return a string representation of this object.
     * The balance value is appended to the contents.
     *
     * @return String representation of this object
     */

    @Override
    public String toString() {
        return balance + ": " + super.toString();
    }
}

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

    /**
     * Construct a node with the given item as the data field.
     *
     * @param item The data field
     */
    public AVLNode(E item) {
        super(item);
    }
}

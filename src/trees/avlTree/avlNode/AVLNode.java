package trees.avlTree.avlNode;

import trees.binaryTree.implementation.BinaryTree;

/**
 * Class to represent an AVL Node. It extends the
 * BinaryTree.Node by adding the balance field.
 */

public class AVLNode<E> extends BinaryTree.Node<E> {

    /**
     * Construct a node with the given item as the data field.
     *
     * @param item The data field
     */
    public AVLNode(E item) {
        super(item);
    }
}

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
        return super.add(item);
    }
}

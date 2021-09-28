/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28/09/21
 *   Time: 9:08 PM
 *   File: Node.java
 */

package tree.binaryTree;

import java.io.Serializable;

/**
 * Class for a binary tree that stores type E objects.
 */
class BinaryTree<E> implements Serializable {

    /**
     * Class to encapsulate a tree node.
     */

    protected static class Node<E> implements Serializable {
        // Data Fields

        /**
         * The information stored in this node.
         */
        protected E data;

        /**
         * Reference to the left child.
         */
        protected BinaryTree<E> left;

        /**
         * Reference to the right child.
         */
        protected BinaryTree<E> right;

        // Constructors

        /**
         * Construct a node with given data and no children.
         *
         * @param data The data to store in this node.
         */
        public Node(E data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // Methods

        /**
         * Return a string representation of the node.
         *
         * @return A string representation of the data fields.
         */
        public String toString() {
            return data.toString();
        }
    }
}
/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 08/08/21
 *   Time: 9:52 PM
 *   File: Node.java
 */

package Tree.BinarySearchTree;

import java.util.Objects;

public class Node<E> {
    private Node<E> rightChild;
    private Node<E> leftChild;
    private E data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(getRightChild(), node.getRightChild()) && Objects.equals(getLeftChild(), node.getLeftChild()) && Objects.equals(getData(), node.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRightChild(), getLeftChild(), getData());
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node(E data) {
        this.data = data;
    }

    public Node() {
    }
}

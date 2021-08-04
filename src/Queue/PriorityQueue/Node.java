/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:21 PM
 *   File: Node.java
 */

package Queue.PriorityQueue;

public class Node<E> {
    E data;
    int priority;
    Node<E> next;

    public Node(E data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

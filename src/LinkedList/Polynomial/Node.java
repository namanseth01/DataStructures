/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:05 PM
 *   File: Node.java
 */

package LinkedList.Polynomial;

public class Node {
    int coefficient;
    int exponent;
    Node next;

    public Node( int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}

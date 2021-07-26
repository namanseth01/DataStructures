/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:06 PM
 *   File: Main.java
 */

package LinkedList.Polynomial;

public class Main {
    public static void main(String[] args) {
        LinkedList polynomial = new LinkedList();
        polynomial.insertAtBeginning(-1,4);
        polynomial.insertAtLast(2,1);
        polynomial.insertAtLast(3,0);
        polynomial.display();
        LinkedList polynomial2 = new LinkedList();
        polynomial2.insertAtLast(1,2);
        polynomial2.insertAtLast(-2,1);
        polynomial2.insertAtLast(-4,0);
        polynomial2.display();
        LinkedList addedPolynomial = polynomial.addPolynomial(polynomial2);
        addedPolynomial.display();
    }
}

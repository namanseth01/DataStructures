/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:18 PM
 *   File: Main.java
 */

package Queue.ByLinkedList;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        System.out.println();
        System.out.println("+++++++++++++++++++");
        queue.dequeue();
        queue.display();
        queue.peek();
        queue.enqueue(6);
        queue.display();
        System.out.println();
        System.out.println("+++++++++++++");
        queue.enqueue1(2);
        queue.enqueue1(8);
        queue.display();
        System.out.println();
        System.out.println("++++++++++++++++++");
        queue.dequeue1();
        queue.display();
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:16 PM
 *   File: Main.java
 */

package Queue.ByArray;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.display();
        System.out.println();
        System.out.println("=================");
        queue.enqueue(5);
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.peek();
    }
}

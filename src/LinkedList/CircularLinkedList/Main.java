/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:04 PM
 *   File: Main.java
 */

package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtBeginning(1);
        list.insertAtLast(2);
        list.insertAtBeginning(3);
        list.display();
        System.out.println("---------------");
        list.deleteAtBeginning();
        list.deleteAtLast();
        list.display();
        System.out.println("-----------------");
        list.insertAtLast(10);
        list.display();
    }
}

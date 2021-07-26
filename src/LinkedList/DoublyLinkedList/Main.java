/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:00 PM
 *   File: Main.java
 */

package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtLast(50);
        list.insertAtLast(40);
        list.insertAtLast(30);
        System.out.println("=============");
        list.displayInReverseOrder();
        System.out.println("=============");
        list.display();
        System.out.println("=============");
        list.insertAtPosition(60,2);
        list.display();
        System.out.println("=============");
        list.insertAtPosition(80,1);
        list.display();
        System.out.println("=============");
        list.insertAtPosition(100,4);
        list.display();
    }
}

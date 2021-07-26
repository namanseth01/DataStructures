/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 6:43 PM
 *   File: Main.java
 */

package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtTop(1);
        list.insertAtTop(2);
        list.display();
        System.out.println("------------");
        list.insertAtLast(3);
        list.display();
        System.out.println("------------");
        System.out.println("No. of elements: " + list.getLength());
        System.out.println("------------");
        list.display();
        System.out.println("-------------");
        list.display();
        System.out.println("------------");
        System.out.println("No. of elements: " + list.getLength());
        System.out.println("--------------");
        list.deleteAtLast();
        list.display();
        System.out.println("--------------");
        list.deleteAtTop();
        list.display();
    }
}

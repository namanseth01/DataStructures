/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 09/08/21
 *   Time: 9:52 PM
 *   File: LinkedList.java
 */

package LinkedList.NumberAsLinkedList;

public class LinkedList {
    Node head;

    public void breakNumbers(int number){
        int temp = number;
        while(temp > 0){
            int digit = temp % 10;
            insertAtBeginning(digit);
            temp /= 10;
        }
        display();
    }

    private void insertAtBeginning(int data){
        if(head == null)
            head = new Node(data);
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    private void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

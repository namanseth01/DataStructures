/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 6:43 PM
 *   File: SinglyLinkedList.java
 */

package LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;

    public void insertAtTop(int data){
        if(head == null){
            head = new Node(data);
        }else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtLast(int data){
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = new Node(data);
    }

    public void deleteAtTop(){
        head = head.next;
    }

    public void deleteAtLast(){
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public int getLength(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            ++count;
        }
        return count;
    }

    public void display(){
        Node temp = head;
        int index = 1;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getHead(){
        return head;
    }
}


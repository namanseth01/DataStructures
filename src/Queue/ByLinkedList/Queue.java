/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:17 PM
 *   File: Queue.java
 */

package Queue.ByLinkedList;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) { //insert at last
        Node newNode = new Node(data);
        if(front == null) {
            front = newNode;
            rear = front;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() { //delete from front
        front = front.next;
    }

    public void enqueue1(int data) { //insert at front
        Node newNode = new Node(data);
        if(front == null) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
    }

    public void dequeue1(){ //delete from last
        Node temp = front;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        rear = temp;
        rear.next = null;
    }


    public void peek() {
        System.out.println(front.data);
    }

    public void display() {
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}

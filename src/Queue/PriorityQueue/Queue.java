/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:22 PM
 *   File: Queue.java
 */

package Queue.PriorityQueue;

public class Queue<E> {
    Node<E> head;

    public void insertAccordingToPriority(E data, int priority){
        if(head == null || head.priority < priority){
            Node<E> newNode = new Node<E>(data, priority);
            newNode.next = head;
            head = newNode;
            System.out.println("node inserted "+ priority);
        }else{
            Node<E> temp = head;
            Node<E> newNode = new Node<E>(data, priority);
            while (temp.next != null){
                if(temp.next.priority < priority){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    System.out.println("node inserted "+ priority);
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void peek(){
        System.out.println("data " + head.data + " priority : " + head.priority);
    }

    public void deQueue(){
        Node<E> temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = null;
    }


    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node<E> temp = head;
            while(temp != null){
                System.out.println("Data : " + temp.data + " priority : " + temp.priority + "\n");
                temp = temp.next;
            }
        }
    }
}


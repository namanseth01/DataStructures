/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:10 PM
 *   File: Stack.java
 */

package Stack.ByLinkedList;

public class Stack {
    Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push (int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Pushed...");
        }
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow...");
        } else {
            Node temp = top;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            System.out.println("Popped...");
        }
    }

    void deleteAtPosition(int position){
        if(position < getLength()){
            Node temp = top;
            int count = 0;
            while(count < position - 1){
                temp = temp.next;
                ++count;
            }
            temp.next = temp.next.next;
        }
    }

    public void peek() {
        System.out.println("Element at the top of stack: " + top.data);
    }

    public void display() {
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public int getLength() {
        int flag = 0;
        Node temp = top;
        while (temp != null) {
            flag++;
            temp = temp.next;
        }
        return flag;
    }
}

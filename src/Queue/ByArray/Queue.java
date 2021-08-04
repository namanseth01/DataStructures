/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:15 PM
 *   File: Queue.java
 */

package Queue.ByArray;

public class Queue {
    int[] numbers;
    int front;
    int rear;

    public Queue(int size) {
        numbers = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == -1) {
            numbers[front] = data;
            rear++;
        } else if (rear < numbers.length) {
            rear++;
            numbers[rear] = data;
        }
        System.out.println("Element inserted...");
    }

    public void dequeue() {
        if (rear == -1) {
            System.out.println("Empty...");
        } else {
            front++;
        }
        System.out.println("Element deleted...");
    }

    public void peek() {
        if (rear == -1) {
            System.out.println("Empty...");
        } else {
            System.out.println(numbers[front]);
        }
    }

    public void display() {
        for (int index = front; index <= rear ; index++) {
            System.out.print(numbers[index] + "->");
        }
    }
}

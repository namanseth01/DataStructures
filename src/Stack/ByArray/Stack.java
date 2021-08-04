/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:07 PM
 *   File: Stack.java
 */

package Stack.ByArray;

public class Stack {
    int[] numbers;
    int top = -1;

    public Stack(int size) {
        numbers = new int[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == numbers.length - 1);
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack Overflow...");
        } else {
            numbers[top + 1] = data;
            top++;
            System.out.println("Element inserted...");
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow...");
        } else {
            top--;

        }
    }

    public void peek() {
        System.out.println("Element at the top of Stack: " + numbers[top]);
    }

    public void display() {
        for (int number : numbers) {
            System.out.print(number + "->");
        }
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:11 PM
 *   File: Main.java
 */

package Stack.ByLinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println();
        System.out.println("------------------");
        stack.pop();
        stack.push(26);
        stack.push(58);
        stack.peek();
        stack.display();
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Length: " + stack.getLength());
        stack.deleteAtPosition(2);
        stack.display();
    }
}

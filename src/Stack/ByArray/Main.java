/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:08 PM
 *   File: Main.java
 */

package Stack.ByArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(7);
        Scanner scanner = new Scanner(System.in);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println();
        System.out.println("-------------------");
        stack.pop();
        stack.display();
        System.out.println();
        System.out.println("----------------------");
        stack.push(11);
        stack.push(12);
        stack.peek();
        System.out.println("-----------------------");
        stack.display();
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 09/08/21
 *   Time: 9:54 PM
 *   File: Main.java
 */

package LinkedList.NumberAsLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        LinkedList obj = new LinkedList();
        obj.breakNumbers(number);
    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:15 PM
 *   File: Main.java
 */

package LinkedList.LinearSearch;

public class Main {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(30);
        list.push(11);
        list.push(21);
        list.push(14);
        if (list.search(list.head, 2))
            System.out.println("Key value is present...");
        else
            System.out.println("Key value");
    }
}

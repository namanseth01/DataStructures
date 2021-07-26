/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 26/07/21
 *   Time: 9:11 PM
 *   File: LinkedList.java
 */

package LinkedList.LinearSearch;

public class LinkedList {
    Node head;
    public void push(int newData)
    {
        Node data = new Node(newData);
        data.next = head;
        head = data;
    }
    public boolean search(Node head, int x)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }
}

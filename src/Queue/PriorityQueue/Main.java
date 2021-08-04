/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 04/08/21
 *   Time: 9:23 PM
 *   File: Main.java
 */

package Queue.PriorityQueue;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<>();
        queue.insertAccordingToPriority(20, 5);
        queue.insertAccordingToPriority(50,4);
        queue.insertAccordingToPriority(60, 6);
        queue.insertAccordingToPriority(80, 1);
        queue.insertAccordingToPriority(100,2);
        queue.display();
    }
}

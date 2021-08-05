/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 05/08/21
 *   Time: 9:50 PM
 *   File: Main.java
 */

package Searching.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(7, arr1, arr1.length);
    }
}

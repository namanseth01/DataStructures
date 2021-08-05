/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 05/08/21
 *   Time: 9:46 PM
 *   File: Main.java
 */

package Searching.LinearSearch;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 34, 53, 534, 23, 21};
        LinearSearch<Integer> sequentialSearch = new LinearSearch<>();
        sequentialSearch.search(5, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        sequentialSearch.searchArray(12, arr);
    }
}

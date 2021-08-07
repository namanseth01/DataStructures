/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 07/08/21
 *   Time: 11:19 PM
 *   File: Main.java
 */

package Sorting.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 80, 60, 40, 20, 10};
        MergeSort.sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

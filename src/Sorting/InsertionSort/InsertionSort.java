/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 07/08/21
 *   Time: 11:14 PM
 *   File: InsertionSort.java
 */

package Sorting.InsertionSort;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else{
                    break;
                }
            }
        }
        return arr;
    }
}

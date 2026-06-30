//Check if an array is sorted (Strictly increasing)

package RECURSION;

import java.util.Scanner;

public class recursionEleven {
  public static boolean isSorted(int arr[], int idx) {
    if (idx == arr.length - 1) {
      return true;
    }

    if (arr[idx] < arr[idx + 1]) {
      // array is sorted till now
      return isSorted(arr, idx + 1);
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    // int arr[] = { 1, 2, 4, 8 };
    // System.out.println(isSorted(arr, 0));
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = obj.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elemnet of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = obj.nextInt();
    }
    System.out.println(isSorted(arr, 0));
  }
}

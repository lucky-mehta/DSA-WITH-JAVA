//Find the negattive element of the array with taking input through user.
package ARRAY.oneDimensions;

import java.util.Scanner;

public class fiveOneD {
  public static void main(String[] args) {
    int size;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    size = obj.nextInt();
    int[] arr = new int[size];

    // input
    System.out.println("Enter the element of the array:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = obj.nextInt();
    }
    // Output
    System.out.println("Negative element of the array is:");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}

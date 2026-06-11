//SUM OF THE GIVEN ELEMENT OF THE ARRAY WITH TAKING INPUT THROUGH THE USER.
package ARRAY.oneDimensions;

import java.util.Scanner;

public class sevenOneD {
  public static void main(String[] args) {
    int size;
    int sum = 0;
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
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Sum of the array element is:" + sum);

  }
}

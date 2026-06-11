// FIND THE LARGEST ELEMENT OF THE ARRAY WITH TAKING ARRAY FROM THE USER.
package ARRAY.oneDimensions;

import java.util.Scanner;

public class nineOneD {
  public static void main(String[] args) {
    int size;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    size = obj.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter the element of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = obj.nextInt();
    }

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Largest element of the array is:" + max);
  }
}

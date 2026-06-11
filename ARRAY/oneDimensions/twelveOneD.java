// FIND THE SMALLEST ELEMENT OF THE ARRAY WITH TAKING ARRAY FROM THE USER.
package ARRAY.oneDimensions;

import java.util.Scanner;

public class twelveOneD {
  public static void main(String[] args) {
    int size;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    size = obj.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter the element of the array:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = obj.nextInt();
    }

    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Smallest element of thr array is:" + min);
  }
}

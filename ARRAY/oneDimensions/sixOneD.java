//SUM OF THE GIVEN ELEMENT OF THE ARRAY WITHOUT TAKING INPUT.
package ARRAY.oneDimensions;

public class sixOneD {
  public static void main(String[] args) {
    int[] arr = { 4, 2, 43, 6, 8, 9, 1, 5 };
    System.out.println("Array element are given:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Sum of the given element of the array is:" + sum);
  }
}

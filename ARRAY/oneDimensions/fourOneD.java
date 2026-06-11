//FIND NEGATIVE ELEMENT IN THE ARRAY WITHOUT TAKING INPUT THROUGH USER.
package ARRAY.oneDimensions;

public class fourOneD {
  public static void main(String[] args) {
    int[] arr = { 46, 1, -5, -9, -8, 6, -3, 5 };
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        System.out.println(arr[i] + " ");
      }
    }
  }
}

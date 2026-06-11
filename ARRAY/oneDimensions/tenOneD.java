// FIND THE LARGEST ELEMENT OF THE ARRAY WITHOUT TAKING INPUT.
package ARRAY.oneDimensions;

public class tenOneD {
  public static void main(String[] args) {
    int[] arr = { 4, 8, 15, 16, 20, 3 };
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}

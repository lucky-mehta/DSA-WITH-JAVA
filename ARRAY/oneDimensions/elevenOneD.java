// FIND THE SMALLEST ELEMENT OF THE ARRAY WITHOUT TAKING ARRAY FROM THE USER.
package ARRAY.oneDimensions;

public class elevenOneD {
  public static void main(String[] args) {
    int[] arr = { 4, 6, -1, 40, 5, 50 };
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Smallest number of array is:" + min);
  }
}

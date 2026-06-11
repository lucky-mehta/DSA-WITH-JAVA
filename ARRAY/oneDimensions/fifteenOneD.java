//COUNT THE EVEN AND ODD ELEMENT IN THE ARRAY.
package ARRAY.oneDimensions;

public class fifteenOneD {
  public static void main(String[] args) {
    int[] arr = { 10, 15, 8, 7, 20 };
    int even = 0;
    int odd = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        even = even + 1;
      } else {
        odd = odd + 1;
      }
    }
    System.out.println("Even number is:" + even);
    System.out.println("Odd number is:" + odd);
  }
}

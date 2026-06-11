//MULTIPLICATION OF THE GIVEN ELEMENT OF THE ARRAY WITHOUT TAKING INPUT.
package ARRAY.oneDimensions;

public class eightOneD {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 3, 2 };
    int mul = 1;
    for (int i = 0; i < arr.length; i++) {
      mul = mul * arr[i];
    }
    System.out.println("Multiplication of array element is:" + mul);
  }

}

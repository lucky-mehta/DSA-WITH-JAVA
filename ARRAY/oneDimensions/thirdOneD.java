package ARRAY.oneDimensions;

// TAKE AN ARRAY AS INPUT FROM THE USER. SERACH FOR A GIVEN NUMBER X AND PRINT THE INDEX AT WHICH IT OCCURS.
import java.util.Scanner;

public class thirdOneD {
  public static void main(String[] args) {
    int size;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    size = obj.nextInt();
    int num[] = new int[size];

    // input
    System.out.println("Element of the array is:");
    for (int i = 0; i < size; i++) {
      num[i] = obj.nextInt();
    }
    System.out.println("element is:");
    int x = obj.nextInt();
    // output
    for (int i = 0; i < num.length; i++) {
      if (num[i] == x) {
        System.out.println("Found at index: " + i);
      }
    }
  }
}

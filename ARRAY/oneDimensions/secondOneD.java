package ARRAY.oneDimensions;

//WAP TO PRINT ARRAY ELEMENT WITH TAKING INPUT FROM USER.
import java.util.Scanner;

public class secondOneD {
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
    // output
    System.out.println("Array is:");
    for (int i = 0; i < size; i++) {
      System.out.print(num[i] + " ");
    }
  }
}

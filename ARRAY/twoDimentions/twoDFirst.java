package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDFirst {
  public static void main(String[] args) {
    int row, cols;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the row of the array:");
    row = obj.nextInt();
    System.out.println("Enter the column of the array:");
    cols = obj.nextInt();
    int[][] arr = new int[row][cols];

    System.out.println("Element are:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = obj.nextInt();
      }
    }

    System.out.println("Array is:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}

//TAKE A MATRIX AS INPUT FROM THE USER.SEARCH FOR A GIVEN NUMBER X AND PRINT THE INDICES AT WHICH IT OCCURS.
package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDSecond {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of rows:");
    int rows = obj.nextInt();
    System.out.println("Enter the value of column");
    int cols = obj.nextInt();
    int[][] arr = new int[rows][cols];

    System.out.println("Enter the element of rows and columns:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = obj.nextInt();
      }
    }

    System.out.println("Array is:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Enter the element:");
    int X = obj.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] == X) {
          System.out.println("X Found at index is (" + i + " , " + j + ")");
        }
      }
    }
  }
}

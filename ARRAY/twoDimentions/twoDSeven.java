package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDSeven {
  public static void main(String[] args) {
    int row, col;
    int sum = 0;

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter rows:");
    row = obj.nextInt();

    System.out.println("Enter columns:");
    col = obj.nextInt();

    int[][] arr = new int[row][col];

    System.out.println("Enter elements:");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = obj.nextInt();
      }
    }

    System.out.println("Array becomes:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum = sum + arr[i][j];
      }
    }

    System.out.println("Sum of array element is = " + sum);
  }
}

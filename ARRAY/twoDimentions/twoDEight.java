package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDEight {
  public static void main(String[] args) {
    int row, col;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter rows:");
    row = obj.nextInt();

    System.out.println("Enter columns:");
    col = obj.nextInt();

    int[][] a = new int[row][col];
    int[][] b = new int[row][col];
    int[][] sum = new int[row][col];

    System.out.println("Enter first matrix Element:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        a[i][j] = obj.nextInt();
      }
    }
    System.out.println("First Matrix is:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Enter second matrix Element:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        b[i][j] = obj.nextInt();
      }
    }
    System.out.println("Second Matrix is:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println();
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }

    System.out.println("Sum Matrix:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}

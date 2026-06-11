package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDthird {
  public static void main(String[] args) {
    int n, m;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the rows:");
    n = obj.nextInt();
    System.out.println("Enter the size of the column:");
    m = obj.nextInt();
    int[][] arr = new int[n][m];

    System.out.println("Enter the element of the array:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = obj.nextInt();
      }
    }

    System.out.println("Matrix becomes:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    // transpose
    System.out.println("Transpose of matrix is:");
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }
  }
}

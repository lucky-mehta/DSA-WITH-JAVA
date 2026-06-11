//FIND THE LARGEST ELEMENT OF THE ARRAY.

package ARRAY.twoDimentions;

import java.util.Scanner;

public class twoDFourth {
  public static void main(String[] args) {
    int n, m;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of the row:");
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
    System.out.println("Array becomes:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int max = arr[0][0];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
      }
    }
    System.out.println("Largest element of the array is:" + max);
  }
}

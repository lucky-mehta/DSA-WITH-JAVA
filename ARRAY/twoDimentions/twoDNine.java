//Without taking elemnet of the user.
package ARRAY.twoDimentions;

public class twoDNine {
  public static void main(String[] args) {
    int[][] arr = {
        { 2, 3, 4, 5, 6 },
        { 8, 7, 5, 6, 2 },
        { 1, 2, 3, 4, 5 }
    };

    System.out.println("Array becomes:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}

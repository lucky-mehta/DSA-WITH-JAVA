//PLACE TILES OF SIZE 1Xm IN A FLOOR OF SIZE nXm.

package RECURSION;

public class recursionNinteen {
  public static int placeTiles(int n, int m) {
    if (n == m) {
      return 2;

    }
    if (n < m) {
      return 1;
    }

    // vertically
    int verticallyPlacement = placeTiles(n - m, m);

    // horizontally
    int horizontalPlacement = placeTiles(n - 1, m);
    return verticallyPlacement + horizontalPlacement;
  }

  public static void main(String[] args) {
    int n = 4, m = 2;
    System.out.println(placeTiles(n, m));
  }
}

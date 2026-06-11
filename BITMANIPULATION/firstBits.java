//GET BIT
package BITMANIPULATION;

public class firstBits {
  public static void main(String[] args) {
    int n = 5;
    int position = 3;
    int bitMask = 1 << position;
    if ((bitMask & n) == 0) {
      System.out.println("BIT WAS ZERO");
    } else {
      System.out.println("BIT WAS ONE");
    }
  }
}

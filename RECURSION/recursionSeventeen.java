//PRINT ALL PERMUTATION OF A STRING.
package RECURSION;

public class recursionSeventeen {
  public static void printPerm(String str, String permutation) {
    if (str.length() == 0) {
      System.out.println(permutation);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(1 + i);
      printPerm(newStr, permutation + currChar);
    }
  }

  public static void main(String[] args) {
    String str = "abcd";
    printPerm(str, "");
  }
}

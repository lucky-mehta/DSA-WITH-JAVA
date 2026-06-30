//Remove duplicates in a string
package RECURSION;

public class recursionThirteen {
  public static boolean[] map = new boolean[26];

  public static void removeDupblicate(String str, int idx, String newString) {
    if (idx == str.length()) {
      System.out.println(newString);
      return;
    }
    char currChar = str.charAt(idx);
    if (map[currChar - 'a']) {
      removeDupblicate(str, idx + 1, newString);
    } else {
      newString += currChar;
      map[currChar - 'a'] = true;
      removeDupblicate(str, idx + 1, newString);
    }
  }

  public static void main(String[] args) {
    String str = "abbccda";
    removeDupblicate(str, 0, "");
  }
}

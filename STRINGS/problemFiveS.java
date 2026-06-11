// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

package STRINGS;

public class problemFiveS {
  public static void main(String[] args) {
    String original = "eabcdef";
    String result = "";
    for (int i = 0; i < original.length(); i++) {
      char ch = original.charAt(i);
      if (ch == 'e') {
        result = result + i;
      } else {
        result = result + ch;
      }
    }
    System.out.println(result);

  }
}

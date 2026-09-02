package STACK;

import java.util.*;

public class balenceBracket {
  public static boolean isBalence(String str) {
    Stack<Character> st = new Stack<>();
    int n = str.length();
    for (int i = 0; i < n; i++) {
      char ch = str.charAt(i);
      if (ch == '(') {
        st.push(ch);
      } else { // ch==')'
        if (st.size() == 0) {
          return false;
        }
        if (st.peek() == '(') {
          st.pop();
        }
      }
    }
    if (st.size() > 0)
      return false;
    else
      return true;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    System.out.println(isBalence(str));
  }
}

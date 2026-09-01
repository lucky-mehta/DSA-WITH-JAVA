package STACK;

import java.util.*;

public class recursionDisStack {

  public static void displayRec(Stack<Integer> st) {
    if (st.size() == 0) {
      return;
    }
    int top = st.pop();
    System.out.println(" " + top);
    displayRec(st);
    st.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    displayRec(st);
  }
}

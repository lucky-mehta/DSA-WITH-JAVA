package STACK;

import java.util.Stack;

public class insertIdx {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(12);
    st.push(20);
    st.push(25);
    st.push(35);
    st.push(40);
    System.out.println(st);

    int idx = 2;
    int x = 30;
    Stack<Integer> rt = new Stack<>();
    while (st.size() > idx) {
      rt.push(st.pop());
    }
    st.push(x);
    while (rt.size() > 0) {
      st.push(rt.pop());
    }
    System.out.println(st);

  }
}

package STACK;

import java.util.Stack;

public class firstStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(20);
    st.push(25);
    st.push(30);
    st.push(35);
    System.out.println(st);
    st.pop();
    System.out.println(st);
    st.pop();
    System.out.println(st);
    System.out.println("Size is:" + st.size());
  }
}

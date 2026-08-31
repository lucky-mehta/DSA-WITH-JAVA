//copy stack

package STACK;

import java.util.Stack;

public class thirdStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(15);
    st.push(25);
    st.push(30);
    st.push(35);
    System.out.println(st); // 10,15,25,30,35

    // reverse

    Stack<Integer> gt = new Stack<>();
    while (st.size() > 0) {
      gt.push(st.pop());
    } // 35,30,25,15,10

    Stack<Integer> rt = new Stack<>();
    while (gt.size() > 0) {
      rt.push(gt.pop());
    }
    System.out.println(rt); // 10,15,25,30,35
  }
}

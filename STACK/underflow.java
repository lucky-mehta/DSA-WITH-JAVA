//Underflow-Stack is empty,when we try to pop and peek the element then stack generate the error....that is all about of underflow condition of the stack

package STACK;

import java.util.Stack;

public class underflow {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    System.out.println(st); // 10,20,30,40,50,60
    st.pop();
    System.out.println(st); // 10,20,30,40,50
    st.pop();
    System.out.println(st); // 10,20,30,40
    st.pop();
    System.out.println(st); // 10,20,30
    st.pop();
    System.out.println(st); // 10,20
    st.pop();
    System.out.println(st); // 10
    st.pop();
    System.out.println(st); // Stack is empty
    st.pop(); // then generate the error
    System.out.println(st);
  }
}

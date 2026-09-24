package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class basicCollectionWork {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.size());
    System.out.println(q);
    q.remove();
    System.out.println(q); // poll and remove are same
    q.poll();
    System.out.println(q);
    System.out.println(q.peek()); // peek and eleemnt are same
    System.out.println(q.element());
    System.out.println(q.size());
  }
}

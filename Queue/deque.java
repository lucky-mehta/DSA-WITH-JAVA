//double circular queue
package Queue;

import java.util.*;

public class deque {
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();
    // dq.addLast(1);
    // dq.addLast(2);
    // dq.addLast(3);
    // dq.addLast(4);
    // System.out.println(dq);
    // dq.addFirst(5);
    // System.out.println(dq);
    // dq.removeLast();
    // System.out.println(dq);
    // dq.removeFirst();
    // System.out.println(dq);
    // System.out.println(dq.getFirst());
    // System.out.println(dq.getLast());

    dq.addLast(1);
    dq.addLast(2);
    dq.addLast(3);
    dq.addLast(4);
    dq.addLast(5);
    dq.add(6); // last add
    dq.remove(); // first remove
    dq.removeAll(dq); // remove everything
    System.out.println(dq);
  }
}

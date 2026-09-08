package STACK;

public class linkedlistImplementation {
  public static class Node { // user defined data type
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class LLStack { // user defined data structure
    private Node head = null;
    private int size = 0;

    void push(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
      size++;
    }

    int pop() {
      if (head == null) {
        System.out.println("Stck is empty!");
        return -1;
      }
      int x = head.data;
      head = head.next;
      return x;
    }

    int peek() {
      if (head == null) {
        System.out.println("Stack is empty!");
        return -1;
      }
      return head.data;
    }

    void displayrec(Node h) {
      if (h == null) {
        return;
      }
      displayrec(h.next);
      System.out.print(" " + h.data);
    }

    void display() {
      displayrec(head);
      System.out.println();
    }

    void displayRev() {
      Node temp = head;
      while (temp != null) {
        System.out.print(" " + temp.data);
        temp = temp.next;
      }
      System.out.println();
    }

    int size() { // getter
      return size;
    }

    boolean isEmpty() {
      if (size == 0) {
        return true;
      } else {
        return false;
      }
    }

  }

  public static void main(String[] args) {
    LLStack st = new LLStack();
    st.push(10);
    st.display();
    st.push(15);
    st.display();
    st.push(20);
    st.push(25);
    st.push(30);
    st.display();
    System.out.println(st.isEmpty());
    System.out.println(st.size());
  }
}

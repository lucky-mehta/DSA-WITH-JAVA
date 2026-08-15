package LINKEDLIST;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class secondList {
  public static void main(String[] args) {
    Node a = new Node(15);
    Node b = new Node(25);
    Node c = new Node(35);
    Node d = new Node(45);
    Node e = new Node(55);
    Node f = new Node(65);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    // System.out.println(a.data);
    // System.out.println(a.next.data);
    // System.out.println(a.next.next.data);
    // System.out.println(a.next.next.next.data);
    // System.out.println(a.next.next.next.next.data);
    // System.out.println(a.next.next.next.next.next.data);

    // We can use instead of this.

    Node temp = a;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

//Basics using recursion

package LINKEDLIST;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class fourthList {
  public static void displayr(Node head) {
    Node temp = head;
    if (temp == null) {
      return;
    }
    System.out.print(temp.data + " ");
    displayr(temp.next);
  }

  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(25);
    Node d = new Node(35);

    a.next = b;
    b.next = c;
    c.next = d;

    displayr(a);

  }
}

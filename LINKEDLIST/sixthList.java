//IMPLEMENT A METHOD TO FIND OUT THE LENGTH OF A LINKEDLIST(ITERATIVE AND RECURSIVE)
package LINKEDLIST;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class sixthList {

  // recursion

  public static void displayr(Node head) {
    Node temp = head;
    if (temp == null) {
      return;
    }
    System.out.print(temp.data + " ");
    displayr(temp.next);
  }

  // Length

  public static int length(Node head) {
    Node temp = head;
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static void main(String[] args) {
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);
    Node f = new Node(60);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    displayr(a); // calling displayr
    System.out.println();
    System.out.print("The lenght of the given linkedlist is : " + length(a));
  }
}

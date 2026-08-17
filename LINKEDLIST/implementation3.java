//INSERT ELEMENT IN LINKEDLIST AT ANY INDEX.
package LINKEDLIST;

public class implementation3 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static class linkedlist {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
    }

    void insertAtBegnning(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        tail = temp;

      } else {
        temp.next = head;
        head = temp;
      }
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

    void insertAtAny(int idx, int val) {
      Node t = new Node(val);
      Node temp = head;
      if (idx == size()) {
        insertAtEnd(val);
        return;
      } else if (idx == 0) {
        insertAtBegnning(val);
        return;
      } else if (idx < 0 || idx > size()) {
        System.out.println("Wrong Answer");
        return;
      }
      for (int i = 0; i < idx - 1; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
    }

    int size() {
      Node temp = head;
      int count = 0;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;

    }

  }

  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.insertAtEnd(10);
    ll.insertAtEnd(15);
    ll.insertAtEnd(20);
    ll.insertAtEnd(25);
    ll.display();
    System.out.println();
    // ll.insertAtAny(2, 18);
    // ll.display();
    // System.out.println();
    // ll.insertAtAny(4, 40);
    // ll.display();
    // System.out.println();
    // System.out.println(ll.tail.data);
    // System.out.println(ll.head.data);
    // System.out.println();
    // ll.insertAtAny(0, 100);
    // ll.display();
    // System.out.println();
    // System.out.println(ll.head.data);
    // System.out.println();
    ll.insertAtAny(10, 200);
    ll.display();

  }
}

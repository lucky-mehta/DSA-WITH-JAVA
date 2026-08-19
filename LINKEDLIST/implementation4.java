package LINKEDLIST;

public class implementation4 {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static class Linkedlist {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

    int getAtElement(int idx) {
      if (idx < 0 || idx > size) {
        System.out.println("Wrong Answer");
        return -1;
      }
      Node temp = head;
      for (int i = 1; i <= idx; i++) {
        temp = temp.next;
      }
      return temp.data;
    }

    // int size() {
    // Node temp = head;
    // int count = 0;
    // while (temp != null) {
    // count++;
    // temp = temp.next;
    // }
    // return count;
    // }

    public static void main(String[] args) {
      Linkedlist ll = new Linkedlist();
      ll.insertAtEnd(28);
      ll.insertAtEnd(20);
      ll.insertAtEnd(25);
      ll.insertAtEnd(55);

      ll.display();
      System.out.println();
      System.out.println(ll.size);
      System.out.println();
      System.out.println(ll.getAtElement(3));
    }

  }
}

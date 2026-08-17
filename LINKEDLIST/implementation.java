package LINKEDLIST;

public class implementation {
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

    void insertAtEnd(int val) { // Using inserting linkedlist element
      Node temp = new Node(val);

      if (head == null) {
        head = temp;
        // tail=temp;
      } else {
        tail.next = temp;
        // tail = temp;
      }
      tail = temp;
    }

    void display() { // Using displaying linkedlist element
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
    }

    int size() { // Using calculating size/length of the linkedlist
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
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.insertAtEnd(7);
    ll.insertAtEnd(8);
    ll.display();
    System.out.println();
    System.out.println("LENGTH OF LINKEDLIST IS:" + ll.size());

  }

}

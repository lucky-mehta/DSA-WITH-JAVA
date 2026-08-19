//Implementation a method to insert a node at the start of a linkedlist.
package LINKEDLIST;

public class implementation2 {
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

    void insertAtBegnning(int val) {
      Node temp = new Node(val);
      if (head == null) { // For empty list,we can apply another logic....jaise...insertAtEnd();.....but u
                          // rememmber that program me ye method hona bhi chahiye...
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
    ll.insertAtBegnning(10);
    ll.insertAtBegnning(15);
    ll.insertAtBegnning(25);
    ll.display();
    System.out.println();
    System.out.println("Length of the linkedlist is:" + ll.size());
  }
}

package LINKEDLIST;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class firstList {
  public static void main(String[] args) {

    Node first = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(50);
    Node fifth = new Node(60);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    System.out.println(first.data);
    System.out.println(second.data);
    System.out.println(third.data);
    System.out.println(fourth.data);
    System.out.println(fifth.data);
  }
}
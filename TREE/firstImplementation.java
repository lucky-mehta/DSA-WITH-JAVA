package TREE;

public class firstImplementation {
  public static class Node {
    int data; // By default 0
    Node left; // By default value null
    Node right; // By default value null

    public Node(int data) {
      this.data = data;
    }

  }

  public static void display(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " -> ");
    if (root.left != null) {
      System.out.print(root.left.data + ",  ");
    } else {
      System.out.print("n, ");
    }
    if (root.right != null) {
      System.out.print(root.right.data + " ");
    } else {
      System.out.print("n");
    }
    System.out.println();
    display(root.left);
    display(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(2);
    Node a = new Node(4);
    Node b = new Node(10);
    root.left = a;
    root.right = b;
    Node c = new Node(6);
    Node d = new Node(5);
    a.left = c;
    a.right = d;
    Node e = new Node(11);
    b.right = e;
    display(root);

  }
}

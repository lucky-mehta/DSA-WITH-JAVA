package ARRAYLIST;

import java.util.ArrayList;

public class arrayList4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.set(2, 35);
    System.out.println(list);
  }
}

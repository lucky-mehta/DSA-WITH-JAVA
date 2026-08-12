package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    // add elements
    list.add(10);
    list.add(5);
    list.add(2);
    System.out.println(list);

    // get elements
    int element = list.get(0);
    System.out.println(element);

    // add element in between
    list.add(1, 4);
    System.out.println(list);

    // set element
    list.set(0, 15);
    System.out.println(list);

    // delete element
    list.remove(1);
    System.out.println(list);

    // size
    int size = list.size();
    System.out.println(size);

    // loops
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println();

    // sorting
    Collections.sort(list);
    System.out.println(list);
  }
}

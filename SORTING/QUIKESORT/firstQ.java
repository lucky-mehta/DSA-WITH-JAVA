package SORTING.QUIKESORT;

import java.util.Scanner;

public class firstQ {
  public static void quickSort(int[] arr, int lb, int ub) {
    if (lb < ub) {
      int loc = partition(arr, lb, ub);
      quickSort(arr, lb, loc - 1); // ye left part ko sort krne ke liye
      quickSort(arr, loc + 1, ub); // ye right part ko
    }
  }

  public static int partition(int[] arr, int lb, int ub) {
    int pivot = arr[lb];
    int start = lb;
    int end = ub;
    while (start < end) {
      while (start <= ub && arr[start] <= pivot) {
        start++;
      }
      while (end >= lb && arr[end] > pivot) {
        end--;
      }
      if (start < end) {
        swap(arr, start, end);
      }
    }
    swap(arr, lb, end);
    return end;
  }

  public static void swap(int[] arr, int lb, int ub) {
    int temp = arr[lb];
    arr[lb] = arr[ub];
    arr[ub] = temp;
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = obj.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = obj.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

}

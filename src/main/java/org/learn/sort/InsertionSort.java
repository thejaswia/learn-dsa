package org.learn.sort;

public class InsertionSort {

    // Big O Notation - O(n^2)

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 3, 9, 1, 17, 20, 5, 5, 10};
        int n = arr.length;

        System.out.println("Before Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

}

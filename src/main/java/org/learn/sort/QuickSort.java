package org.learn.sort;

public class QuickSort {

    // Big O Notation - O(n log n)
    //In worst case it can go to - O(n^2)

    // Divide and conquer

    // Pivot value
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 3, 9, 1, 17, 20, 5, 5, 10};
        int n = arr.length;

        System.out.println("Before Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, n - 1);

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}

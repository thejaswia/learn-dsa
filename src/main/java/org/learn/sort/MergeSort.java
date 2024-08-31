package org.learn.sort;

public class MergeSort {

    // Big O Notation - O(n log n)

    // Divide and conquer

    // left, middle and right concept

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 3, 9, 1, 17, 20, 5, 5, 10};
        int n = arr.length;

        System.out.println("Before Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, n - 1);

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];

        //coping left array
        for (int x = 0; x < leftSize; x++) {
            leftArr[x] = arr[left + x];
        }

        //coping right array
        for (int x = 0; x < rightSize; x++) {
            rightArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

}

package org.learn.sort;

public class SelectionSort {


    // Big O Notation - O(n^2)

    public static void main(String[] args) {

        int nums[] = {2, 4, 6, 3, 9, 1, 17, 20, 5, 5, 10};
        int size = nums.length;
        int minIndex = -1;

        System.out.println("Before Sorting:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j=i; j< size; j++) {

                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }

            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : nums) {
            System.out.print(num + " ");
        }


    }

}

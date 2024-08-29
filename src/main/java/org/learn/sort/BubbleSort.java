package org.learn.sort;

public class BubbleSort {

    // Big O Notation - O(n^2)

    public static void main(String[] args) {

        int nums[] = {2, 4, 6, 3, 9, 1, 17, 20, 5, 5, 10};
        int size = nums.length;

        System.out.println("Before Sorting:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }

        System.out.println();
        System.out.println("After Sorting:");

        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}

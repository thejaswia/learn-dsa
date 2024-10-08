package org.learn.search;

public class LinearSearch {


    // Big O Notation - O(n)

    public static void main(String[] args) {

        int nums[] = {5, 6, 2, 7, 8, 9, 10, 1, 4};
        int target = 4;

        int result = linearSearch(nums, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at : " + result);
        }

    }

    private static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}

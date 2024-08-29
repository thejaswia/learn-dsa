package org.learn.search;


public class BinarySearch {


    // Big O Notation - O(log n)

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;

        int result = binarySearch(nums, target);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at : " + result);
        }

    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

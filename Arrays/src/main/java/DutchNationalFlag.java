import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5.1 The Dutch National Flag Problem
 * Leetcode: 75. Sort Colors
 * Write a program that takes an array A and an index i into A, and rearranges the elements such that
 * all elements less than A[i] (the 'pivot') appear first, followed by elements equal to the pivot
 * followed by elements greater than the pivot.
 *
 * Enum colors: RED, WHITE, BLUE
 */
public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = new int[] {2,0,2,1,1,0};
        dutchFlag(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void dutchFlag(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
    }

    public static void swap(int[] nums, int lowIndex, int highIndex) {
        int temp = nums[lowIndex];
        nums[lowIndex] = nums[highIndex];
        nums[highIndex] = temp;
    }

    public static void dutchFlagPartition(int pivotIndex, List<Integer> list) {

    }

}

package com.interview.Questions;

public class MoveNegativeNumbersToRight {
	
	public static void moveNegativeToLeft(int[] nums) {
        int  left= 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            if (nums[left] < 0 && nums[right] >= 0) {
                // Swap nums[left] and nums[right]  {-12, 10,11,-8};
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
  
                left++;
                right--;
            } else {
            	if (nums[right] < 0) {
                    right--;
                }
                if (nums[left] >= 0) {
                    left++;
                }
                
            }
        }
    }
	
	public static void main(String[] args) {
        int[] nums = {-12, 10,11,-8};
        moveNegativeToLeft(nums);
        
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

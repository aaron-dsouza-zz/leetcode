package learn.problems;

import java.util.Hashtable;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        // Subtract the target from every element in the array
        // Store the result in a list.
        // Iterate every element in the list until you find a matching element
        // in the original array

        for(int i=0;i<nums.length;i++) {
            indices[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    indices[1] = j;
                    System.out.println("Answer: "+indices[0]+","+indices[1]);
                    return indices;
                } 
            }
        }
        return indices;
    }
}

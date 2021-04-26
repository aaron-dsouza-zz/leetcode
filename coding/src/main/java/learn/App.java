package learn;

import learn.problems.TwoSum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {-69, -5, -91, -70, 77, -39, -49, -61, -34, 4, -35, -65, 6, 20, -43};
        int target = -48;
        new TwoSum().twoSum(nums, target);
    }
}

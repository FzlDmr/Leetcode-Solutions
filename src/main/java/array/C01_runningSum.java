package array;

import java.util.Arrays;

public class C01_runningSum {

    public static void main(String[] args) {

            int [] nums = {1,2,3,4};
            System.out.println(Arrays.toString(runningSum(nums)));

    }
    public static int[] runningSum(int[] nums) {

        int [] nums1 = new int[nums.length];

        nums1[0]=nums[0];


        for(int i =1 ; i<nums.length; i++){

            for(int j=0;j<=i;j++){
                nums1[i]+=nums[j];
            }
        }

        return nums1;

    }
}

/*
Author : kripanshu bhargava
Question : Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Extra note : Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example : Input: [2,2,1]
          Output: 1

 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i =0; i<nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String args[]){
    int[] n = new int[]{1,2,3,4,1,2,3};
    int res = singleNumber(n);
    System.out.print(res);
    }
}

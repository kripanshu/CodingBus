public class MissingNumber {
public static void main(String[] args){
    missingNumber(new int[]{3, 0, 1});
}
    public static int missingNumber(int[] nums) {
        int missing_num = 0;
        int [] a = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){

            a[nums[i]]++;
        }
        for(int j=0; j<a.length; j++){
            if(a[j]==0){ missing_num = j;
            }
        }
        return missing_num;
    }
}

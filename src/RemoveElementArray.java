public class RemoveElementArray {
    public static int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int k=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }else{k++;}
//            System.out.println(j);
        }
//        System.out.println(j);
        return k;
    }


    public static void main(String[] args){
        int [] a = new int [] {0,1,2,2,3,0,4,3,2};
System.out.println("len "+removeElement(a,2));

        for (int i = 0; i < a.length; i++) {
//           System.out.println(a[i]);
        }
    }
}

public class MovingZeros {
    public static void main(String args[]){
        int [] arr = new int []{0,1,0,3,12,0,24};
        moveZeroes(arr);
        for(int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
//    public static void moveZeroes(int[] nums) {
//        int nums_size = nums.length;
//        for(int i=0; i<nums_size; i++){
//
//            System.out.println(" a[i] "+ nums[i]);
//
//            if(nums[i] == 0){
//                System.out.println("i here : "+ i);
//                System.out.println(" ");
//                int temp_value = nums[i];
//                int temp_index = i;
//
//
//                for(int j = i+1; j< nums_size; j++){
//
//                    System.out.println("outer j "+ j);
//
//
//                    if(nums[j] != 0){
////                        System.out.print("swapping stage : " + nums[j]);
////                        System.out.print("____");
////                        System.out.println(nums[temp_index]+ " of "+ temp_index + " will get swapped to "+ nums[j]);
//                        System.out.println("___");
//                        System.out.println("tempvalue : "+temp_value);
//                        System.out.println("temp_index : " + temp_index);
//                        System.out.println("j "+ j);
//
//
//                        nums[temp_index] = nums[j];
//                        nums[j] = temp_value;
//                        temp_index = j;
//                    }
//
//                }
//
//            }
//        }
//
//    }

    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i =0; i<nums.length; i++){

            if(nums[i] != 0 ){
                nums[pos] = nums[i];
                pos ++;
            }

        }

        for(int j=pos; j<nums.length; j++){
            nums[j] = 0;
        }

    }

}


//
//Check if the first and last digit of the smallest number forms a prime
//
//Given an array arr[] containing numbers from 0 to 9 only, the task is to form the minimum possible number from the
// given digits and then check if the first and last digit of the number thus created can be rearranged to form a prime number or not.

import java.util.Arrays;

public class SmallestNumberPrime {
public static boolean isPrime(int a){
    int c=0;
    for( int i=1; i<a/2; i++){
        if(a%i ==0) c++;
    }
    if(c==1)return true;
    else return false;

}
//public int findMin(int [] a){
//    int result = 0;
//    for(int i=0; i<a.length;i++){
//        if(a[i]<result){
//            result = a[i];
//        }
//
//    }
//    return result;
//}
public static void main(String args[]){

//    sort array
    int [] a = new int[]{2,6,4,3,1,7};
    Arrays.sort(a);
    int min = a[0];
    int max = a[a.length-1];

    int smallest_num = min*10 + max;
    int largest_num = max*10 + min;

    if(isPrime(smallest_num)) System.out.print("It is Prime :" + smallest_num);
    if(isPrime(largest_num)) System.out.print("It is Prime :" + largest_num);
    else System.out.print("No prime Numbers");
}
}

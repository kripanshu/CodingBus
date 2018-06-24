public class ReverseString {

//    public static String reverseString(String s) {
//        String [] sp = s.split("");
//        String result = "";
//        for(int i =sp.length-1; i>=0; i--){
//            result +=sp[i];
//        }
//    return result;
//    }
    // this above code is naive way to do and would exceed the time limit.

//
//    public static String reverseString(String s) {
//        int len = s.length();
//        String result = "";
//        for(int i=len-1; i>=0; i--){
//            result += s.charAt(i);
//
//        }
//
//        return result;
//    }
    // THIS IS  ALSO NAIVE WAY TO DO AS IT RUNS THE ARRAY TO THE FULL LENGTH

    // WE USE DIVIDE AND CONQUER NOW
    public static String reverseString(String s) {
        char [] reverse_string = s.toCharArray(); // let us take example of " hello "
        int start_pos = 0; // 0
        int end_pos = s.length() - 1; // 4
        while(start_pos<end_pos){
            char temp = reverse_string[start_pos];
            reverse_string[start_pos] = reverse_string[end_pos];
            reverse_string[end_pos] = temp;

            start_pos ++ ;
            end_pos --;


        }
        return new String(reverse_string);
    }
    public static void main(String args[])
    {
     String res = reverseString("Hello");
     System.out.print(res);

    }


    // Things to take from the solution: time Complexity : O(n) Average and worst case
    // Divide and Conquer let the total time taken into half
}

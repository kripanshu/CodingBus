public class UniqueCharacters {

    public static boolean uniqueCharaters(String s){
       int res = 0;
       for(int i=0; i<s.length(); i++){
           System.out.println(res);
           res ^= s.charAt(i);

       }

       return true;
    }

    public static void main (String [] args){

        uniqueCharaters("dadd");
    }
}

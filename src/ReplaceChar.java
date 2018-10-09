public class ReplaceChar {

    public static void replaceChar(String a, String b){

        String s = a.replace(" ", b);
        System.out.print(s);



    }

    public static void main(String [] args){

        replaceChar("Mr John Smith", "%20");
    }
}

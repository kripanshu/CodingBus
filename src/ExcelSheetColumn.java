import java.util.HashMap;

public class ExcelSheetColumn {

    public static void main (String args[]){

        int val = titleToNumber("ZY");
        System.out.println(val);
    }

    public static int titleToNumber(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();
        char ch = 'A';
        for(int i=1; i<27; i++){

            hm.put(ch,i);
            ch++;
        }

//        System.out.println(Arrays.asList(hm));

        int res = 0;
        int len = s.length()-1;
        int t =0;
        while(len >=0){
            char val = s.charAt(len);
            int value = hm.get(val);
            res = res + (int)Math.pow(26,t)* value ;
            len--;
            t++;


        }

       return res;
    }
}

public class StringCompression {
    public static void main(String [] args){
    String res = compress_string("aabbcc");
    System.out.print(res);
    }

    private static String compress_string(String a) {
        StringBuilder return_string = new StringBuilder(" ");
        int len = a.length();
        int i=0;
        int count =1;
        while(i<len){
            if(i==0){
                return_string.append(a.charAt(i));
            }
            else if(i>0 && a.charAt(i) == a.charAt(i-1)){
                count++;
            }
            else if(i>0 && a.charAt(i)!= a.charAt(i-1)){
                return_string.append(count);
                return_string.append(a.charAt(i));
                count = 1;

            }

            i++;
        }
        return_string.append(count);

        return return_string.toString();
    }
//    public static String compress_string(String a ){
//        StringBuilder return_string = new StringBuilder(" ");
//        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//
//        int len = a.length();
//        int i=0;
//        if(len == 0) return return_string.toString();
//        while(i< len){
//            if(i==0){
//                map.put(a.charAt(i),1);
//            }
//            else if(i>0 && a.charAt(i) == a.charAt(i-1)){
//                int val = map.get(a.charAt(i));
//                val ++;
//                map.put(a.charAt(i),val);
//
//            }
//            else if(i>0 && a.charAt(i)!= a.charAt(i-1)){
//                for(Map.Entry<Character,Integer> entry: map.entrySet()){
//                    System.out.print(entry.getKey()+""+entry.getValue());
//                    return_string.append(entry.getKey()+""+entry.getValue());
//                }
//                map.clear();
//                map.put(a.charAt(i),1);
//            }
//                i++;
//        }
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.print(entry.getKey()+""+entry.getValue());
//            return_string.append(entry.getKey()+""+entry.getValue());
//        }
//        map.clear();
//
//        return String.valueOf(return_string);
//
//    }


}

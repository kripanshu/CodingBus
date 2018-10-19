public class RepeatingNumbers {
    public static void method1(int [] a){
        int [] b = new int[a.length+1];
        for(int i=0; i<a.length; i++){
            if(b[a[i]]<1){
//                System.out.println(b[a[i]]);
            b[a[i]]++;
            }else{System.out.println(a[i]);}
        }

    }
    public static void method2(int [] a){
        int i;
        for(i=0; i<a.length; i++){
            if(a[Math.abs(a[i])]>0){
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
//                System.out.println(Math.abs(a[i]));
            }
            else System.out.println(Math.abs(a[i]));
        }
    }

    public static void main(String[] args){
    int [] res = new int[]{1,2,2,1};
        method1(res);
}
}

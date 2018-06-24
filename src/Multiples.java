import java.util.ArrayList;
import java.util.List;
public class Multiples {

// This method proves out to be one of the best.
    public static  List<String> fizzBuzz(int n) {
        List <String> fizzbuzz = new ArrayList<>();
        for(int i =1; i<=n ;i++ ){
            if(i%3 == 0 && i%5==0){
                fizzbuzz.add("FizzBuzz");
            }
            else if(i%3==0){
                fizzbuzz.add("Fizz");
            }
            else if(i%5 == 0){
                fizzbuzz.add("Buzz");
            }
            else {
                fizzbuzz.add(Integer.toString(i));
            }
        }

        return fizzbuzz;

    }
    public static void main(String args[]){
        List <String> res = new ArrayList<>();
    res = fizzBuzz(15);

    System.out.print(res);
    }
}

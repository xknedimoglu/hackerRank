@author Rüştü Kaan Nedimoğlu
@date   02.07.2019
    
import java.util.Scanner;

class MyCalculator {
    static long power(int number1,int number2) throws Exception{  
        
            long result2=0;
            double result=0;
        
            if(number1 == 0 && number2==0){
                throw new Exception("n and p should not be zero.");  
            }
            else if (number1 < 0 || number2< 0){
                throw new Exception("n or p should not be negative.");
            }
            else {
              result = Math.pow(number1,number2);
              result2 = (long)result;
              return result2;
            }  
     } 
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

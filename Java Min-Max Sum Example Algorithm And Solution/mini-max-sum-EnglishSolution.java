@author Rüştü Kaan Nedimoğlu
@date   01.07.2019
    
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
            Arrays.sort(arr);
        
            long minSum = 0;
            long maxSum = 0;
            long sum = 0;

            for(int i = 1 ; i< arr.length-1; i++){
               sum = sum + arr[i];
            }
            minSum = sum + arr[0];
            maxSum=  sum + arr[arr.length-1];

            System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
//        int[] arr = new int[5];

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < 5; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

//        miniMaxSum(arr);
//        scanner.close();
//    }
}

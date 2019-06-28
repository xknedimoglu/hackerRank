import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int s2=0;
         String [] s3 = new String[3];
         String [] s4 = new String[3];
         s3 = s.split(":"); 
        
        if(Integer.parseInt(s.substring(0,2))<12 && s.contains("PM")){
          s2=12+Integer.parseInt(s.substring(0,2));
          s3[0]= Integer.toString(s2);
            s3[2] = s3[2].substring(0,2);
            return s3[0]+":"+s3[1]+":"+s3[2];
        }
         if(Integer.parseInt(s.substring(0,2))<12 && s.contains("AM")){   
            s4[2] = s3[2].substring(0,2);
            return s3[0]+":"+s3[1]+":"+s4[2];
        }
     
       else if(Integer.parseInt(s.substring(0,2))==12 && s.contains("AM")){
           s2=Integer.parseInt(s.substring(0,2));
          s3[0]= Integer.toString(s2);
            s3[2] = s3[2].substring(0,2);
            return "00"+":"+s3[1]+":"+s3[2];
       }
    
        else {
            s3[2] = s3[2].substring(0,2);
            return "12"+":"+s3[1]+":"+s3[2];
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

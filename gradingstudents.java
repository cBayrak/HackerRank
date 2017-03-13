import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
           if(grade>=38){
               if(grade%5==3){
                   grade+=2;
               }
               else if(grade%5==4){
                   grade+=1;
               }
           }
            System.out.println(grade);
        }
    }
}

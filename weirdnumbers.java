import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc=new Scanner(System.in);
        int f= sc.nextInt();
        if(f%2!=0){
            System.out.println("Weird");
        }
        else{
             if(f>=2 && f<6){
            System.out.println("Not Weird");
        }
        else if(f>=6 && f<21){
            System.out.println("Weird");
        }
        else if(f>20){
            System.out.println("Not Weird");
        }
        }
    }
}

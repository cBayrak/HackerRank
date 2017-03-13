import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos=0,neg=0,zr=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
             
        }
        for(int j=0;j<n;j++){
            if(arr[j]==0) zr++;
            else if(arr[j]<0) neg++;
            else if(arr[j]>0) pos++;
                else
               System.out.println("Fail");
        }
        float tmp=(float) pos/n;
        System.out.printf("%.6f \n", tmp);
         tmp=(float) neg/n;
        System.out.printf("%.6f \n", tmp);
         tmp=(float) zr/n;
        System.out.printf("%.6f \n", tmp);
    }
}
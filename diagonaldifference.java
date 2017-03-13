import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int top=0;
        int tmp=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        tmp=a[0][0]+a[1][1]+a[2][2];
        top=a[0][2]+a[1][1]+a[2][0];
        top-=tmp;
        System.out.println(top);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        in.nextLine();
        int dif = 0;
        for (int i = 0; i < n; i++) {
          String[] row = in.nextLine().split(" ");
          dif += Integer.parseInt(row[i]) - Integer.parseInt(row[n - i - 1]);
        }
        System.out.println(Math.abs(dif));
    }
}
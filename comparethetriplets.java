
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author cBayrak
 */
public class Hackerrank {

    /**
     * @param args the command line arguments
     */
     public static int[] arrayLeftRotation(int[] a, int n, int k) {
    int c=k;
        return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int atop=0;
        int btop=0;
        if(a0>b0) atop++;
        else if(a0<b0) btop++;
          if(a1>b1) atop++;
        else if(a1<b1) btop++;
             if(a2>b2) atop++;
        else if(a2<b2) btop++;
        System.out.print(atop+ " "+btop);
    }
    
}

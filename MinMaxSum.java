
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
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] arr= new long[5];
        long min=0,max=0;
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;
        Arrays.sort(arr);
        for(int j=0;j<4;j++){
          min+=arr[j];  
        }
        for(int j=1;j<5;j++){
            max+=arr[j];
        }
        System.out.print(min+" "+max);
        
        }
    }
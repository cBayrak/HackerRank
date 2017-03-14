
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
          int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int f;
        double c;
        String fq;
        f=scan.nextInt();
       
        c=scan.nextDouble();
        scan.nextLine();
        fq=scan.nextLine();
        System.out.println(i+f);
        System.out.println(c+d);
        System.out.println(s+fq);
          scan.close();
    }
}
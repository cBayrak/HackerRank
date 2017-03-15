
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
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip=((double)tipPercent/100)*mealCost;
        double tax=((double)taxPercent/100)*mealCost;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        long totalCost = Math.round(mealCost+tip+tax);
        System.out.println(totalCost);
    }
}
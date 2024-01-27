// Practicum 11 (Largest of Three Program) Solution
import java.util.Scanner;  // ** ADDED **

public class Main {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;
        Scanner input = new Scanner(System.in);  // ** ADDED **

        // prompt user for three numbers
        System.out.print("Enter 3 numbers: ");
        // NOTE: Each call to nextInt will first scan the input
        // for the first digit character found. It will then
        // keep reading digit characters until a white space
        // is found (e.g., blank or end-of-line character).
        // Thus, the three entered numbers can be all entered
        // on the same line, or each on a separate line.
      
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
       
        // determine largest and assign to variable largest
        if(num1 > num2)
          if(num1 > num3)
            largest = num1;
          else
            largest = num3;
        else
          if(num2 > num3)
            largest = num2;
          else
            largest = num3;

        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {

        double num1, num2, num3, largest;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter in three numbers");
        
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        if(num1 > num2 && num1 > num3)
            largest = num1;
        else if(num2 > num1 && num2 > num3)
            largest = num2;
        else 
            largest = num3;
        
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}

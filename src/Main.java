import java.util.Scanner; // import scanner for user input

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // initialize scanners for user inputs for both numbers
        Scanner firstNum = new Scanner(System.in);
        Scanner secondNum = new Scanner(System.in);

        // declare variables
        double firstNumToCompare = 0; // first number from user input to compare
        double secondNumToCompare = 0; // second number from user input to compare
        String trash = ""; // if user inputs not a number

        // output for user to input numbers
        System.out.println("Please enter the first number to compare: ");

        // checks if the first user input is valid int/double
        if (firstNum.hasNextDouble()) {
            // assigns the first number/user input to variable
            firstNumToCompare = firstNum.nextDouble();
            // output for user to input numbers
            System.out.println("Please enter the second number to compare: ");
            // checks if the second user input is valid int/double
            if (secondNum.hasNextDouble()) {
                // assigns the second number/user input to variable
                secondNumToCompare = secondNum.nextDouble();
                // checks if the two numbers are equal or not
                if (firstNumToCompare == secondNumToCompare) {
                    // if equal, output that the numbers are equal
                    System.out.println("The numbers " + firstNumToCompare + " and " + secondNumToCompare + " are equal.");
                } else {
                    // if not equal check which variable is lesser and output
                    if (firstNumToCompare < secondNumToCompare) {
                        System.out.println("Your first input " + firstNumToCompare + " is less than your second input " + secondNumToCompare);
                    } else {
                        System.out.println("Your second input " + secondNumToCompare + " is less than your first input " + firstNumToCompare);
                    }
                }
            } else {
                // if user inputs second input as other than a double, output error message
                trash = secondNum.nextLine();
                System.out.println("You input the second comparison value as: " + trash);
                System.out.println("Please rerun the program and enter values of type double.");
            }
        } else {
            // if user inputs first input as other than a double, output error message
            trash = firstNum.nextLine();
            System.out.println("You input the first comparison value as: " + trash);
            System.out.println("Please rerun the program and enter values of type double.");
        }

    }
}
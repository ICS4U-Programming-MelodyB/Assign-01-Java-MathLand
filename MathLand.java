import java.util.Scanner;

/**
* The Program asks the they want to do and if they choice 1
* then they have the chance to find the area of a
* triangle, trapezoid or pentagon
* and if they choice 2 then they find the average of three numbers.
*
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-3-08
*/
public final class MathLand {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathLand() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(String[] args) {
        // Declare Constants
        final String SHAPE_ONE = "triangle";
        final String SHAPE_TWO = "trapezoid";
        final String SHAPE_THREE = "pentagon";

        // Declare variables
        String userString = " ";
        String shapeString = " ";
        String triBaseString = " ";
        String triHeightString = " ";
        String trapBaseString = " ";
        String trapHeightString = " ";
        String trapSideString = " ";
        String penSideString = " ";
        String quesAns = " ";
        String userNum1Sr = " ";
        String userNum2Sr = " ";
        String userNum3Sr = " ";
        int userInt = 0;
        float triBaseFloat = 0;
        float triHeightFloat = 0;
        float trapBaseFloat = 0;
        float trapHeightFloat = 0;
        float trapSideFloat = 0;
        double penSideDouble = 0;
        float triArea = 0;
        float trapArea = 0;
        float userNum1Float = 0;
        float userNum2Float = 0;
        float userNum3Float = 0;
        float average = 0;
        double penArea = 0;

        // Welcome the user and asks them what they would like to do.
        System.out.println("Hello! Welcome to Melody's MATH WONDERLAND!");
        System.out.print("Please enter 1 to find the area of");
        System.out.print(" a triangle, trapezoid or Pentagon ");
        System.out.print("and 2 to find the average: ");
        // Create a new scanner constant
        final Scanner scanner = new Scanner(System.in);

        // Runs the program once.
        do {
            System.out.print("Please enter 1 to find the area of");
            System.out.print(" a triangle, trapezoid or Pentagon ");
            System.out.print("and 2 to find the average: ");
            // Get next line as a string
            userString = scanner.nextLine();

            try {
                // Convert the string to a double
                userInt = Integer.parseInt(userString);

                // If user inputs 1 they want to find the area of a shape
                if (userInt == 1) {
                    // Asks user what shape they would like
                    System.out.print("Would you like to find the area of a");
                    System.out.print(" Triangle, Trapezoid or Pentagon: ");
                    shapeString = scanner.nextLine();
                    // Finds the area of a triangle.
                    if (shapeString.equals(SHAPE_ONE)) {
                        // Gets the base as string
                        System.out.print("What is the base: ");
                        triBaseString = scanner.nextLine();
                        try {
                            // Converts base to float
                            triBaseFloat = Float.parseFloat(triBaseString);
                            // Gets the height as a string
                            System.out.print("What is the height: ");
                            triHeightString = scanner.nextLine();
                            try {
                                // Converts height to float
                                triHeightFloat = Float.parseFloat(
                                    triHeightString);
                            // If the input is not a float display error
                            } catch (NumberFormatException error) {
                                System.out.print("Please enter a valid ");
                                System.out.println("number "
                                    + error.getMessage());
                            }
                            // Calculate area of triangle
                            triArea = (triBaseFloat * triHeightFloat) / 2;
                            // Display the area
                            System.out.print("The area of the ");
                            System.out.println("Triangle is "
                                + triArea + " (cm^2)");
                        // If the input is not a float display error
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid number "
                                + error.getMessage());
                        }
                    } else if (shapeString.equals(SHAPE_TWO)) {
                        System.out.print("What is the side length: ");
                        trapSideString = scanner.nextLine();
                        try {
                            trapSideFloat = Float.parseFloat(trapSideString);
                            System.out.print("What is the base: ");
                            trapBaseString = scanner.nextLine();
                            try {
                                trapBaseFloat = Float.parseFloat(
                                    trapBaseString);
                                System.out.print("What is the height: ");
                                trapHeightString = scanner.nextLine();
                                try {
                                    trapHeightFloat = Float.parseFloat(
                                            trapHeightString);
                                // If the input is not a float display error
                                } catch (NumberFormatException error) {
                                    System.out.print("Please enter a valid ");
                                    System.out.println("number "
                                    + error.getMessage());
                                }
                                // Calculate area of trapezoid
                                trapArea = ((trapBaseFloat + trapSideFloat)
                                    * trapHeightFloat) / 2;
                                // Display the area
                                System.out.print("The area of the");
                                System.out.println(" Trapezoid is "
                                    + trapArea + " (cm^2)");
                            // If the input is not a float display error
                            } catch (NumberFormatException error) {
                                System.out.print("Please enter a valid ");
                                System.out.println("number "
                                    + error.getMessage());
                            }
                        // If the input is not a float display error
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid number "
                                + error.getMessage());
                        }
                    } else if (shapeString.equals(SHAPE_THREE)) {
                        System.out.print("What is the side length: ");
                        penSideString = scanner.nextLine();
                        try {
                            penSideDouble = Double.parseDouble(penSideString);
                            // Calculate area of pentagon
                            penArea = ((penSideDouble * penSideDouble)
                                * (Math.sqrt(5
                                    * (5 + (2 * (Math.sqrt(5))))))) / 4;
                            // Display the area
                            System.out.print("The area of the Pentagon is ");
                            System.out.format("%.2f", penArea);
                            System.out.println(" (cm^2)");
                        // If the input is not a float display error
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid number "
                                + error.getMessage());
                        }
                    // If the input is not one of the shapes display error
                    } else {
                        System.out.print("Sorry, the input does not work");
                        System.out.println(" please try again.");
                    }

                // Find the average of 3 numbers
                } else if (userInt == 2) {
                    System.out.print("What is your first num(0-100): ");
                    userNum1Sr = scanner.nextLine();
                    try {
                        // Convert number to float
                        userNum1Float = Float.parseFloat(userNum1Sr);
                        System.out.print("What is your second num(0-100): ");
                        userNum2Sr = scanner.nextLine();
                        try {
                            // Convert number to float
                            userNum2Float = Float.parseFloat(userNum2Sr);
                            System.out.print("What is your third num(0-100): ");
                            userNum3Sr = scanner.nextLine();
                            try {
                                // Convert number to float
                                userNum3Float = Float.parseFloat(userNum3Sr);
                                // Calculate the average
                                average = (userNum1Float + userNum2Float
                                    + userNum3Float) / 3;
                                // display the average
                                System.out.println("The average is " + average);
                            // If the input is not a float display error
                            } catch (NumberFormatException error) {
                                System.out.print("Please enter a valid ");
                                System.out.println("number "
                                    + error.getMessage());
                            }
                        // If the input is not a float display error
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid number "
                                + error.getMessage());
                        }
                    // If the input is not a float display error
                    } catch (NumberFormatException error) {
                        System.out.println("Please enter a valid number "
                            + error.getMessage());
                    }
                // If the input is not one or two display error
                } else {
                    System.out.println("Sorry, input is invalid.");
                }
            // If the input is not an int display error
            } catch (NumberFormatException error) {
                System.out.println("Please enter a valid integer "
                    + error.getMessage());
            }
            // Play again loop
            do {
                // Ask if they want to play again
                System.out.println("Would you like to play again?(y/n): ");
                // Get next line as a string
                quesAns = scanner.nextLine();
                // If n then end program
                if ("n".equals(quesAns)) {
                    System.out.println("Thank you for playing!!");
                // If any other letter or num is
                // used ask them again to enter a valid number
                } else if ("y".equals(quesAns)){
                    System.out.println("Here we go again!");
                }else {
                    System.out.println("Please input a valid string");
                }
            // Do they while the return is not y or n
            } while (!"y".equals(quesAns) && !"n".equals(quesAns));
        // Run the whole program when they say yes to play again.
        } while ("y".equals(quesAns));

        // Closing Scanner
        scanner.close();
    }
}

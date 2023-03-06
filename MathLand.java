import java.util.Scanner;

/**
* The Program calculates the volume of a sphere in Java
* and check input for non numerical inputs.
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-10
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
        final String SHAPE_THREE = "Pentagon";
        // Declare variables
        String userString = " ";
        String shapeString = " ";
        String triBaseString = " ";
        String triHeightString = " ";
        String trapBaseString = " ";
        String trapHeightString = " ";
        String trapSideString = " ";
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
        float triArea = 0;
        float trapArea = 0;
        float userNum1Float = 0;
        float userNum2Float = 0;
        float userNum3Float = 0;
        float average = 0;

        // Welcome the user
        System.out.println("Hello! Welcome to Melody's MATH WONDERLAND!");
        System.out.print("Please enter 1 to find the area of a triangle, trapezoid or Pentagon ");
        System.out.print("and 2 to find the average: ");
        // Create a new scanner constant
        final Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter 1 to find the area of a triangle, trapezoid or Pentagon ");
            System.out.print("and 2 to find the average: ");
            //Get next line as a string
            userString = scanner.nextLine();

            try {
                // Convert the string to a double
                userInt = Integer.parseInt(userString);

                // If radius is negative, tell the user
                if (userInt == 1) {
                    System.out.print("Would you like to find the area of a");
                    System.out.print(" Triangle, Trapezoid or Pentagon: ");
                    shapeString = scanner.nextLine();
                    if(shapeString.equals(SHAPE_ONE)){
                        System.out.print("What is the base: ");
                        triBaseString = scanner.nextLine();
                        try {
                            triBaseFloat = Float.parseFloat(triBaseString);
                            System.out.print("What is the height: ");
                            triHeightString = scanner.nextLine();
                            try {
                                triHeightFloat = Float.parseFloat(triHeightString);
                            } catch (NumberFormatException error) {
                                System.out.println("Please enter a valid integer "
                                    + error.getMessage());
                            }
                            triArea = (triBaseFloat * triHeightFloat) / 2;
                            System.out.println("The area of the Triangle is " + triArea + " (cm^2)");
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid integer "
                                + error.getMessage());
                        }
                    }else if(shapeString.equals(SHAPE_TWO)){
                        System.out.print("What is the side length: ");
                        trapSideString = scanner.nextLine();
                        try {
                            trapSideFloat = Float.parseFloat(trapSideString);
                            System.out.print("What is the base: ");
                            trapBaseString = scanner.nextLine();
                            try {
                                trapBaseFloat = Float.parseFloat(trapBaseString);
                                System.out.print("What is the height: ");
                                trapHeightString = scanner.nextLine();
                                try {
                                    trapHeightFloat = Float.parseFloat(trapHeightString);
                                } catch (NumberFormatException error) {
                                    System.out.println("Please enter a valid integer "
                                        + error.getMessage());
                                }
                                trapArea = ((trapBaseFloat + trapSideFloat) * trapHeightFloat) / 2;
                                System.out.println("The area of the Triangle is " + trapArea + " (cm^2)");
                            } catch (NumberFormatException error) {
                                System.out.println("Please enter a valid integer "
                                    + error.getMessage());
                            }
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid integer "
                                + error.getMessage());
                        }
                    } else if(shapeString.equals(SHAPE_THREE)){
                        System.out.print("What is the side length: ");
                        trapSideString = scanner.nextLine();
                        try {
                            trapSideFloat = Float.parseFloat(trapSideString);
                            System.out.print("What is the base: ");
                            trapBaseString = scanner.nextLine();
                            try {
                                trapBaseFloat = Float.parseFloat(trapBaseString);
                                System.out.print("What is the height: ");
                                trapHeightString = scanner.nextLine();
                                try {
                                    trapHeightFloat = Float.parseFloat(trapHeightString);
                                } catch (NumberFormatException error) {
                                    System.out.println("Please enter a valid integer "
                                        + error.getMessage());
                                }
                                trapArea = ((trapBaseFloat + trapSideFloat) * trapHeightFloat) / 2;
                                System.out.println("The area of the Triangle is " + trapArea + " (cm^2)");
                            } catch (NumberFormatException error) {
                                System.out.println("Please enter a valid integer "
                                    + error.getMessage());
                            }
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid integer "
                                + error.getMessage());
                        }
                    }else {
                        System.out.println("Sorry, the input does not work, please try again.");
                    }

                } else if (userInt == 2){
                    System.out.print("What is your first num(0-100): ");
                    userNum1Sr = scanner.nextLine();
                    try {
                        userNum1Float = Float.parseFloat(userNum1Sr);
                        System.out.print("What is your second num(0-100): ");
                        userNum2Sr = scanner.nextLine();
                        try {
                            userNum2Float = Float.parseFloat(userNum2Sr);
                            System.out.print("What is your third num(0-100): ");
                            userNum3Sr = scanner.nextLine();
                            try {
                                userNum3Float = Float.parseFloat(userNum3Sr);
                                average = (userNum1Float + userNum2Float + userNum3Float)/3;
                                System.out.println("The average is "+ average);
                            } catch (NumberFormatException error) {
                                System.out.println("Please enter a valid integer "
                                    + error.getMessage());
                            }
                        } catch (NumberFormatException error) {
                            System.out.println("Please enter a valid integer "
                                + error.getMessage());
                        }
                    } catch (NumberFormatException error) {
                        System.out.println("Please enter a valid integer "
                            + error.getMessage());
                    }
                }else {
                    System.out.println("Sorry, input is invalid.");
                }
            } catch (NumberFormatException error) {
                System.out.println("Please enter a valid integer "
                    + error.getMessage());
            }
            do {
                System.out.println("Would you like to play again?(y/n): ");
                //Get next line as a string
                quesAns = scanner.nextLine();
                if (quesAns.equals("n")) {
                    System.out.println("Thank you for playing!!");
                } else {
                    System.out.println("Please input a valid string");
                }
            } while (!quesAns.equals("y") && !quesAns.equals("n"));
        } while (quesAns.equals("y"));

            // Closing Scanner
            scanner.close();
    }
}

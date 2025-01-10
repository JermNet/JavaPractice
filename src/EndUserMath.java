import java.util.Scanner;

public class EndUserMath {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int x, y;
        String operator;

        System.out.println("Please enter a whole number.");
        x = key.nextInt();
        System.out.println("Please enter a second whole number.");
        y = key.nextInt();
        System.out.println("Please enter the +, -, or * operator");

        operator = key.nextLine();
        operator = key.nextLine();

        switch (operator) {

            case "+":
                System.out.println("The sum of " + x + " and " + y + " is " + (x + y) + "!");
                break;

            case "-":
                System.out.println("The difference of " + x + " and " + y + " is " + (x - y) + "!");
                break;

            case "*":
                System.out.println("The product of " + x + " and " + y + " is " + (x * y) + "!");
                break;

            default:
                System.out.println(
                        "The operator you have entered is either not valid for this program or not an operator at all.");

        }
        key.close();
    }

}

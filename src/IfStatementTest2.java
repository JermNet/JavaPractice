import java.util.Scanner;

public class IfStatementTest2 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int input = key.nextInt();

        System.out.println("You entered " + input + "!");
        if (input % 2 == 0 && input != 0) {
            System.out.println("The number is even!");
        } else if (input == 0) {
            System.out.println("The number is 0!");
        } else {
            System.out.println("The number is odd!");
        }
        key.close();
    }

}

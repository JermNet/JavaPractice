import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please input a number that relates to a day of the week (1-7).");
        int dayOfWeek = key.nextInt();

        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5:
                System.out.println("It is a weekday.");
                break;

            case 6, 7:
                System.out.println("It is a weekend.");
                break;

            default:
                System.out.println("Not a valid day of the week.");
        }
        key.close();
    }

}

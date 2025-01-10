import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int i = 1;

        do {
            System.out.print("Hello " + i);
            i++;
        } while (i <= 3);

        System.out.println("You are right ");
        key.close();

    }

}

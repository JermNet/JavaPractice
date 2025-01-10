import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = key.nextLine();
        System.out.println("And age?");
        double age = key.nextDouble();
        System.out.println("Hello " + name + " at age " + age);
        key.close();
    }

}

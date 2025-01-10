import java.util.Scanner;

public class Zodiac {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please input your year of birth.");
        int input = key.nextInt();
        input = input % 12;
        switch (input) {
            case 0:
                System.out.println("Remainder: " + input + "! Zodiac: Monkey!");
                break;
            case 1:
                System.out.println("Remander: " + input + "! Zodiac: Rooster!");
                break;
            case 2:
                System.out.println("Remander: " + input + "! Zodiac: Dog!");
                break;
            case 3:
                System.out.println("Remander: " + input + "! Zodiac: Pig!");
                break;
            case 4:
                System.out.println("Remander: " + input + "! Zodiac: Rat!");
                break;
            case 5:
                System.out.println("Remander: " + input + "! Zodiac: Ox!");
                break;
            case 6:
                System.out.println("Remander: " + input + "! Zodiac: Tiger!");
                break;
            case 7:
                System.out.println("Remander: " + input + "! Zodiac: Rabbit!");
                break;
            case 8:
                System.out.println("Remander: " + input + "! Zodiac: Dragon!");
                break;
            case 9:
                System.out.println("Remander: " + input + "! Zodiac: Snake!");
                break;
            case 10:
                System.out.println("Remander: " + input + "! Zodiac: Horse!");
                break;
            case 11:
                System.out.println("Remander: " + input + "! Zodiac: Sheep!");
                break;
        }
        key.close();
    }

}

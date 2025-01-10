import java.util.Scanner;

public class PaluEndingTest2 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int palu, viri, phos, medu;
        System.out.println("Pick a value between 0 and 3");
        palu = key.nextInt();

        System.out.println("Pick a value between 0 and 3");
        viri = key.nextInt();

        System.out.println("Pick a value between 0 and 3");
        phos = key.nextInt();

        System.out.println("Pick a value between 0 and 3");
        medu = key.nextInt();

        if (palu == 1 && viri == 1 && phos == 1) {
            System.out.println("Medusa good ending.");
        } else if (viri == 1 && phos == 1 && medu == 1) {
            System.out.println("Palutena good ending.");
        } else if (palu == 1 && viri == 1 && medu == 1) {
            System.out.println("Phosphora good ending.");
        } else if (palu == 1 && phos == 1 && medu == 1) {
            System.out.println("Viridi good ending.");
        } else {
            System.out.println("No ending");
        }
        key.close();
    }

}

import java.util.Scanner;

public class PaluEndingTest {

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

        if (palu == 2) {
            System.out.println("Palutena good ending.");
        } else if (palu == 3) {
            System.out.println("Palutena perfect ending.");
        } else if (viri == 2) {
            System.out.println("Viridi good ending.");
        } else if (viri == 3) {
            System.out.println("Viridi perfect ending.");
        } else if (phos == 2) {
            System.out.println("Phosphora good ending.");
        } else if (phos == 3) {
            System.out.println("Phosphora perfect ending.");
        } else if (medu == 2) {
            System.out.println("Medusa good ending.");
        } else if (medu == 3) {
            System.out.println("Medusa perfect ending.");
        } else {
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
        }
        key.close();

    }

}

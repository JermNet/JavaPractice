import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double bMI, heightMeters, weightKilograms;

        System.out.println(
                "I will be calculating your BMI (Body Mass Index) and then telling you if you're underweight, overweight, etc.\n"
                        + "Please give me your weight in kilograms.");
        weightKilograms = key.nextDouble();
        System.out.println("Now I need your height in meters please.");
        heightMeters = key.nextDouble();
        bMI = weightKilograms / (Math.pow(heightMeters, 2));
        if (bMI < 18.5 && bMI > 0) {
            System.out.println("Your BMI is " + bMI + ", that means you are underweight.");
        } else if (bMI >= 18.5 && bMI <= 24.9) {
            System.out.println("Your BMI is " + bMI + ", that means you are of a normal weight.");
        } else if (bMI > 24.9 && bMI <= 29.9) {
            System.out.println("Your BMI is " + bMI + ", that means you are overweight.");
        } else if (bMI >= 30) {
            System.out.println("Your BMI is " + bMI + ", that means that you are obese.");
        } else {
            System.out.println("Something went wrong.");
        }
        key.close();
    }

}

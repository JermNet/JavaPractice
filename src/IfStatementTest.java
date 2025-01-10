public class IfStatementTest {

    public static void main(String[] args) {

        int x = 23;

        if (x < 10) {
            System.out.println("Good morning it is the " + x + "th hour of the day.");
        } else if (x < 19) {
            System.out.println("Good afternoon it is the " + x + "th hour of the day");
        } else {
            System.out.println("Good evening it is the " + x + "th hour of the day");
        }
    }

}

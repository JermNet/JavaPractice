import java.util.ArrayList;

public class TheCuttingRoomFloorExampleFixed {
    public static void main(String[] args) {
        // Example variables
        String query = "Mario";
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<String> webPageText = new ArrayList<>();

        // Example data
        categories.add("Zelda Series");
        categories.add("Mario Series");
        categories.add("Pikmin Series");

        webPageText.add("Everyone has played the Legend of Zelda at some point...");
        webPageText.add("The Super Mario series is something that...");
        webPageText.add("Pikmin are loveable little creatures that...");

        // Loop through of the elements in the array (a.k.a, all of the categories)
        for (int i = 0; i < categories.size(); i++) {
            // Checks if the query is a word or phrase that is or is contained in the name
            // of a category.
            if (categories.get(i).contains(query)) {
                // Prints to console for this example.
                System.out.println(categories.get(i));
                // The Loop is now broken out of instead of the code ending. This obviously
                // works differently in The Cutting Room Floor code but the logic is all the
                // same.
                break;
            }
        }

        // This code is only run if a category match is ot made
        for (int i = 0; i < webPageText.size(); i++) {
            // For this example, this is the same as above.
            if (webPageText.get(i).contains(query)) {
                System.out.println(webPageText.get(i));
            }
        }
    }
}
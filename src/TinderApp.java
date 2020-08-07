import java.util.*;

public class TinderApp {
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO BASIC JAVA TINDER CLONE 🔥!\n");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your preference. f for female, m for male, n for no preference");
        String preference = sc.nextLine();

        System.out.println("Awesome, you have selected a preference of: " + preference);

        TinderSwipe ts = new TinderSwipe();

        ArrayList<Profile> displayProfiles = ts.getProfilesByPreference(preference);

        Iterator<Profile> iterator = displayProfiles.iterator();

        // System.out.println(iterator.next());
        // System.out.print("\nSwipe (r) right or (l) left. Press q to quit app\n");
        // String userInput = sc.nextLine();
        // if(sc.nextLine().toUpperCase().equals("R")) {
        //     System.out.println("You swiped right");
        // }
        // if(sc.nextLine().toUpperCase().equals("L")) {
        //     System.out.println("You swiped left");
        // }

        String userInput;
        while(iterator.hasNext()) {
            Profile nextProfile = iterator.next();
            System.out.println(nextProfile);
            System.out.print("\nSwipe (r) right or (l) left. Press q to quit app\n");
            userInput = sc.nextLine();
            if(userInput.toUpperCase().equals("R")) {
                System.out.println("You swiped right\n");
                ts.submitProfileToDB(nextProfile);
            }
            if(userInput.toUpperCase().equals("L")) {
                System.out.println("You swiped left\n");
            }
            if(userInput.toUpperCase().equals("Q")) {
                System.out.println("\n\nThank you so much for using Tinder App");
                break;
            }
        }


        System.out.println("\n\nNo more potential matches in your area.");
        ts.closeConnectionToDB();
        
        
    }
}

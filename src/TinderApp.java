import java.util.*;

public class TinderApp {
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO BASIC JAVA TINDER CLONE 🔥!\n");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your preference. f for female, m for male, n for no preference");
        String preference = sc.nextLine();

        System.out.println("Awesome, you have selected a preference of: " + preference);

        TinderSwipe ts = new TinderSwipe();

        System.out.println(ts.getProfilesByPreference(preference));
        
    }
}

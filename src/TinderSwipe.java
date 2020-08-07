import java.util.*;

public class TinderSwipe {

    Database db;

    TinderSwipe() {
        this.db = new Database();
    }

    public ArrayList<Profile> getProfilesByPreference(String preference) {
        ArrayList<Profile> returnList;
        db.readFromCSV("profiles.csv");
        if(preference.toUpperCase().charAt(0) == 'M') {
            returnList = db.getMaleProfiles();
        }
        else if(preference.toUpperCase().charAt(0) == 'F') {
            returnList = db.getFemaleProfiles();
        }
        else {
            returnList = db.getAllProfiles();
        }

        return returnList;
    }

    public void submitProfileToDB(Profile profile) {
        this.db.WritetoCSV(profile);
    }

    public void closeConnectionToDB() {
        this.db.closeFileWriting();
    }
}


public class Person {

    //instance variables    
    private String name;
    private int age;
    private String gender;
    private String bio;
    private String location;
    
    //constructor
    Person(String name, int age, String gender, String location, String bio) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bio = bio;
        this.location = location;
    }

    
    //methods
    
    //getters & setters
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getBio() {
        return this.bio;
    }
    public void setBio(String bio){
        this.bio = bio;
    }
    
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    


}



// - name: String
// - age: int
// - gender: String
// - bio: String
// - location: String

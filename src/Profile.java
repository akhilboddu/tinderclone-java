public class Profile {

    private Person person;
    private Image[] images;

    
    Profile(Person person, Image[] images) {
        this.person = person;
        this.images = images;
    }


    //setters
    
    public void setPerson(Person person){
        this.person = person;
    }

    public void setImages(Image[] images){
        this.images = images;
    }


    //getters
    public Person getPerson() {
        return this.person;
    }
    
    public Image[] getImages() {
        return this.images;
    }

    public String toString(){

        Person p = this.getPerson();
        return "Name: " + p.getName() +
                "\nAge: " + p.getAge() +
                "\nBio: " + p.getBio() +
                "\nGender: " + p.getGender() +
                "\nImages: " +
                "\nImage 1: " + this.getImages()[0].getUrl() +
                "\nImage 2: " + this.getImages()[1].getUrl() +
                "\nImage 3: " + this.getImages()[2].getUrl();

                
                
    }

}
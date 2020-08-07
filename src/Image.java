public class Image {


    private String url;
    private String description;
    private String title;
    

    Image(String url, String title, String description) {
        this.url = url;
        this.description = description;
        this.title = title;
    }


    //getters
    public String getUrl(){
        return this.url;
    }

    public String getDescription(){
        return this.description;
    }

    public String getTitle(){
        return this.description;
    }

    //setters
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
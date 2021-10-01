public class NewsModel {
    private Integer number;
    private String title;
    private String categories;
    private String author;
    private String shortData;

    public NewsModel(Integer number, String title, String categories, String author, String shortData){
        this.number = number;
        this.title = title;
        this.categories = categories;
        this.author = author;
        this.shortData = shortData;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public String getShortData() {return shortData;}

    public void setShortData(String shortData) {this.shortData = shortData;}
}
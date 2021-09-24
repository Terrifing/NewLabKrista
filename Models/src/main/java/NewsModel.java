public class NewsModel {
    private Integer number;
    private String title;
    private String categories;

    public NewsModel(Integer number, String title, String categories){
        this.number = number;
        this.title = title;
        this.categories = categories;
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
}
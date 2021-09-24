public class CategoriesModel {
    private Integer number;
    private String title;

    public CategoriesModel(Integer number, String title){
        this.number = number;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

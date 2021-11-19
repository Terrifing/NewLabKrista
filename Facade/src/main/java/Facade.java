import java.util.Set;

public class Facade implements FacadeInterface {

    private static News news = new News();
    private static Categories categories = new Categories();

    public String getAllNews(){
        return news.getAllNews();
    }

    public String getOneNews(Integer number){
        return news.getOneNews(number);}

    public String addNews(Integer number, String title, String categories, String author, String shortData){
        return news.addNews(number, title, categories, author, shortData);
    }

    public String delNews(Integer number){
        return news.delNews(number);
    }

    public String upgradeNews(Integer number, String title){
        return news.upgradeNews(number, title);
    }

    public String getShortData(Integer number){return news.getShortData(number);}

    public Set<String> getAllAuthors(){return news.getAllAuthors();};



    public String getAllCategories(){
        return categories.getAllCategories();
    }

    public String addCategories(Integer number, String title){
        return categories.addCategories(number, title);
    }

    public String upgradeCategories(Integer number, String title){
        return categories.upgradeCategories(number, title);
    }

    public String delCategories(Integer number){
        return categories.delCategories(number);
    }

}

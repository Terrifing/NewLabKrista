import java.util.*;

public class News implements NewsInterface {

    Factory model = Factory.getModel(1);

    public String getOneNews(Integer number){
        return model.getNewsDAO().getOneNews(number);
    }

    public String getAllNews(){
        return model.getNewsDAO().getAllNews();
    }

    public String addNews(Integer number, String title, String categories, String author, String shortData) {
        return model.getNewsDAO().addNews(number, title, categories, author, shortData);
    }

    public String upgradeNews(Integer number, String title){
        return model.getNewsDAO().upgradeNews(number, title);
    }

    public String delNews(Integer number){
        return model.getNewsDAO().delNews(number);
    }

    public String getShortData(Integer number){
        return model.getNewsDAO().getShortData(number);
    }

    public Set<String> getAllAuthors() {
        return model.getNewsDAO().getAllAuthors();
    }
}

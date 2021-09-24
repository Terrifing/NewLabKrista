import java.util.HashMap;
import java.util.Map;

public class News implements NewsInterface {

    private NewsModel newsModel;
    public static Map<Integer, String> dict = new HashMap<Integer, String>();

    public String getNews(Integer number){
        return dict.get(number);
    }

    public String getAllNews(){
        return "get All News";
    }

    public String addNews(Integer number, String title, String categories) {
        newsModel = new NewsModel(number, title, categories);
        dict.put(newsModel.getNumber(), newsModel.getTitle());
        return "add News";
    }

    public String upgradeNews(){return "upgrade News";}

    public String delNews(){return "del News";}
}

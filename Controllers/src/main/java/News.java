import java.util.*;

public class News implements NewsInterface {

    private NewsModel newsModel;
    public static Map<Integer, String> dict = new HashMap<Integer, String>();

    public String getOneNews(Integer number){
        String[] data = dict.get(number).split("/");
        return "\n"+data[0]+"\n"+data[1]+"\n"+data[3]+"\n";
    }

    public String getAllNews(){
        Collection<String> data = dict.values();
        String result = "";
        for(String elem: data){
            String[] str = elem.split("/");
            result += "\n"+str[0]+"\n"+str[1]+"\n"+str[3]+"\n";
        }
        return result;
    }

    public String addNews(Integer number, String title, String categories, String author, String shortData) {
        newsModel = new NewsModel(number, title, categories, author, shortData);
        String data = newsModel.getTitle() + "/" + newsModel.getAuthor() + "/"  + newsModel.getCategories() + "/"  + newsModel.getShortData();
        dict.put(newsModel.getNumber(), data);
        return "add News";
    }

    public String upgradeNews(Integer number, String title){
        String[] data = dict.get(number).split("/");
        dict.remove(number);
        dict.put(number, title + "/" + data[1] + "/" +  data[2] + "/" +  data[3]);
        return "upgrade News";
    }

    public String delNews(Integer number){
        dict.remove(number);
        return "del News";
    }

    public String getShortData(Integer number){
        return dict.get(number).split("/")[3];
    }

    public Set<String> getAllAuthors() {
        Set<String> authors = new HashSet<>();
        Collection<String> data = dict.values();
        for(String elem: data){
            authors.add(elem.split("/")[1]);
        }
        return authors;
    }
}

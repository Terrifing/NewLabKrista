import java.util.*;

public class DAONews implements NewsDAOInterface{

    private IProvider provider;
    private DB db;
    private NewsModel zeroNews = new NewsModel(0, "","","","");

    public DAONews(IProvider provider, DB db){
        this.provider = provider;
        this.db = db;
    }

    public String getOneNews(Integer number) {
        String[] data = provider.get(number, zeroNews).split("/");
        return "\n"+data[0]+"\n"+data[1]+"\n"+data[3]+"\n";
    }

    public String getAllNews() {
        Collection<String> data = provider.values(zeroNews);
        String result = "";
        for(String elem: data){
            String[] str = elem.split("/");
            result += "\n"+str[0]+"\n"+str[1]+"\n"+str[3]+"\n";
        }
        return result;
    }

    public String addNews(Integer number, String title, String categories, String author, String shortData){
        NewsModel newsModel = new NewsModel(number, title, categories, author, shortData);
        provider.add(newsModel);
        return "AddNews";
    }

    public String upgradeNews(Integer number, String title) {
        String[] data = provider.get(number, zeroNews).split("/");
        provider.remove(number, zeroNews);
        provider.add(new NewsModel(number, data[0], data[1],data[2], data[3]));
        return "upgrade News";
    }

    public String delNews(Integer number) {
        provider.remove(number, zeroNews);
        return "del News";
    }

    public String getShortData(Integer number) {
        return provider.get(number, zeroNews).split("/")[3];
    }

    public Set<String> getAllAuthors() {
        Set<String> authors = new HashSet<>();
        Collection<String> data = provider.values(zeroNews);
        for(String elem: data){
            authors.add(elem.split("/")[1]);
        }
        return authors;
    }
}

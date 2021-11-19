import java.util.Set;

public interface NewsDAOInterface {
    public String getOneNews(Integer number);
    public String getAllNews();
    public String addNews(Integer number, String title, String categories, String author, String shortData);
    public String upgradeNews(Integer number, String title);
    public String delNews(Integer number);
    public String getShortData(Integer number);
    public Set<String> getAllAuthors();
}

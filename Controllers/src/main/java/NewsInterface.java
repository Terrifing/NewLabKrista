public interface NewsInterface {

    public String getNews(Integer number);
    public String getAllNews();
    public String addNews(Integer number, String title, String categories);
    public String upgradeNews();
    public String delNews();

}

public class Facade implements FacadeInterface {

    private static News news = new News();
    private static Categories categories = new Categories();

    public String getAllNews(){
        return news.getAllNews();
    }

    public String getNews(Integer number){
        return news.getNews(number);
    }

    public String addNews(Integer number, String title, String categories){
        return news.addNews(number, title, categories);
    }

    public String delNews(){
        return news.delNews();
    }

    public String upgradeNews(){
        return news.upgradeNews();
    }

    public String getAllCategories(){
        return categories.getAllCategories();
    }

    public String addCategories(Integer number, String title){
        return categories.addCategories(number, title);
    }

    public String upgradeCategories(){
        return categories.upgradeCategories();
    }

    public String delCategories(){
        return categories.delCategories();
    }

}

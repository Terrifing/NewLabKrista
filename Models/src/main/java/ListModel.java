public class ListModel extends Factory{

    private ListProvider provider;
    private DB db;

    public DAONews getNewsDAO() {
        provider = new ListProvider();
        db = new NewsListDB();
        return new DAONews(provider);
    }

    public DAOCategories getCategoriesDAO() {
        provider = new ListProvider();
        return new DAOCategories(provider);
    }
}

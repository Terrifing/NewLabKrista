public class JSONModel extends Factory{

    private JsonProvider provider;
    private DB db;

    public DAONews getNewsDAO() {
        provider = new JsonProvider();
        db = new JsonDB();
        return new DAONews(provider, db);
    }

    public DAOCategories getCategoriesDAO() {
        provider = new JsonProvider();
        db = new JsonDB();
        return new DAOCategories(provider, db);
    }
}

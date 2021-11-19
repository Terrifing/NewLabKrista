public class DAOCategories implements  CategoriesDAOInterface{

    private IProvider provider;
    private CategoriesModel zeroCategories = new CategoriesModel(0, "");

    public DAOCategories(IProvider provider){
        this.provider = provider;
    }

    public String addCategories(Integer number, String title) {
        return provider.add(new CategoriesModel(number, title));
    }

    public String upgradeCategories(Integer number, String title) {
        provider.remove(number, zeroCategories);
        return provider.add(new CategoriesModel(number, title));
    }

    public String delCategories(Integer number) {
        return provider.remove(number, zeroCategories);
    }
}

public abstract class Factory {
    private static final int JSON = 1;
    private static final int DB = 2;

    public abstract DAONews getNewsDAO();
    public abstract CategoriesDAOInterface getCategoriesDAO();

    public static Factory getModel(int value) {
        if (value == JSON) return new JSONModel();
        return new ListModel();
    }

}

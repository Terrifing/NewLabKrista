import java.util.Collection;

public class Categories implements CategoriesInterface {

    private CategoriesList categoriesList = new CategoriesList();
    private Factory model = Factory.getModel(1);

    public String getAllCategories(){
        Collection<String> data = categoriesList.dict.values();
        String result = "";
        for(String elem: data)
            result += "\n"+elem+"\n";
        return result;
    }

    public String addCategories(Integer number, String title){
        categoriesList.dict.put(number, title);
        model.getCategoriesDAO().addCategories(number, title);
        return "add Categories" ;
    }

    public String upgradeCategories(Integer number, String title){
        String data = categoriesList.dict.get(number);
        categoriesList.dict.remove(number);
        categoriesList.dict.put(number,data);
        model.getCategoriesDAO().upgradeCategories(number, title);
        return "upgrade Categories" ;
    }

    public String delCategories(Integer number){
        categoriesList.dict.remove(number);
        model.getCategoriesDAO().delCategories(number);
        return "del Categories" ;
    }

}

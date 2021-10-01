import java.util.Collection;

public class Categories implements CategoriesInterface {

    private CategoriesList categoriesList = new CategoriesList();

    public String getAllCategories(){
        Collection<String> data = categoriesList.dict.values();
        String result = "";
        for(String elem: data)
            result += "\n"+elem+"\n";

        return result;
    }

    public String addCategories(Integer number, String title){
        CategoriesModel categoriesModel = new CategoriesModel(number, title);
        categoriesList.dict.put(categoriesModel.getNumber(), categoriesModel.getTitle());
        return "add Categories" ;
    }

    public String upgradeCategories(Integer number){
        String data = categoriesList.dict.get(number);
        categoriesList.dict.remove(number);
        categoriesList.dict.put(number,data);
        return "upgrade Categories" ;
    }

    public String delCategories(Integer number){
        categoriesList.dict.remove(number);
        return "del Categories" ;
    }

}

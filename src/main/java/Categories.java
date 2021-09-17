import Models.CategoriesList;
import Models.CategoriesModel;

import javax.inject.Inject;
import java.util.Dictionary;
import java.util.Map;

public class Categories implements CategoriesInterface{

    private CategoriesList categoriesList = new CategoriesList();

    public String getAllCategories(){
        return "get All Categories";
    }

    public String addCategories(Integer number, String title){
        CategoriesModel categoriesModel = new CategoriesModel(number, title);
        categoriesList.dict.put(categoriesModel.getNumber(), categoriesModel.getTitle());
        return "add Categories" ;
    }

    public String upgradeCategories(){
        return "upgrade Categories" ;
    }

    public String delCategories(){
        return "del Categories" ;
    }

}

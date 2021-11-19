import java.util.ArrayList;
import java.util.List;

public class CategoriesListDB {
    private List<CategoriesModel> list = new ArrayList<CategoriesModel>();
    
    public void add(CategoriesModel obj){
        list.add(obj);
    }

    public List<CategoriesModel> values(){
        return list;
    }

    public void remove(Integer number){
        list.remove(number);
    }
}

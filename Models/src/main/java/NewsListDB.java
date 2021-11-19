import java.util.ArrayList;
import java.util.List;

public class NewsListDB implements{
    private List<NewsModel> list = new ArrayList<NewsModel>();

    public void add(NewsModel obj){
        list.add(obj);
    }

    public List<NewsModel> values(){
        return list;
    }

    public void remove(Integer number){
        list.remove(number);
    }
}

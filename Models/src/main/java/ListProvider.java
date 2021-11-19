import java.util.Collection;
import java.util.HashSet;

public class ListProvider implements IProvider{

    private final NewsListDB newslist = new NewsListDB();
    private final CategoriesListDB categorieslist = new CategoriesListDB();

    public <T> String add(T obj) {
        if(obj.getClass() == NewsModel.class){
            newslist.add((NewsModel) obj);
            return "Ok";
        }
        else{
            categorieslist.add((CategoriesModel) obj);
            return "Ok";
        }
    }

    public <T> Collection<String> values(T obj) {
        if(obj.getClass() == NewsModel.class){
            Collection<String> strs = new HashSet<>();
            for(NewsModel news: newslist.values()){
                strs.add(news.getTitle()+"/"+news.getAuthor()+"/"+news.getCategories()+"/"+news.getShortData());
            }
            return strs;
        }
        else{
            Collection<String> strs = new HashSet<>();
            for(CategoriesModel categories: categorieslist.values()){
                strs.add(categories.getTitle()+"/"+categories.getTitle());
            }
            return strs;
        }
    }

    public <T> String get(Integer number, T obj) {
        if(obj.getClass() == NewsModel.class){
            for(NewsModel news: newslist.values()){
                if(number == news.getNumber())
                    return news.getTitle()+"/"+news.getAuthor()+"/"+news.getCategories()+"/"+news.getShortData();
            }
        }
        else{
            for(CategoriesModel categories: categorieslist.values()){
                if(number == categories.getNumber())
                    return categories.getTitle()+"/"+categories.getTitle();
            }
        }
        return "Error";
    }

    public <T> String remove(Integer number, T obj) {
        if(obj.getClass() == NewsModel.class){
            for(int i = 0; i < newslist.values().size(); i++){
                if(number == newslist.values().get(i).getNumber()) {
                    newslist.remove(i);
                    return "Ok";
                }
            }
        }
        else{
            for(int i = 0; i < categorieslist.values().size(); i++){
                if(number == categorieslist.values().get(i).getNumber()) {
                    categorieslist.remove(i);
                    return "Ok";
                }
            }
        }
        return "Error";
    }
}

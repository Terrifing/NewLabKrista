import java.util.Collection;

public class JsonProvider implements IProvider{
    private final JsonDB db = new JsonDB();

    public <T> String add(T obj){
        if(obj.getClass() == NewsModel.class) {
            String data = ((NewsModel) obj).getTitle() + "/" + ((NewsModel) obj).getAuthor() + "/" + ((NewsModel) obj).getCategories() + "/" + ((NewsModel) obj).getShortData();
            db.put(((NewsModel) obj).getNumber(), data);
            return "Ok";
        }
        return "Error";
    };

    public <T> Collection<String> values(T obj) {
        if(obj.getClass() == NewsModel.class)
            return db.values();
        return null;
    }

    public <T> String get(Integer number, T obj) {
        if(obj.getClass() == NewsModel.class){
            return db.get(number);
        }
        return "Error";
    }

    public <T> String remove(Integer number, T obj){
        if(obj.getClass() == NewsModel.class) {
            db.remove(number);
            return "Ok";
        }
        return "Error";
    }


}

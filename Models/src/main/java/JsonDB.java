import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class JsonDB implements DB{
    private Map<Integer,String> dict = new HashMap<Integer, String>();

    public String put(Integer number, String title){
        dict.put(number, title);
        return "Ok";
    }

    public String get(Integer number){
        return dict.get(number);
    }

    public Collection<String> values(){
        return dict.values();
    }

    public String remove(Integer number){
        dict.remove(number);
        return "Ok";
    }
}

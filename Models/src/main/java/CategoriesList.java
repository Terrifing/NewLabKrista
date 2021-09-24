import java.util.HashMap;
import java.util.Map;

public class CategoriesList {
    private static volatile CategoriesList instance;
    public Map<Integer,String> dict = new HashMap<Integer, String>();

    public static CategoriesList getInstance() {
        CategoriesList localInstance = instance;
        if (localInstance == null) {
            synchronized (CategoriesList.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new CategoriesList();
                }
            }
        }
        return localInstance;
    }
}

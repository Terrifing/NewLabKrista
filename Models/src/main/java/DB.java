import java.util.Collection;

public interface DB {
    public String put(Integer number, String title);

    public String get(Integer number);

    public Collection<String> values();

    public String remove(Integer number);
}

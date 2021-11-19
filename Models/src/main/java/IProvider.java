import java.util.Collection;

public interface IProvider {
    <T>  String add(T obj);
    <T> Collection<String> values(T obj);
    <T> String get(Integer number, T obj);
    <T> String remove(Integer number, T obj);
}

package Models;

import java.util.HashMap;
import java.util.Map;

public class NewsModel {
    private Integer number;
    private String title;

    public NewsModel(Integer number, String title){
        this.number = number;
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
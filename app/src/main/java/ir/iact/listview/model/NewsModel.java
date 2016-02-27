package ir.iact.listview.model;

import java.io.Serializable;

public class NewsModel implements Serializable{
    public String title;
    public String description;

    public NewsModel(String title,String description){
        this.title = title;
        this.description = description;
    }

    public NewsModel() {
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String value){
        title = value;
    }
}
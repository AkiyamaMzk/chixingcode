package chixing.day10220.day13.echiwork.Q6;

import java.util.ArrayList;

public class Article {
    private String articleName;
    private ArrayList<String> Tags=new ArrayList();

    public void addTag(String s){
        Tags.add(s);
    }


    public Article(String articleName, ArrayList<String> tags) {
        this.articleName = articleName;
        Tags = tags;
    }


    public String getArticleName() {
        return articleName;
    }
    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }
    public ArrayList<String> getTags() {
        return Tags;
    }
 
    public Article(String articleName) {
        this.articleName = articleName;
    }
    
}

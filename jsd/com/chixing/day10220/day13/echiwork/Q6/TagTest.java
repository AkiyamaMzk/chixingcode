package chixing.day10220.day13.echiwork.Q6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TagTest {
    public static void main(String[] args) {
        ArrayList<Article> artList = new ArrayList<>();
        HashSet<String> Tags = new HashSet<>();
        HashMap<String, Integer> TagCount = new HashMap<>();
        Article art1 = new Article("Iseka");
        Article art2 = new Article("Radio");
        Article art3 = new Article("planet");
        art1.addTag("anime");
        art1.addTag("isekai");
        art2.addTag("anime");
        art2.addTag("radio");
        art3.addTag("anime");
        art3.addTag("planet");

        
        artList.add(art1);
        artList.add(art2);
        artList.add(art3);
        for (Article article : artList) {
            for (String tag : article.getTags()) {
                Tags.add(tag);
                TagCount.put(tag, TagCount.getOrDefault(tag, 0) + 1);
            }
        }
    }
}

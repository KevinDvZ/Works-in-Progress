package fr.simplon.picone.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;


@Node("Mood")
public class Mood {

    @Id
    @GeneratedValue
    private Long id;

    private String word;

    @Property("img_url")
    private String imgUrl;

    public Mood() {
    }

    public Mood(Long id, String word, String imgUrl) {
        this.id = id;
        this.word = word;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

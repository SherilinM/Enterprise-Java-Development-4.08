package model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @ManyToOne
    private Author author;

    private String title;

    @Column(length = 12345, columnDefinition = "text")
    private String post;

    public Post() {
    }

    public Post(Author author, String title, String post) {
        this.author = author;
        this.title = title;
        this.post = post;
    }

    //SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPost(String post) {
        this.post = post;
    }

    //GETTERS
    public Long getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPost() {
        return post;
    }
}

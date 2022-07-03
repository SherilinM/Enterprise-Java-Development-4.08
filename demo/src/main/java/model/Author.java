package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="author")
    @JsonIgnore
    private List<Post> postList;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    //SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    //GETTERS
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPostList() {
        return postList;
    }

}

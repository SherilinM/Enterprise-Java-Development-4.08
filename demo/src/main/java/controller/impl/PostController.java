package controller.impl;

import controller.interfaces.IPostController;
import model.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.interfaces.IPostService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PostController implements IPostController {

    @Autowired
    private IPostService postService;

    //CREATE POST AND AUTHOR
    @GetMapping("/post-and-author/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Object[]> findPostAndAuthor(@PathVariable Long id) {
        return postService.findPostAndAuthor(id);
    }

    //Crear Nuevo Post
    @PostMapping("/new-post")
    @ResponseStatus(HttpStatus.CREATED)
    public Post addNewPost(@RequestBody @Valid Post post) {
        return postService.addNewPost(post);
    }

    //actualizar información
    @PutMapping("update-info/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePostInformation(@PathVariable Long id, @RequestBody @Valid Post post) {
        postService.updatePostInformation(id, post);
    }

    //borrar post
    @DeleteMapping("/delete-post/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
package service.impl;

import model.Author;
import model.Post;
import repository.PostRepository;
import service.interfaces.IPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public void saveAll(List<Post> postList) {
        postRepository.saveAll(postList);
    }

    public void deleteAll() {
        postRepository.deleteAll();
    }

    //obtener autor y post
    public List<Object[]> findPostAndAuthor(Long id) {
        return postRepository.findPostAndAuthor(id);
    }

    //crear post
    public Post addNewPost(Post post) {
        return postRepository.save(post);
    }

    //actualizar post
    public void updatePostInformation(Long id, Post post) {
        if (postRepository.findById(id).isPresent()) {
            post.setId(id);
            postRepository.save(post);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "POST NOT FOUND");
        }
    }

    @Override
    public void deletePost(Long id) {

    }

}
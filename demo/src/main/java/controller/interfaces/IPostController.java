package controller.interfaces;

import model.Post;

import java.util.List;

public interface IPostController {

    //obtener autor y post
    public List<Object[]> findPostAndAuthor(Long id);

    //crear post
    public Post addNewPost(Post post);

    //actualizar post
    public void updatePostInformation(Long id, Post post);

    //borrar post
    public void deletePost(Long id);
}

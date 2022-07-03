package controller.interfaces;

import model.Author;
public interface IAuthorController {

    //agregar autor
    public Author addNewAuthor(Author author);

    //actualizar autor
    public void updateAuthor(Long id, Author author);

    //borrar autor
    public void deleteAuthor(Long id);
}
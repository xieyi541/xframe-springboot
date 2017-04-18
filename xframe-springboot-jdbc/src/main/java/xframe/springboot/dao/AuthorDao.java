package xframe.springboot.dao;

import java.util.List;

import xframe.springboot.po.Author;

public interface AuthorDao {
    int add(Author author);
    int update(Author author);
    int delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}

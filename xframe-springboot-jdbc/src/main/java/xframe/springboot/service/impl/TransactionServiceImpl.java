package xframe.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xframe.springboot.dao.AuthorDao;
import xframe.springboot.po.Author;

@Service
public class TransactionServiceImpl {

	@Autowired
    private AuthorDao authorDao;
 
    public int add1(Author author) {
        int n = this.authorDao.add(author);    
        if(author.getRealName().length() > 5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }
 
    @Transactional(noRollbackFor={IllegalArgumentException.class})
    public int add2(Author author) {
        int n = this.authorDao.add(author);    
        if(author.getRealName().length() > 5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }
 
    @Transactional(rollbackFor={IllegalArgumentException.class})
    public int add3(Author author) {
        int n = this.authorDao.add(author);    
        if(author.getRealName().length() > 5){
            throw new IllegalArgumentException("author real name is too long.");
        }
        return n;
    }
}

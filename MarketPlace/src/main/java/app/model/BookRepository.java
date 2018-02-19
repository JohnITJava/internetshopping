package app.model;

import app.entities.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.util.List;

@Repository
@Transactional
public class BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void addBook(Book book) {
        this.sessionFactory.getCurrentSession().save(book);
    }

    public List<Book> listAll(){
        return (List<Book>) this.sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    public void removeBook(Integer id) {
        Book contact = (Book) this.sessionFactory.getCurrentSession().load(
                Book.class, id);
        if (null != contact) {
            this.sessionFactory.getCurrentSession().delete(contact);
        }
    }

}

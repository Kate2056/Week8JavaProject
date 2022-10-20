/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import library.beans.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

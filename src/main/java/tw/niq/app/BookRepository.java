package tw.niq.app;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.niq.app.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

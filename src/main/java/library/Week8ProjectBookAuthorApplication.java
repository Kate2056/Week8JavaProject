package library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import library.beans.Author;
import library.beans.Book;
import library.controller.BeanConfiguration;
import library.repository.BookRepository;




@SpringBootApplication
public class Week8ProjectBookAuthorApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(Week8ProjectBookAuthorApplication.class, args);
		}
	

	@Autowired
	BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Book b = appContext.getBean("book", Book.class);
		repo.save(b);
		
		Book bookOne = new Book("Tex", "Young Adult");
		Author bookOneAuthor = new Author("S.E.", "Hinton");
		bookOne.setAuthor(bookOneAuthor);
		repo.save(bookOne);
		
		Book bookTwo = new Book("The Notebook", "Romance");
		Author bookTwoAuthor = new Author("Nicholas", "Sparks");
		bookTwo.setAuthor(bookTwoAuthor);
		repo.save(bookTwo);
		
		Book bookThree= new Book("Catch-22", "Historical Fiction");
		Author bookThreeAuthor = new Author("Joseph", "Heller");
		bookThree.setAuthor(bookThreeAuthor);
		repo.save(bookThree);
		
		List<Book> allMyBooks = repo.findAll();
		for(Book books: allMyBooks) {
			System.out.println(books.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}

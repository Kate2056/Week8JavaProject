/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package library.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import library.beans.Author;
import library.beans.Book;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Book book() {
		Book bean = new Book();
		bean.setTitle("Gone with the Wind");
		bean.setGenre("Historical Fiction");
		return bean;
	}
	
	@Bean
	public Author author() {
		Author bean = new Author("Margaret", "Mitchell");
		return bean;
	}
}

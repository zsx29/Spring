package kr.co.ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		advice.beforeAdvice1();
		System.out.println("ÇÙ½É°ü½É - insertArticle");
		advice.afterAdvice1();
	}
	
	// around
	public void selectArticle() {
		// before
		System.out.println("ÇÙ½É°ü½É - selectArticle");
		// after
	}
	// after-returning
	// around
	
	public void updateArticle() {
		// before
		System.out.println("ÇÙ½É°ü½É - updateArticle");
		// after
	}
	
	public void deleteArticle() {
		// before
		System.out.println("ÇÙ½É°ü½É - deleteArticle");
		// after
	}
}
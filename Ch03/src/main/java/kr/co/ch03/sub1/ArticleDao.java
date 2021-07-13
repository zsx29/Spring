package kr.co.ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		advice.beforeAdvice1();
		System.out.println("�ٽɰ��� - insertArticle");
		advice.afterAdvice1();
	}
	
	// around
	public void selectArticle() {
		// before
		System.out.println("�ٽɰ��� - selectArticle");
		// after
	}
	// after-returning
	// around
	
	public void updateArticle() {
		// before
		System.out.println("�ٽɰ��� - updateArticle");
		// after
	}
	
	public void deleteArticle() {
		// before
		System.out.println("�ٽɰ��� - deleteArticle");
		// after
	}
}
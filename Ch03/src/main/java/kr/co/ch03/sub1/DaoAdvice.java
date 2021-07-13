package kr.co.ch03.sub1;

import org.springframework.stereotype.Component;

@Component
public class DaoAdvice {
	
	public void beforeAdvice1() {
		System.out.println("=====================");
		System.out.println("부가기능 - beforeAdvice1");
	}
	
	public void beforeAdvice2() {
		System.out.println("=====================");
		System.out.println("부가기능 - beforeAdvice2");
	}
	
	public void beforeAdvice3() {
		System.out.println("=====================");
		System.out.println("부가기능 - beforeAdvice3");
	}
	
	public void afterAdvice1() {
		System.out.println("부가기능 - afterAdvice1");
		System.out.println("---------------------");
	}
	public void afterAdvice2() {
		System.out.println("부가기능 - afterAdvice2");
		System.out.println("---------------------");
	}
	public void afterAdvice3() {
		System.out.println("부가기능 - afterAdvice3");
		System.out.println("---------------------");
	}
}
package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/07/13
 * �̸� : ������
 * ���� : ������ AOP �ǽ��ϱ�
 * 
 * ������ AOP(Aspect Oriented Programming)
 * - �ٽɰ��ɰ� ��ü�� ����Ǵ� ��������� �и��ؼ� ���α׷��� �ϴ� ���
 * 
 * ��������Ʈ(JoinPoint)
 * - �����ϴ� ��� �ٽɰ��� �޼���(����Ʈ��)
 * 
 * ����Ʈ��(PointCut)
 * - ��������Ʈ ��� ����Ǵ� �ٽɰ��� �޼���
 * 
 * �����̽�(Advice)
 * - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼���
 * 
 * ������Ʈ(Aspect)
 * - ����Ʈ�ư� �����̽��� ���յ� �������
 * 
 * ����(Weaving)
 * - ����Ʈ�ƿ� ����ɶ� �����̽��� ����Ʈ�ƿ� ���յǴ� ����
 * 
 */

public class AOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		ArticleDao dao = (ArticleDao) ctx.getBean("articleDao");
		
		dao.insertArticle();
		dao.selectArticle();
		dao.updateArticle();
		dao.deleteArticle();
	}
}

package in.aryan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aryan.service.BookService;

public class TestMyApp {
	public static void main(String[] args) {
		 ApplicationContext cntx=
		 new ClassPathXmlApplicationContext("beans.xml");
		 BookService service = cntx.getBean(BookService.class);
		 service.newSt(); 
	}

}

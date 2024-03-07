package in.aryan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbctemplateClass {
       
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate template= context.getBean(JdbcTemplate.class);	
		String query="insert into students(roll_no,student_name,student_add)values(?,?,?)";
	     //int result=template.update(query,223,"Aryan Motwani","HYD");
	     int result2=template.update(query,224,"Raju","HYD");
	     
	     //System.out.println("number of record inserted"+result);
	     System.out.println("number of record inserted::"+result2);
		
		
	}

}

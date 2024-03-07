package in.aryan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class BookDaoImpl implements BookDao {
	JdbcTemplate template;

	public BookDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public String search() {
		/* String mysql="select * from book where book_id=?"; */
		return "Query Executed";
	}

	@Override
	public String searchByid(int id) {
		/*
		 * String
		 * query="UPDATE BOOK SET BOOK_PRICE=BOOK_PRICE+100 where book_name='angular';";
		 * template.update(query); return "record ubdated successfully";
		 */
		return "record ubdated successfully";
	}

	@Override
	public boolean save() {
		
		/*
		 * String query="insert into book values(1,'Java',499)";
		 * 
		 * String query1="insert into book values(2,'phython',599)"; String
		 * query2="insert into book values(3,'react',699)"; String
		 * query3="insert into book values(4,'sql',799)"; String
		 * query4="insert into book values(5,'spring',899)";
		 * 
		 * template.execute(query);
		 * 
		 * template.execute(query1); 
		 * template.execute(query2); 
		 * template.execute(query3);
		 * template.execute(query4);
		 */

		return true;
	}
	@Override
	public boolean mySqlDeleting() {
		/* String query="DELETE FROM BOOK WHERE BOOK_ID=2;"; */
		/* template.execute(query); */
		return true;
	}
@Override
	public boolean newStudent() {
		String query="create table students(id int(10),name varchar(20),address varchar(20));";
		template.execute(query);
		return true;
	}

}

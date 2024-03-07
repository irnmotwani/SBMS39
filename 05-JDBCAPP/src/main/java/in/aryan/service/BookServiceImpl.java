package in.aryan.service;

import org.springframework.beans.factory.annotation.Autowired;

import in.aryan.dao.BookDao;

public class BookServiceImpl implements BookService {
	
	
	BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public void saveAll(){
		boolean status =bookDao.save();
		if(status) {
			System.out.println("Insert Query Updated....!");
		}else {
			System.out.println("Query Not Insterd into DB...!");
		}

	}
	@Override
	public void search() {
		String searchByid = bookDao.searchByid(4);
		if(searchByid!=null) {
			System.out.println("Record Ubdated Successfully");
		}
		else {
		System.out.println("Could not update the record");
		}
		
	}
    @Override
	public void searching() {
	bookDao.search();
	}
    @Override
    public void rowDeleting() {
      boolean status = bookDao.mySqlDeleting();     
    if(status) {
    	System.out.println("row deleted successfully");
    	
    }
    else {
    	System.out.println("Row Not Deleted");
    }
    	
    }
    @Override
    public void newSt() {
    boolean status = bookDao.newStudent();
    	if(status) {
    		System.out.println("New Table Created");
    	}
    	else {
    		System.out.println("Not Created Table");
    	}
    }
    

}

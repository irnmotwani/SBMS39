package in.aryan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.aryan.entity.Person;

public interface PersonRepo extends CrudRepository<Person,Integer> {
	 
	@Query("from Person")
	public List<Person> getAll();
	
	

}

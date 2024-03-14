package in.aryan.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import in.aryan.entity.Person;
import in.aryan.img.ImageUtil;
import in.aryan.repo.PersonRepo;

@Service
public class PersonService {
 
	PersonRepo repo;
	
	public PersonService(PersonRepo repo) {
	this.repo=repo;
	}
	
	public void saveRecord(Person p) {
		repo.save(p);
	}
	public void callCustom() {
		List<Person> all = repo.getAll();
		all.forEach(e->System.out.println(e));
	}
	
}

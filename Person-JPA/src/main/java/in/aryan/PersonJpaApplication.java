package in.aryan;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.aryan.entity.Person;
import in.aryan.img.ImageUtil;
import in.aryan.service.PersonService;

@SpringBootApplication
public class PersonJpaApplication implements CommandLineRunner {
    @Autowired
	PersonService service;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	   Person p=new Person();
	   p.setpId(101);
	   p.setpName("aryan");
	   p.setGender("male");
	   p.setDob(new java.sql.Date(22, 10, 10));
	   byte[] resumeData =ImageUtil.readImageFile("C:/Users/Lenovo/Downloads/Aryan.docx");
	   byte[] imageData=ImageUtil.readImageFile("C:/Users/Lenovo/Downloads/image.jpg");
	   p.setImage(imageData);
	   p.setResume(resumeData);
	   service.saveRecord(p);
	   service.callCustom();
		
	}

}

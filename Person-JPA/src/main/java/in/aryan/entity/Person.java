package in.aryan.entity;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Person {
	
	@Id
    private Integer pId;
    private String pName;
    private String gender;
    private Date dob;
    

	@Lob
	@Column(length = 1000000)
    private byte[] image; 
     
    @Lob 
    @Column(length = 1000000)
    private byte[] resume;

    
    public Person() {
	
	}
    
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getResume() {
		return resume;
	}

	public void setResume(byte[] resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", gender=" + gender + ", dob=" + dob + ", image="
				+ Arrays.toString(image) + ", resume=" + Arrays.toString(resume) + "]";
	}
    
    
    
} 

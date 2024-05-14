package Main;

import MainList.*;
import GUI.*;
import FILE.*;

public class Patient {	
    private String name;
    private String disease;
    private int age;
    private String admitted;
	 private String released;
	private String gender;
	
	
    public Patient() {}
	
    public Patient(String name, String disease, int age,String admitted,String released, String gender) {
		setName(name);
        setDisease(disease);
        setAge(age);
        setAdmitted(admitted);
		setReleased(released);
		setGender(gender);
		
    }
	
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setDisease(String disease) {
        this.disease = disease;
    }


    public String getDisease() {
        return disease;
    }
	
	public void setGender(String gender) {
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }
	
	public void setAdmitted(String admitted) {
        this.admitted = admitted;
    }


    public String getAdmitted() {
        return admitted;
    }


    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age should be positive");
        }
    }


    public int getAge() {
        return age;
    }
    public void setReleased(String released) {
        this.released = released;
    }


    public String getReleased() {
        return released;
    }
	public String getPatientAsString(){
		return 
		"*********************************************"+"\n"+
        "Full Name: " + name+"\n"+
        "Age: " + age+"\n"+
		"Gender: " + gender+"\n"+
		"Disease:"+ disease+"\n"+
		"Admitted in: " + admitted+"\n"+
        "Released in: " + released+"\n"+
		"*********************************************"+"\n";
	}
}
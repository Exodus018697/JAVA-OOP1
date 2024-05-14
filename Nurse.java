package Main;

import MainList.*;
import GUI.*;
import FILE.*;

public class Nurse {	
    private String name;
    private String id;
    private int age;
    private int jobexperience;
	private String gender;
	
    public Nurse() {}
	
    public Nurse(String name, String id, int age, int jobexperience, String gender) {
		setName(name);
        setId(id);
        setAge(age);
        setJobexperience(jobexperience);
		setGender(gender);	
    }
	
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }
	
	public void setGender(String gender) {
        this.gender = gender;
    }


    public String getGender() {
        return gender;
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

    public void setJobexperience(int jobexperience) {
        if (jobexperience >= 0) {
            this.jobexperience = jobexperience;
        } else {
            System.out.println("Invalid JOBEXPERIENCE");
        }
    }

    public int getJobexperience() {
        return jobexperience;
    }
	public String getNurseAsString(){
		return "------------------"+"\n"+
        "ID: " + id+"\n"+
        "Full Name: " + name+"\n"+
        "Age: " + age+"\n"+
		"Gender: " + gender+"\n"+
        "Job experience: " + jobexperience+"\n"+
		"------------------"+"\n";
	}
}
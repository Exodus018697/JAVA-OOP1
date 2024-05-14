package Main;

import MainList.*;
import GUI.*;
import FILE.*;

public class Doctor {	
    private String name;
    private String id;
    private int age;
    private int experience;
	private String gender;
	private String Area;
	
    public Doctor() {}
	
    public Doctor(String name, String id, int age, int experience, String Area, String gender) {
		setName(name);
        setId(id);
        setAge(age);
        setExperience(experience);
		setArea(Area);
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
	
	public void setArea(String Area) {
        this.Area = Area;
    }


    public String getArea() {
        return Area;
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

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            System.out.println("Invalid EXPERIENCE");
        }
    }

    public int getExperience() {
        return experience;
    }
	public String getDoctorAsString(){
		return 
		"*********************************************"+"\n"+
        "Full Name: " + name+"\n"+
        "ID: " + id+"\n"+
        "Age: " + age+"\n"+
		"Gender: " + gender+"\n"+
		"Expert in: " + Area+"\n"+
        "Experience: " + experience+" Years\n"+
		"*********************************************"+"\n";
	}
}
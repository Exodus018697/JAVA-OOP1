package MainList;

import Main.*;
import GUI.*;
import FILE.*;

public class DoctorList{
	private Doctor doctors[];
	public DoctorList(){
		doctors = new Doctor[5];
	}
	public DoctorList(int size){
		doctors = new Doctor[size];
	}
	
	public void insert(Doctor s){
		for(int i=0;i<doctors.length;i++){
			if(doctors[i] == null){
				doctors[i] = s;
				break;
			}
		}	
	}
	public Doctor getById(String id){
		Doctor s = null;
		for(int i=0;i<doctors.length;i++){
			if(doctors[i] != null){
				if(doctors[i].getId().equals(id) ){
					s = doctors[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void remove(String id){
		for(int i=0;i<doctors.length;i++){
			if(doctors[i] != null){
				if(doctors[i].getId().equals(id) ){
					doctors[i] = null;
					break;
				}
			}
		}
	}
	public String getAllAsString(){
		String s = "";
		for(int i=0;i<doctors.length;i++){
			if(doctors[i] != null){
				s+= doctors[i].getDoctorAsString();
			}
		}
		return s;
	}
}
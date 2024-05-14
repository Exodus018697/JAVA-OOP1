package MainList;

import Main.*;
import GUI.*;
import FILE.*;

public class PatientList{
	private Patient patients[];
	public PatientList(){
		patients = new Patient[5];
	}
	public PatientList(int size){
		patients = new Patient[size];
	}
	
	public void insert(Patient s){
		for(int i=0;i<patients.length;i++){
			if(patients[i] == null){
				patients[i] = s;
				break;
			}
		}	
	}
	public 	Patient getByName(String name){
		Patient s = null;
		for(int i=0;i<patients.length;i++){
			if(patients[i] != null){
				if(patients[i].getName().equals(name) ){
					s = patients[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void remove(String name){
		for(int i=0;i<patients.length;i++){
			if(patients[i] != null){
				if(patients[i].getName().equals(name) ){
					patients[i] = null;
					break;
				}
			}
		}
	}
	public String getAllAsString(){
		String s = "";
		for(int i=0;i<patients.length;i++){
			if(patients[i] != null){
				s+= patients[i].getPatientAsString();
			}
		}
		return s;
	}
}
package MainList;

import Main.*;
import GUI.*;
import FILE.*;

public class NurseList{
	private Nurse nurses[];
	public NurseList(){
		nurses = new Nurse[5];
	}
	public NurseList(int size){
		nurses = new Nurse[size];
	}
	
	public void insert(Nurse s){
		for(int i=0;i<nurses.length;i++){
			if(nurses[i] == null){
				nurses[i] = s;
				break;
			}
		}	
	}
	public Nurse getById(String id){
		Nurse s = null;
		for(int i=0;i<nurses.length;i++){
			if(nurses[i] != null){
				if(nurses[i].getId().equals(id) ){
					s = nurses[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void remove(String id){
		for(int i=0;i<nurses.length;i++){
			if(nurses[i] != null){
				if(nurses[i].getId().equals(id) ){
					nurses[i] = null;
					break;
				}
			}
		}
	}
	public String getAllAsString(){
		String s = "";
		for(int i=0;i<nurses.length;i++){
			if(nurses[i] != null){
				s+= nurses[i].getNurseAsString();
			}
		}
		return s;
	}
}
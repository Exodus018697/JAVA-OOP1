package FILE;
import java.util.*;
import java.io.*;

import MainList.*;
import Main.*;

public class Filemain{
	public static boolean Check(String Name, String Pass){
		boolean CHECK1 = false;
		try{
			Scanner all= new Scanner( new File("./FILE/ImportantInformation.txt"));
			while(all.hasNextLine()){
				String data[] = all.nextLine().split(";");
				if(Name.equals(data[0]) && Pass.equals(data[1])){
					CHECK1 = true;
					break;
				}
			}
			all.close();
		}
		catch(Exception e){
			System.out.println("File Not Found..");
		}
		return CHECK1;
	}
	public static void Register (String Name, String Pass){
		try{
			FileWriter fileWritermain = new FileWriter(new File("./FILE/ImportantInformation.txt"),true);
			fileWritermain.write(Name+";"+Pass+"\n");
			fileWritermain.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
	}
	public static void addDoctors(Doctor doc){
		try{
			FileWriter filedoc = new FileWriter(new File("./FILE/doctors.txt"),true);
			filedoc.write(doc.getName()+";"+doc.getId()+";"+doc.getAge()+";"+doc.getExperience()+";"+doc.getArea()+";"+doc.getGender()+"\n");
			filedoc.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
	}
	
	public static void loadAllDoctors(DoctorList doctors){
		try{
			Scanner sc = new Scanner(new File("./FILE/Doctors.txt"));
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");
				
				Doctor doc = new Doctor(data[0],data[1],
								Integer.parseInt(data[2]),
								Integer.parseInt(data[3]),
								data[4],data[5]);
								
				doctors.insert(doc);
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
		
	}
	public static void addPatients(Patient pat){
		try{
			FileWriter filepat = new FileWriter(new File("./FILE/Patients.txt"),true);
			filepat.write(pat.getName()+";"+pat.getDisease()+";"+pat.getAge()+";"+pat.getAdmitted()+";"+pat.getReleased()+";"+pat.getGender()+"\n");
			filepat.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
	}
	
	public static void loadAllPatients(PatientList pantients){
		try{
			Scanner sc2 = new Scanner(new File("./FILE/Patients.txt"));
			while(sc2.hasNextLine()){
				String data[] = sc2.nextLine().split(";");
				
				Patient pat = new Patient(data[0],data[1],
								Integer.parseInt(data[2]),
								data[3],
								data[4],data[5]);
								
				pantients.insert(pat);
			}
			sc2.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
		
	}
	public static void addNurses(Nurse nur){
		try{
			FileWriter filenur = new FileWriter(new File("./FILE/Nurses.txt"),true);
			filenur.write(nur.getName()+";"+nur.getId()+";"+nur.getAge()+";"+nur.getJobexperience()+";"+nur.getGender()+"\n");
			filenur.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
	}
	
	public static void loadAllNurses(NurseList nurses){
		try{
			Scanner sc3 = new Scanner(new File("./FILE/Nurses.txt"));
			while(sc3.hasNextLine()){
				String data[] = sc3.nextLine().split(";");
				
				Nurse Nur = new Nurse(data[0],data[1],
								Integer.parseInt(data[2]),
								Integer.parseInt(data[3]),
								data[4]);
								
				nurses.insert(Nur);
			}
			sc3.close();
		}
		catch(Exception e){
			System.out.println("File Not Found");
		}
		
	}
}
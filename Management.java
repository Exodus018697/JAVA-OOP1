package Main;

import MainList.*;
import GUI.*;
import FILE.*;

public class Management{
	private int Room=100;
	private int Ambulance=20;
	private int OT=20;
	private int ICU=5;
	private int MRITEST=2;
	private int X_rayRoom=3;
	private int BloodTestRoom=5;
	private int OtherTestRoom=20;
	
	public Management(){}
	public Management(int RoomN, int AmbulanceN, int OTN, int ICUN, int MRITESTN,int X_rayRoomN,int BloodTestRoomN, int OtherTestRoomN){
		setRoom(RoomN);
		setAmbulance(AmbulanceN);
		setOT(OTN);
		setICU(ICUN);
		setMRITEST(MRITESTN);
		setX_rayRoom(X_rayRoomN);
		setBloodTestRoom(BloodTestRoomN);
		setOtherTestRoom(OtherTestRoomN);
	}
	
	public void setRoom(int RoomN) {
        if (RoomN <= Room && RoomN >=0) {
            Room = Room-RoomN;
        } else {
            System.out.println("RoomN should be positive");
        }
    }


    public int getRoom() {
        return Room;
    }
	
	public void setAmbulance(int AmbulanceN) {
        if (AmbulanceN <= Ambulance && AmbulanceN >=0) {
            Ambulance = Ambulance-AmbulanceN;
        } else {
            System.out.println("AmbulanceN should be positive");
        }
    }
	
	public int getAmbulance() {
        return Ambulance;
    }
	
	public void setOT(int OTN) {
        if (OTN <= OT && OTN >=0) {
            OT = OT-OTN;
        } else {
            System.out.println("OTN should be positive");
        }
    }
	
	public int getOT() {
        return OT;
    }
	
	public void setICU(int ICUN) {
        if (ICUN <= ICU && ICUN >=0) {
            ICU = ICU-ICUN;
        } else {
            System.out.println("ICUN should be positive");
        }
    }
	
	public int getICU() {
        return ICU;
    }
	
	public void setMRITEST(int MRITESTN) {
        if (MRITESTN <= MRITEST && MRITESTN >=0) {
            MRITEST = MRITEST-MRITESTN;
        } else {
            System.out.println("MRITESTN should be positive");
        }
    }
	
	public int getMRITEST() {
        return MRITEST;
    }
	
	public void setX_rayRoom(int X_rayRoomN) {
        if (X_rayRoomN <= X_rayRoom && X_rayRoomN >=0) {
            X_rayRoom = X_rayRoom-X_rayRoomN;
        } else {
            System.out.println("X_rayRoomN should be positive");
        }
    }
	
	public int getX_rayRoom() {
        return X_rayRoom;
    }
	
	public void setBloodTestRoom(int BloodTestRoomN) {
        if (BloodTestRoomN <=BloodTestRoom && BloodTestRoomN >=0) {
            BloodTestRoom = BloodTestRoom-BloodTestRoomN;
        } else {
            System.out.println("BloodTestRoomN should be positive");
        }
    }
	
	public int getBloodTestRoom() {
        return BloodTestRoom;
    }
	
	public void setOtherTestRoom(int OtherTestRoomN) {
        if (OtherTestRoomN <=OtherTestRoom && OtherTestRoomN >=0) {
            OtherTestRoom = OtherTestRoom-OtherTestRoomN;
        } else {
            System.out.println("OtherTestRoomN should be positive");
        }
    }
	
	public int getOtherTestRoom() {
        return OtherTestRoom;
    }
	
	public String getManagementAsString(){
		return 
		"*********************************************"+"\n"+
        "Room Available: " + Room+"\n"+
        "Ambulance Available: " + Ambulance+"\n"+
		"Available Operating Theater: " + OT+"\n"+
		"Available X-ray Room:"+ X_rayRoom+"\n"+
		"Available MRI Room: " + MRITEST+"\n"+
		"Available ICU: " + ICU+"\n"+
        "Available Blood Test Room: " + BloodTestRoom+"\n"+
		"Available Other Test Room: " + OtherTestRoom+"\n"+
		"*********************************************"+"\n";
	}
}
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class MainPage extends JFrame implements ActionListener{
    JButton PatientManage, DoctorManage, NurseManage, RoomManage,logoutBT, RegBT;
	Loginmain login;
    Font font = new Font("cambria", Font.PLAIN, 20);
	Font fontAllTitle = new Font("ADLaM Display", Font.PLAIN, 20);
	Font fontMang = new Font("cambria", Font.PLAIN, 15);
	Font fontHOMP = new Font("Cambria",Font.PLAIN,30);
	DoctorList doctors = new DoctorList(100);
	PatientList patients = new PatientList(100);
	NurseList nurses = new NurseList(100);
    
	public MainPage(Loginmain login) {
        super("Main Page");
        this.setSize(1100, 700);
        this.setLocation(200, 80);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.login = login;
		Filemain.loadAllDoctors(doctors);
		Filemain.loadAllPatients(patients);
		Filemain.loadAllNurses(nurses);
		
        PatientManage = new JButton("PATIENT");
        PatientManage.setBounds(650, 100, 130, 130);
        PatientManage.setFont(fontAllTitle);
        PatientManage.addActionListener(this);
        this.add(PatientManage);
		
		DoctorManage = new JButton("DOCTOR");
        DoctorManage.setBounds(855, 100, 130, 130);
        DoctorManage.setFont(fontAllTitle);
        DoctorManage.addActionListener(this);
        this.add(DoctorManage);
		
		NurseManage = new JButton("NURSE");
        NurseManage.setBounds(650, 285, 130, 130);
        NurseManage.setFont(fontAllTitle);
        NurseManage.addActionListener(this);
        this.add(NurseManage);
		
		RoomManage = new JButton("MANAGEMENT");
        RoomManage.setBounds(855, 285, 130, 130);
        RoomManage.setFont(fontMang);
        RoomManage.addActionListener(this);
        this.add(RoomManage);
		
		logoutBT = new JButton("Logout");
        logoutBT.setBounds(10, 10, 100, 30);
        logoutBT.setFont(font);
		logoutBT.setBackground(Color.RED);
		logoutBT.setForeground(Color.WHITE);
        logoutBT.addActionListener(this);
        this.add(logoutBT);
		
		RegBT = new JButton("REGISTER NEW USER");
        RegBT.setBounds(120, 10, 300, 30);
        RegBT.setFont(font);
		RegBT.setBackground(new Color(33,150,243));
		RegBT.setForeground(Color.BLACK);
        RegBT.addActionListener(this);
        this.add(RegBT);
		
		
		JLabel WelcomeLabe = new JLabel("HOSPITAL MANAGMENT SYSTEM");
        WelcomeLabe.setBounds(60, 100, 500, 25);
        WelcomeLabe.setFont(fontHOMP);
        this.add(WelcomeLabe);
		
		ImageIcon HomeGif= new ImageIcon("./Resources/giphyHome1.gif");
		JLabel HG= new JLabel(HomeGif);
		HG.setBounds(50, 160, 500, 500);
		this.add(HG);

		ImageIcon HomBG = new ImageIcon("./Resources/HOMEPAGE_1100x700.jpg");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel HOMEPAGEBG = new JLabel(HomBG);
		HOMEPAGEBG.setBounds(0,0,1100,700);
		this.add(HOMEPAGEBG);
		
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (PatientManage == e.getSource()) {
			PatientPage patie= new PatientPage(this,patients);
			this.setVisible(false);	
        }
		else if(logoutBT == e.getSource()){
			login.setVisible(true);
			this.dispose();
		}
		else if(DoctorManage == e.getSource()){
			DoctorPage DocPage = new DoctorPage(this,doctors); 
			this.setVisible(false);
		}
		else if(RegBT == e.getSource()){
			RegisterPage reg = new RegisterPage();
		}
		else if(NurseManage == e.getSource()){
			NursePage Nurse = new NursePage(this,nurses);
		}
		else if(RoomManage == e.getSource()){
			ManagementPage manag = new ManagementPage(this);
			this.setVisible(false);
		}
    }
}
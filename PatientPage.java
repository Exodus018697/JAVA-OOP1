package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class PatientPage extends JFrame implements ActionListener{
	Font font = new Font("Cambria",Font.PLAIN,20);
	Font fontDOCP = new Font("Cambria",Font.PLAIN,30);
	Font fontMain = new Font("cambria", Font.PLAIN, 13);
	JTextField name,age,disease,gender,admitted,released, Remove, Search;
	JTextArea textArea;
	JComboBox genderComboBox;
	JButton addBtn,BackBT,RemoveBT, SearchBT, ShowallBT;
	PatientList Patients;
	MainPage home;
	public PatientPage(MainPage home, PatientList Patients){
		super("Patient Management Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1100,700);
		this.setLocation(200,80);
		this.setLayout(null);
		this.home = home;
		this.Patients = Patients;
		
		JLabel Title = new JLabel("Welcome to Patient Management Page");
		Title.setBounds(300,10,600,40);
		Title.setFont(fontDOCP);
		this.add(Title);
		
		int Space = 100;
		
		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setBounds(10,Space,100,30);
		nameLabel.setFont(font);
		this.add(nameLabel);
		
		name = new JTextField();
		name.setBounds(150,Space,200,30);
		name.setFont(font);
		this.add(name);
		
		Space+=40;
		JLabel ageLabel = new JLabel("Patient's Age");
		ageLabel.setBounds(10,Space,150,30);
		ageLabel.setFont(font);
		this.add(ageLabel);
		
		age = new JTextField();
		age.setBounds(150,Space,200,30);
		age.setFont(font);
		this.add(age);
		
		Space+=40;
		JLabel diseaseLabel = new JLabel("Disease");
		diseaseLabel.setBounds(10,Space,100,30);
		diseaseLabel.setFont(font);
		this.add(diseaseLabel);
		
		disease = new JTextField();
		disease.setBounds(150,Space,200,30);
		disease.setFont(font);
		this.add(disease);
		
		Space+=40;
		JLabel genderLabel = new JLabel("Gender");
		genderLabel.setBounds(10,Space,100,30);
		genderLabel.setFont(font);
		this.add(genderLabel);

		genderComboBox = new JComboBox(new String[]{"Male","Female","Others"});
		genderComboBox.setBounds(150,Space,200,30);
		genderComboBox.setFont(font);
		this.add(genderComboBox);
		
		Space+=40;
		JLabel admittedLabe = new JLabel("Admitted");
		admittedLabe.setBounds(10,Space,100,30);
		admittedLabe.setFont(font);
		this.add(admittedLabe);
	
		admitted = new JTextField();
		admitted.setBounds(150,Space,200,30);
		admitted.setFont(font);
		this.add(admitted);
		int AreaBox=Space;
		
		
		Space+=40;
		JLabel releasedLabe = new JLabel("Released");
		releasedLabe.setBounds(10,Space,100,30);
		releasedLabe.setFont(font);
		this.add(releasedLabe);
		
		released = new JTextField();
		released.setBounds(150,Space,200,30);
		released.setFont(font);
		this.add(released);
		
		Space+=40;
		addBtn = new JButton("Add A Patient");
		addBtn.setBounds(10,Space,350,30);
		addBtn.setFont(font);
		addBtn.setBackground(new Color(113,255,191));
		addBtn.setForeground(Color.BLACK);
		addBtn.addActionListener(this);
		this.add(addBtn);
		
		Space+=40;
		JLabel RemLabe = new JLabel("PUT PATIENT NAME TO REMOVE");
        RemLabe.setBounds(75, Space, 200, 25);
        RemLabe.setFont(fontMain);
        this.add(RemLabe);
		
		int remSpace=Space+25;
		Remove = new JTextField();
		Remove.setBounds(10,remSpace,350,30);
		Remove.setFont(font);
		this.add(Remove);
		
		remSpace+=35;
		RemoveBT = new JButton("Remove A Patiant");
		RemoveBT.setBounds(10,remSpace,350,30);
		RemoveBT.setFont(font);
		RemoveBT.setBackground(new Color(150,0,0));
		RemoveBT.setForeground(Color.WHITE);
		RemoveBT.addActionListener(this);
		this.add(RemoveBT);
		
		Space+=100;
		JLabel SearchLabe = new JLabel("PUT PATIENT NAME TO SEARCH");
        SearchLabe.setBounds(75, Space, 200, 25);
        SearchLabe.setFont(fontMain);
        this.add(SearchLabe);
		
		int SeaSpace=Space+25;
		Search = new JTextField();
		Search.setBounds(10,SeaSpace,350,30);
		Search.setFont(font);
		this.add(Search);
		
		SeaSpace+=35;
		SearchBT = new JButton("Search A Patiant");
		SearchBT.setBounds(10,SeaSpace,350,30);
		SearchBT.setFont(font);
		SearchBT.setBackground(new Color(36,194,40));
		SearchBT.setForeground(Color.WHITE);
		SearchBT.addActionListener(this);
		this.add(SearchBT);
		
		SeaSpace+=60;
		ShowallBT = new JButton("Show all Patiant");
		ShowallBT.setBounds(10,SeaSpace,350,50);
		ShowallBT.setFont(fontDOCP);
		ShowallBT.setBackground(new Color(247,90,215));
		ShowallBT.setForeground(Color.WHITE);
		ShowallBT.addActionListener(this);
		this.add(ShowallBT);
	
		BackBT = new JButton("MAIN PAGE");
		BackBT.setBounds(10,10,200,30);
		BackBT.setFont(font);
		BackBT.setBackground(Color.BLUE);
		BackBT.setForeground(Color.WHITE);
		BackBT.addActionListener(this);
		this.add(BackBT);

		textArea = new JTextArea();
		textArea.setFont(font);
		
		JScrollPane areaPane = new JScrollPane(textArea);
		areaPane.setBounds(400,100,600,AreaBox);
		this.add(areaPane);
		updateTextArea();
		
		ImageIcon bg2 = new ImageIcon("./Resources/PatiantGIF.gif");
		JLabel background2 = new JLabel(bg2);
		background2.setBounds(400,350,600,500);
		this.add(background2);
		
		ImageIcon bg = new ImageIcon("./Resources/download_1100x700_1_1100x7002.png");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,1100,700);
		this.add(background);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == addBtn){
			if(!name.getText().isEmpty()){
				Patient pat = new Patient(name.getText(),disease.getText(), 
										Integer.parseInt( age.getText()),
										admitted.getText(), released.getText(),genderComboBox.getSelectedItem().toString()  );
										
				textArea.setText(textArea.getText()+"\n"+pat.getPatientAsString() );
				Patients.insert(pat);
				Filemain.addPatients(pat);
				updateTextArea();
			}
			else{
				JOptionPane.showMessageDialog(this,"PLEASE ENTER A NAME");;
			}	
		}
		else if(e.getSource() == BackBT){
			home.setVisible(true);
			this.dispose();
		}
		else if(e.getSource() == SearchBT){
			Patient p = Patients.getByName(Search.getText());
			if(p!=null){
				textArea.setText(textArea.getText()+"\n"+p.getPatientAsString() );
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Patient Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource() ==ShowallBT){
			textArea.setText(textArea.getText()+"\n"+Patients.getAllAsString() );
		}
		else if(RemoveBT == e.getSource()){
			Patient p = Patients.getByName(name.getText());
			if(p!=null){
				Patients.remove(Remove.getText());
				updateTextArea();
				JOptionPane.showMessageDialog(this,"Patient Removed!","Removed",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Patient Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}
	
	
	
	
	public void updateTextArea(){
		textArea.setText(Patients.getAllAsString());
	}
}
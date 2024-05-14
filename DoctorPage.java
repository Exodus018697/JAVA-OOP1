package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class DoctorPage extends JFrame implements ActionListener{
	Font font = new Font("Cambria",Font.PLAIN,20);
	Font fontDOCP = new Font("Cambria",Font.PLAIN,30);
	Font fontMain = new Font("cambria", Font.PLAIN, 13);
	JTextField name,id,age, experience, area, Remove, Search, gender;
	JTextArea textArea;
	JButton addBtn,BackBT,RemoveBT, SearchBT, ShowallBT;
	DoctorList Doctors;
	JComboBox genderComboBox;
	MainPage home;
	public DoctorPage(MainPage home, DoctorList Doctors){
		super("Doctor Management Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1100,700);
		this.setLocation(200,80);
		this.setLayout(null);
		this.home = home;
		this.Doctors = Doctors;
		
		JLabel Title = new JLabel("Welcome to Doctor Management Page");
		Title.setBounds(300,10,500,40);
		Title.setFont(fontDOCP);
		this.add(Title);
		
		int Space = 100;
		
		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setBounds(10,Space,100,30);
		nameLabel.setFont(font);
		this.add(nameLabel);
		
		name = new JTextField();
		name.setBounds(120,Space,200,30);
		name.setFont(font);
		this.add(name);
		
		Space+=40;
		JLabel idLabel = new JLabel("Doctor's ID");
		idLabel.setBounds(10,Space,100,30);
		idLabel.setFont(font);
		this.add(idLabel);
		
		id = new JTextField();
		id.setBounds(120,Space,200,30);
		id.setFont(font);
		this.add(id);
		
		Space+=40;
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(10,Space,100,30);
		ageLabel.setFont(font);
		this.add(ageLabel);
		
		age = new JTextField();
		age.setBounds(120,Space,200,30);
		age.setFont(font);
		this.add(age);
		
		Space+=40;
		JLabel experienceLabe = new JLabel("Experience");
		experienceLabe.setBounds(10,Space,100,30);
		experienceLabe.setFont(font);
		this.add(experienceLabe);

		experience = new JTextField();
		experience.setBounds(120,Space,200,30);
		experience.setFont(font);
		this.add(experience);
		
		Space+=40;
		JLabel genderLabe = new JLabel("Gender");
		genderLabe.setBounds(10,Space,100,30);
		genderLabe.setFont(font);
		this.add(genderLabe);
	
		genderComboBox = new JComboBox(new String[]{"Male","Female","Others"});
		genderComboBox.setBounds(120,Space,200,30);
		genderComboBox.setFont(font);
		this.add(genderComboBox);
		
		Space+=40;
		JLabel areaLabe = new JLabel("Area");
		areaLabe.setBounds(10,Space,100,30);
		areaLabe.setFont(font);
		this.add(areaLabe);
		
		area = new JTextField();
		area.setBounds(120,Space,200,30);
		area.setFont(font);
		this.add(area);
		
		Space+=40;
		addBtn = new JButton("Add");
		addBtn.setBounds(120,Space,200,30);
		addBtn.setFont(font);
		addBtn.setBackground(new Color(113,255,191));
		addBtn.setForeground(Color.BLACK);
		addBtn.addActionListener(this);
		this.add(addBtn);
		
		JLabel RemLabe = new JLabel("PUT DOCTOR ID TO REMOVE");
        RemLabe.setBounds(815, 450, 200, 25);
        RemLabe.setFont(fontMain);
        this.add(RemLabe);
		
		Remove = new JTextField();
		Remove.setBounds(800,475,200,30);
		Remove.setFont(font);
		this.add(Remove);
		
		RemoveBT = new JButton("Remove");
		RemoveBT.setBounds(800,510,200,30);
		RemoveBT.setFont(font);
		RemoveBT.setBackground(new Color(150,0,0));
		RemoveBT.setForeground(Color.WHITE);
		RemoveBT.addActionListener(this);
		this.add(RemoveBT);
		
		ShowallBT = new JButton("Show all Doctor");
		ShowallBT.setBounds(800,600,200,30);
		ShowallBT.setFont(font);
		ShowallBT.setBackground(new Color(247,90,215));
		ShowallBT.setForeground(Color.WHITE);
		ShowallBT.addActionListener(this);
		this.add(ShowallBT);
		
		JLabel SearchLabe = new JLabel("PUT DOCTOR ID TO SEARCH");
        SearchLabe.setBounds(815, 240, 200, 25);
        SearchLabe.setFont(fontMain);
        this.add(SearchLabe);
		
		Search = new JTextField();
		Search.setBounds(800,265,200,30);
		Search.setFont(font);
		this.add(Search);
		
		SearchBT = new JButton("Search");
		SearchBT.setBounds(800,300,200,30);
		SearchBT.setFont(font);
		SearchBT.setBackground(new Color(36,194,40));
		SearchBT.setForeground(Color.WHITE);
		SearchBT.addActionListener(this);
		this.add(SearchBT);
	
		BackBT = new JButton("MAIN PAGE");
		BackBT.setBounds(10,620,200,30);
		BackBT.setFont(font);
		BackBT.setBackground(Color.BLUE);
		BackBT.setForeground(Color.WHITE);
		BackBT.addActionListener(this);
		this.add(BackBT);
		
		ImageIcon Docbg1= new ImageIcon("./Resources/HOMEPG2_300x250.png");
		JLabel DG1= new JLabel(Docbg1);
		DG1.setBounds(25, 380, 300, 250);
		this.add(DG1);
		
		ImageIcon Docbg2= new ImageIcon("./Resources/Pngtreethanks_for_saving_us_doctors_5354589_1_200x200.png");
		JLabel DG2= new JLabel(Docbg2);
		DG2.setBounds(795, 35, 200, 200);
		this.add(DG2);

		textArea = new JTextArea();
		textArea.setFont(font);
		
		JScrollPane areaPane = new JScrollPane(textArea);
		areaPane.setBounds(350,100,400,550);
		this.add(areaPane);
		updateTextArea();
		
		ImageIcon bg = new ImageIcon("./Resources/DoctorPage_1100x700.jpg");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,1100,700);
		this.add(background);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == addBtn){
			if(!name.getText().isEmpty()){
				Doctor Doc = new Doctor(name.getText(),id.getText(), 
										Integer.parseInt( age.getText()),
										Integer.parseInt(experience.getText()), area.getText(),genderComboBox.getSelectedItem().toString() );
										
				textArea.setText(textArea.getText()+"\n"+Doc.getDoctorAsString() );
				Doctors.insert(Doc);
				Filemain.addDoctors(Doc);
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
		else if(e.getSource() == ShowallBT){
			textArea.setText(textArea.getText()+"\n"+Doctors.getAllAsString() );
		}
		else if(e.getSource() == SearchBT){
			Doctor s = Doctors.getById(Search.getText());
			if(s!=null){
				textArea.setText(textArea.getText()+"\n"+s.getDoctorAsString() );
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Doctor Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(RemoveBT == e.getSource()){
			Doctor s = Doctors.getById(id.getText());
			if(s!=null){
				Doctors.remove(Remove.getText());
				updateTextArea();
				JOptionPane.showMessageDialog(this,"Doctor Removed!","Removed",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Doctor Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}
	
	
	
	
	public void updateTextArea(){
		textArea.setText(Doctors.getAllAsString());
	}
}
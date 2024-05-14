package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class NursePage extends JFrame implements ActionListener{
	Font font = new Font("Cambria",Font.PLAIN,20);
	Font fontNURP = new Font("Cambria",Font.PLAIN,30);
	Font fontMain = new Font("cambria", Font.PLAIN, 13);
	JTextField name,id,age, jobexperience,Remove,Search,gender;
	JTextArea textArea;
	JComboBox genderComboBox;
	JButton addBtn,BackBT,RemoveBT,SearchBT, ShowallBT;
	NurseList Nurses;
	MainPage home;
	public NursePage(MainPage home, NurseList Nurses){
		super("Nurse Management Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1100,700);
		this.setLocation(200,80);
		this.setLayout(null);
		this.home = home;
		this.Nurses = Nurses;
		
		JLabel Title = new JLabel("Welcome to Nurse Management Page");
		Title.setBounds(300,10,600,40);
		Title.setFont(fontNURP);
		this.add(Title);
		
		JLabel nameLabel = new JLabel("Full Name:");
		nameLabel.setBounds(10,60,100,30);
		nameLabel.setFont(font);
		this.add(nameLabel);
		
		name = new JTextField();
		name.setBounds(120,60,200,30);
		name.setFont(font);
		this.add(name);
		
		int Space=100;
		JLabel ageLabel = new JLabel("Nurse Age:");
		ageLabel.setBounds(10,Space,100,30);
		ageLabel.setFont(font);
		this.add(ageLabel);
		
		age = new JTextField();
		age.setBounds(120,Space,200,30);
		age.setFont(font);
		this.add(age);
		
		Space = 340;
		JLabel idLabel = new JLabel("Nurse's ID:");
		idLabel.setBounds(Space,60,100,30);
		idLabel.setFont(font);
		this.add(idLabel);
		
		Space+= 150;
		id = new JTextField();
		id.setBounds(Space,60,200,30);
		id.setFont(font);
		this.add(id);
		
		
		Space =340;
		JLabel jobexperienceLabe = new JLabel("Job Experience:");
		jobexperienceLabe.setBounds(Space,100,150,30);
		jobexperienceLabe.setFont(font);
		this.add(jobexperienceLabe);
		
		Space +=150;
		jobexperience = new JTextField();
		jobexperience.setBounds(Space,100,200,30);
		jobexperience.setFont(font);
		this.add(jobexperience);
		
		Space =700;
		JLabel genderLabe = new JLabel("Gender:");
		genderLabe.setBounds(Space,60,150,30);
		genderLabe.setFont(font);
		this.add(genderLabe);
		
		JLabel RemLabe = new JLabel("PUT NURSE ID TO REMOVE");
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
		
		ShowallBT = new JButton("Show all Nurse");
		ShowallBT.setBounds(800,600,200,30);
		ShowallBT.setFont(font);
		ShowallBT.setBackground(new Color(247,90,215));
		ShowallBT.setForeground(Color.WHITE);
		ShowallBT.addActionListener(this);
		this.add(ShowallBT);
		
		JLabel SearchLabe = new JLabel("PUT NURSE ID TO SEARCH");
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
		
		Space+=75;
		genderComboBox = new JComboBox(new String[]{"Male","Female","Others"});
		genderComboBox.setBounds(Space,60,200,30);
		genderComboBox.setFont(font);
		this.add(genderComboBox);

		Space+=210;
		addBtn = new JButton("Add");
		addBtn.setBounds(Space,60,90,90);
		addBtn.setFont(font);
		addBtn.setBackground(new Color(113,255,191));
		addBtn.setForeground(Color.BLACK);
		addBtn.addActionListener(this);
		this.add(addBtn);
	
		BackBT = new JButton("MAIN PAGE");
		BackBT.setBounds(10,620,200,30);
		BackBT.setFont(font);
		BackBT.setBackground(Color.BLUE);
		BackBT.setForeground(Color.WHITE);
		BackBT.addActionListener(this);
		this.add(BackBT);

		textArea = new JTextArea();
		textArea.setFont(font);
		
		JScrollPane areaPane = new JScrollPane(textArea);
		areaPane.setBounds(350,150,400,500);
		this.add(areaPane);
		updateTextArea();
		
		ImageIcon bg = new ImageIcon("./Resources/giphy.gif");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(10,130,350,480);
		this.add(background);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == addBtn){
			if(!name.getText().isEmpty()){
				
				Nurse Nur = new Nurse(name.getText(),id.getText(), 
										Integer.parseInt( age.getText()),
										Integer.parseInt(jobexperience.getText()),genderComboBox.getSelectedItem().toString() );
										
				textArea.setText(textArea.getText()+"\n"+Nur.getNurseAsString() );
				Nurses.insert(Nur);
				Filemain.addNurses(Nur);
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
			textArea.setText(textArea.getText()+"\n"+Nurses.getAllAsString() );
		}
		else if(e.getSource() == SearchBT){
			Nurse n = Nurses.getById(Search.getText());
			if(n!=null){
				textArea.setText(textArea.getText()+"\n"+n.getNurseAsString() );
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Patient Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(RemoveBT == e.getSource()){
			Nurse s = Nurses.getById(Remove.getText());
			if(s!=null){
				Nurses.remove(Remove.getText());
				updateTextArea();
				JOptionPane.showMessageDialog(this,"Nurse Removed!","Removed",JOptionPane.WARNING_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(this,"NO Nurse Found!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		
	}
	
	
	
	
	public void updateTextArea(){
		textArea.setText(Nurses.getAllAsString());
	}
}
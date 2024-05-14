package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class ManagementPage extends JFrame implements ActionListener{
	Font font = new Font("Cambria",Font.PLAIN,20);
	Font fontMANGP = new Font("Cambria",Font.PLAIN,30);
	Font fontMain = new Font("cambria", Font.PLAIN, 13);
	JTextField room,ambulance,icu,ot,x_ray,mri, blood, other;
	JTextArea textArea;
	JButton ObtainBtn,BackBT,ShowBT;
	MainPage home;
	public ManagementPage(MainPage home){
		super("Management Page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(850,700);
		this.setLocation(200,80);
		this.setLayout(null);
		this.home = home;
		
		JLabel Title = new JLabel("Management Page");
		Title.setBounds(300,10,600,40);
		Title.setFont(fontMANGP);
		this.add(Title);
		
		int Space = 100;
		JLabel roomLabel = new JLabel("ROOM: ");
		roomLabel.setBounds(10,Space,100,30);
		roomLabel.setFont(font);
		this.add(roomLabel);
		
		room = new JTextField();
		room.setBounds(150,Space,200,30);
		room.setFont(font);
		this.add(room);
		
		Space+=40;
		JLabel ageLabel = new JLabel("AMBULANCE:");
		ageLabel.setBounds(10,Space,150,30);
		ageLabel.setFont(font);
		this.add(ageLabel);
		
		ambulance = new JTextField();
		ambulance.setBounds(150,Space,200,30);
		ambulance.setFont(font);
		this.add(ambulance);
		
		Space+=40;
		JLabel IcuLabel = new JLabel("ICU:");
		IcuLabel.setBounds(10,Space,100,30);
		IcuLabel.setFont(font);
		this.add(IcuLabel);
		
		icu = new JTextField();
		icu.setBounds(150,Space,200,30);
		icu.setFont(font);
		this.add(icu);
		
		Space+=40;
		JLabel otLabel = new JLabel("OT:");
		otLabel.setBounds(10,Space,100,30);
		otLabel.setFont(font);
		this.add(otLabel);

		ot = new JTextField();
		ot.setBounds(150,Space,200,30);
		ot.setFont(font);
		this.add(ot);
		
		Space+=40;
		JLabel mriLabe = new JLabel("MRI ROOM:");
		mriLabe.setBounds(10,Space,100,30);
		mriLabe.setFont(font);
		this.add(mriLabe);
	
		mri = new JTextField();
		mri.setBounds(150,Space,200,30);
		mri.setFont(font);
		this.add(mri);
		int AreaBox=Space+300;
		
		
		Space+=40;
		JLabel X_rayLabe = new JLabel("X-Ray Room:");
		X_rayLabe.setBounds(10,Space,100,30);
		X_rayLabe.setFont(font);
		this.add(X_rayLabe);
		
		x_ray = new JTextField();
		x_ray.setBounds(150,Space,200,30);
		x_ray.setFont(font);
		this.add(x_ray);
		
		Space+=40;
		JLabel bloodLabe = new JLabel("Blood test Room:");
		bloodLabe.setBounds(10,Space,100,30);
		bloodLabe.setFont(font);
		this.add(bloodLabe);
		
		blood = new JTextField();
		blood.setBounds(150,Space,200,30);
		blood.setFont(font);
		this.add(blood);
		
		Space+=40;
		JLabel otherLabe = new JLabel("Other test Room:");
		otherLabe.setBounds(10,Space,100,30);
		otherLabe.setFont(font);
		this.add(otherLabe);
		
		other = new JTextField();
		other.setBounds(150,Space,200,30);
		other.setFont(font);
		this.add(other);
		
		Space+=40;
		ObtainBtn = new JButton("Adjust Availablity");
		ObtainBtn.setBounds(10,Space,350,30);
		ObtainBtn.setFont(font);
		ObtainBtn.setBackground(new Color(113,255,191));
		ObtainBtn.setForeground(Color.BLACK);
		ObtainBtn.addActionListener(this);
		this.add(ObtainBtn);
		
		Space+=100;
		ShowBT = new JButton("Show Original Availability");
		ShowBT.setBounds(10,Space,350,30);
		ShowBT.setFont(font);
		ShowBT.setBackground(new Color(36,194,40));
		ShowBT.setForeground(Color.WHITE);
		ShowBT.addActionListener(this);
		this.add(ShowBT);
	
		BackBT = new JButton("MAIN PAGE");
		BackBT.setBounds(10,630,200,30);
		BackBT.setFont(font);
		BackBT.setBackground(Color.BLUE);
		BackBT.setForeground(Color.WHITE);
		BackBT.addActionListener(this);
		this.add(BackBT);

		textArea = new JTextArea();
		textArea.setFont(font);
		
		JScrollPane areaPane = new JScrollPane(textArea);
		areaPane.setBounds(400,100,400,AreaBox);
		this.add(areaPane);
		this.setVisible(true);
		
		ImageIcon bg2 = new ImageIcon("./Resources/Business-Continuity-Consulting-and-Management.gif");
		JLabel background2 = new JLabel(bg2);
		background2.setBounds(0,0,850,700);
		this.add(background2);
		
		ImageIcon bg = new ImageIcon("./Resources/download_1100x700_1_1100x7002.png");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,850,700);
		this.add(background);
	}
	
	
	public void actionPerformed(ActionEvent e){
		Management man ;
		if(e.getSource() == ObtainBtn){
				man = new Management(Integer.parseInt( room.getText()),				
										        Integer.parseInt( ambulance.getText()),
												Integer.parseInt( ot.getText()),
												Integer.parseInt( icu.getText()),
												Integer.parseInt( mri.getText()),
												Integer.parseInt( x_ray.getText()),
												Integer.parseInt( blood.getText()),
												Integer.parseInt( other.getText()));
										
				textArea.setText(textArea.getText()+"\n"+man.getManagementAsString() );
				
		}
		else if(e.getSource() == BackBT){
			home.setVisible(true);
			this.dispose();
		}
		else if(ShowBT == e.getSource()){
			Management mang =new Management();
			textArea.setText(textArea.getText()+"\n"+mang.getManagementAsString() );
		}
	}
}
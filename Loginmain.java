package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class Loginmain extends JFrame implements ActionListener {
	JLabel NameLabl, PasswordLabe;
	JTextField UserName;
    JPasswordField UserPassword;
    JButton LoginBT, RegBT;
	Font font = new Font("cambria", Font.PLAIN, 20);
	Font fontTitle = new Font("cambria", Font.PLAIN, 13);
	Font fontRegTitle = new Font("ADLaM Display", Font.PLAIN, 16);
	
	public Loginmain() {
        super("HOSPITAL MANAGMENT SISTEM LOGIN");
        this.setSize(550, 400);
        this.setLocation(490, 210);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon User= new ImageIcon("./Resources/Username_25x25.png");
		JLabel UserPNG= new JLabel(User);
		UserPNG.setBounds(147, 98, 25, 25);
		this.add(UserPNG);
		
		ImageIcon Pass= new ImageIcon("./Resources/pngwing.com_4_25x25.png");
		JLabel PassPNG= new JLabel(Pass);
		PassPNG.setBounds(147, 168, 25, 25);
		this.add(PassPNG);
		
		JLabel UserLabe = new JLabel("Put Your Username");
        UserLabe.setBounds(220, 75, 150, 25);
        UserLabe.setFont(fontTitle);
        this.add(UserLabe);
		
		JLabel PassLabe = new JLabel("Put Your Password");
        PassLabe.setBounds(220, 145, 150, 25);
        PassLabe.setFont(fontTitle);
        this.add(PassLabe);
		
		UserName = new JTextField();
        UserName.setBounds(190, 95, 180, 35);
        UserName.setFont(font);
        this.add(UserName);
		
		UserPassword = new JPasswordField();
        UserPassword.setBounds(190, 165, 180, 35);
		UserPassword.setEchoChar('*');
        UserPassword.setFont(font);
        this.add(UserPassword);
		
		LoginBT = new JButton("LOGIN");
        LoginBT.setBounds(219, 217, 120, 30);//165
        LoginBT.setFont(font);
		LoginBT.setBackground(new Color(33,150,243));
		LoginBT.setForeground(Color.BLACK);
        LoginBT.addActionListener(this);
        this.add(LoginBT);
		
		JLabel RegLabe = new JLabel("Not an User? Register now...");
        RegLabe.setBounds(185, 285, 220, 25);
        RegLabe.setFont(fontRegTitle);
        this.add(RegLabe);
		
		RegBT = new JButton("REGISTER");
        RegBT.setBounds(212, 313, 135, 30);
        RegBT.setFont(font);
		RegBT.setBackground(new Color(33,150,243));
		RegBT.setForeground(Color.BLACK);
        RegBT.addActionListener(this);
        this.add(RegBT);
		
		ImageIcon bg = new ImageIcon("./Resources/giphy9_550x400.gif");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,550,400);
		this.add(background);
	
		this.setVisible(true);
	}	
		public void actionPerformed(ActionEvent e) {
        if (LoginBT == e.getSource()) {
          logIn();
		}
        else if (RegBT == e.getSource()) {
			RegisterPage reg = new RegisterPage();
		}
    }
	public void logIn(){
		    String name = UserName.getText();
            String pass = String.valueOf(UserPassword.getPassword());
            if (Filemain.Check(name,pass)) {
				MainPage home = new MainPage(this);
				UserName.setText("");
                UserPassword.setText("");
                this.setVisible(false);
            } 
			else {
                JOptionPane.showMessageDialog(this, "Invalid User Name or Password", 
											  "Error",JOptionPane.ERROR_MESSAGE);
            }
	}
	public void keyPressed(KeyEvent key){}
	public void keyReleased(KeyEvent key){}
	public void keyTyped(KeyEvent key){
		if(key.getKeyChar() == 10){
			logIn();
		}
	}
}
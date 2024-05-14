package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import MainList.*;
import Main.*;
import FILE.*;

public class RegisterPage extends JFrame implements ActionListener {
	JTextField UserName;
    JPasswordField UserPassword;
    JButton RegBT;
	Font font = new Font("cambria", Font.PLAIN, 20);
	Font fontTitle = new Font("cambria", Font.PLAIN, 13);
	Font fontRegTitle = new Font("ADLaM Display", Font.PLAIN, 16);
	
	public RegisterPage() {
        super("REGISTRATION");
        this.setSize(300, 550);
        this.setLocation(1050, 150);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon User= new ImageIcon("./Resources/Username_25x25.png");
		JLabel UserPNG= new JLabel(User);
		UserPNG.setBounds(137, 98, 25, 25);
		this.add(UserPNG);
		
		ImageIcon Pass= new ImageIcon("./Resources/pngwing.com_4_25x25.png");
		JLabel PassPNG= new JLabel(Pass);
		PassPNG.setBounds(137, 195, 25, 25);
		this.add(PassPNG);
		
		JLabel UserLabe = new JLabel("Put Your Username");
        UserLabe.setBounds(95, 130, 150, 25);
        UserLabe.setFont(fontTitle);
        this.add(UserLabe);
		
		JLabel PassLabe = new JLabel("Put Your Password");
        PassLabe.setBounds(95, 220, 150, 25);
        PassLabe.setFont(fontTitle);
        this.add(PassLabe);
		
		UserName = new JTextField();
        UserName.setBounds(65, 150, 180, 35);
        UserName.setFont(font);
        this.add(UserName);
		
		UserPassword = new JPasswordField();
        UserPassword.setBounds(65, 240, 180, 35);
		UserPassword.setEchoChar('*');
        UserPassword.setFont(font);
        this.add(UserPassword);
		
		RegBT = new JButton("REGISTER");
        RegBT.setBounds(87, 330, 135, 30);//165
        RegBT.setFont(font);
		RegBT.setBackground(new Color(33,150,243));
		RegBT.setForeground(Color.BLACK);
        RegBT.addActionListener(this);
        this.add(RegBT);
		
		ImageIcon bg = new ImageIcon("./Resources/regpage300x550.gif");
		this.setIconImage(new ImageIcon("./Resources/LOGO.jpg").getImage());
		JLabel background = new JLabel(bg);
		background.setBounds(0,0,300,550);
		this.add(background);
	
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
        if (RegBT == e.getSource()) {
            String Name = UserName.getText();
            String Pass = String.valueOf(UserPassword.getPassword());
			Filemain.Register(Name,Pass);
			JOptionPane.showMessageDialog(this,"User Registered!");
			this.dispose();
        }
    }
}
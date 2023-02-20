package com.idel.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ResultPasswordPage extends JFrame {

	private JFrame myPage;
	
	public ResultPasswordPage()  {

		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		this.setTitle("비밀번호 찾기");
		
		this.myPage = this;
		
		JPanel panel = new JPanel();
		
		ImageIcon img = new ImageIcon("img/FindPasswordResult.png"); 
	    
		panel.setLayout(null);
		
		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		JTextField id = new JTextField();

		id.setSize(330, 30);
		id.setLocation(150, 200);

		panel.add(id);
		panel.add(background);



		this.add(panel);




		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

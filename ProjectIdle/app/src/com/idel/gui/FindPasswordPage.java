package com.idel.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FindPasswordPage extends JFrame {

	private JFrame myPage;
	
	public FindPasswordPage() {

		this.myPage = this;
		
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		myPage.setTitle("비밀번호 찾기");
		
		ImageIcon img = new ImageIcon("img/FindPasswordMain.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);
		
		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
        background.setSize(800, 500);
        
        

		JTextField id = new JTextField();

		id.setSize(360, 30);
		id.setLocation(210, 230);


		JTextField email = new JTextField();

		email.setSize(360, 30);
		email.setLocation(210, 300);

		// 검색 버튼
		JButton btn = new JButton();
		btn.setContentAreaFilled(false);
//		btn.setFont(EmailFont);
		btn.setSize(120, 100);
		btn.setLocation(640, 220);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain();
			}
		});
		
		
		// 패널로 화면에 노출
		panel.add(id);
		panel.add(email);
		panel.add(btn);
		panel.add(background);


		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
}
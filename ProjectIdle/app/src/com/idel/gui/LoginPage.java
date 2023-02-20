package com.idel.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.idel.gui.IngreMarketPage;

public class LoginPage extends JFrame {

	private JFrame myPage;

	public LoginPage() {

		this.myPage = this;

		myPage.setSize(800, 500);
		myPage.setLocationRelativeTo(null);
		myPage.setResizable(false);

		Font labelfont = new Font("DungGeunMo", Font.PLAIN, 25);
		Font titleFont = new Font("DungGeunMo", Font.PLAIN, 90);
		Color fontColor = new Color(255, 255, 140);

		JPanel panel = new JPanel();

		panel.setLayout(null);

		int labelWidth = 200;
		int labelHeight = 30;
		int textWidth = 350;
		int textHeight = 30;

		int X = 60;
		int Y = 300;

		int idX = X;
		int idY = Y;
		int pwdX = idX;
		int pwdY = idY + labelHeight + 30;

		ImageIcon back = new ImageIcon("img/background.png");

		JLabel backgroundLabel = new JLabel(back);
		backgroundLabel.setSize(800, 500);
		backgroundLabel.setLocation(0, 0);

		// 제목 라벨
		JLabel titleLabel1 = new JLabel("자바");
		titleLabel1.setFont(titleFont);
		titleLabel1.setForeground(fontColor);
		titleLabel1.setSize(labelWidth, 120);
		titleLabel1.setLocation(X + 50, 100);

		JLabel titleLabel2 = new JLabel("골목식당");
		titleLabel2.setFont(titleFont);
		titleLabel2.setForeground(new Color(207, 161, 255));
		titleLabel2.setSize(labelWidth * 2, 120);
		titleLabel2.setLocation(X + labelWidth + 50, 100);

		// 그림자 효과
		JLabel titleShadow1 = new JLabel(titleLabel1.getText());
		titleShadow1.setFont(titleFont);
		titleShadow1.setSize(labelWidth, 120);
		titleShadow1.setLocation(X + 50 + 5, 100 + 5);

		JLabel titleShadow2 = new JLabel(titleLabel2.getText());
		titleShadow2.setFont(titleFont);
		titleShadow2.setSize(labelWidth * 2, 120);
		titleShadow2.setLocation(X + labelWidth + 50 + 5, 100 + 5);

		// 아이디 라벨
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setFont(labelfont);
		idLabel.setForeground(fontColor);
		idLabel.setSize(labelWidth, labelHeight);
		idLabel.setLocation(idX, idY);

		// 아이디 그림자 효과
		JLabel idShadow = new JLabel(idLabel.getText());
		idShadow.setFont(labelfont);
		idShadow.setSize(labelWidth, labelHeight);
		idShadow.setLocation(idX + 2, idY + 2);

		// 아이디 텍스트
		JTextField idtxt = new JTextField(20);
		idtxt.setSize(textWidth, textHeight);
		idtxt.setLocation(idX + labelWidth - 50, idY);

		// 비밀번호 라벨
		JLabel pwdLabel = new JLabel("비밀번호 : ");
		pwdLabel.setFont(labelfont);
		pwdLabel.setForeground(fontColor);
		pwdLabel.setSize(labelWidth, labelHeight);
		pwdLabel.setLocation(pwdX, pwdY);

		// 비밀번호 그림자 효과
		JLabel pwdShadow = new JLabel(pwdLabel.getText());
		pwdShadow.setFont(labelfont);
		pwdShadow.setSize(labelWidth, labelHeight);
		pwdShadow.setLocation(pwdX + 2, pwdY + 2);

		// 비밀번호 텍스트
		JTextField pwdtxt = new JTextField(20);
		pwdtxt.setSize(textWidth, textHeight);
		pwdtxt.setLocation(pwdX + labelWidth - 50, pwdY);

		// 로그인 버튼
		JButton loginBtn = new JButton("Login");
		loginBtn.setFont(labelfont);
		loginBtn.setBorderPainted(false);
		loginBtn.setContentAreaFilled(false);
		loginBtn.setFocusPainted(false);
		loginBtn.setForeground(fontColor);
		loginBtn.setSize(100, 100);
		loginBtn.setLocation(X + labelWidth + textWidth, idY - 10);

		// 로그인 그림자 효과
		JLabel loginShadow = new JLabel(loginBtn.getText());
		loginShadow.setFont(labelfont);
		loginShadow.setHorizontalAlignment(JLabel.CENTER);
		loginShadow.setSize(100, 100);
		loginShadow.setLocation(X + labelWidth + textWidth + 2, idY - 10 + 2);

		// 회원가입
		JButton signUpBtn = new JButton("회원가입하기");
		signUpBtn.setFont(labelfont);
		signUpBtn.setBorderPainted(false);
		signUpBtn.setContentAreaFilled(false);
		signUpBtn.setFocusPainted(false);
		signUpBtn.setForeground(fontColor);
		signUpBtn.setSize(200, 30);
		signUpBtn.setLocation(X + 50, pwdY + labelHeight + 20);

		// 회원가입 그림자 효과
		JLabel signUpShadow = new JLabel(signUpBtn.getText());
		signUpShadow.setFont(labelfont);
		signUpShadow.setHorizontalAlignment(JLabel.CENTER);
		signUpShadow.setSize(200, 30);
		signUpShadow.setLocation(X + 50 + 2, pwdY + labelHeight + 20 + 2);

		// 비밀번호 찾기
		JButton findPwdBtn = new JButton("비밀번호찾기");
		findPwdBtn.setFont(labelfont);
		findPwdBtn.setBorderPainted(false);
		findPwdBtn.setContentAreaFilled(false);
		findPwdBtn.setFocusPainted(false);
		findPwdBtn.setForeground(fontColor);
		findPwdBtn.setSize(200, 30);
		findPwdBtn.setLocation(X + 400, pwdY + labelHeight + 20);

		// 비밀번호 찾기 그림자 효과
		JLabel findPwdShadow = new JLabel(findPwdBtn.getText());
		findPwdShadow.setFont(labelfont);
		findPwdShadow.setHorizontalAlignment(JLabel.CENTER);
		findPwdShadow.setSize(200, 30);
		findPwdShadow.setLocation(X + 400 + 2, pwdY + labelHeight + 20 + 2);

		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new StoragePage();

			}
		});

		signUpBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new UserInfoPage();

			}
		});

		findPwdBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new IngreMarketPage();

			}
		});

		// 패녈에 추가
		panel.add(titleLabel1);
		panel.add(titleLabel2);
		panel.add(titleShadow1);
		panel.add(titleShadow2);
		panel.add(idLabel);
		panel.add(idShadow);
		panel.add(idtxt);
		panel.add(pwdLabel);
		panel.add(pwdShadow);
		panel.add(pwdtxt);
		panel.add(loginBtn);
		panel.add(loginShadow);
		panel.add(signUpBtn);
		panel.add(signUpShadow);
		panel.add(findPwdBtn);
		panel.add(findPwdShadow);
		panel.add(backgroundLabel);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

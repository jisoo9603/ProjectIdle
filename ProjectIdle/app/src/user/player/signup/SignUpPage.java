package user.player.signup;

import static user.player.run.Application.labelFont;
import static user.player.run.Application.littlebigFont;
import static user.player.run.Application.titleFont;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpPage extends JFrame {

	private JFrame myPage;

	public SignUpPage() {

		// Font signUpFont = new Font("DungGeunMo", Font.BOLD, 70);
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);

		this.myPage = this;

		ImageIcon img = new ImageIcon("images/LoginBackground.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		// 제목 라벨
		// JLabel titleLabel1 = new JLabel("자바");
		// titleLabel1.setFont(titleFont);
		// titleLabel1.setForeground(new Color(247, 243, 130));
		// titleLabel1.setSize(labelWidth, 120);
		// titleLabel1.setLocation(X + 50, 100);

		JLabel titleLabel2 = new JLabel("회원가입");
		titleLabel2.setFont(titleFont);
		titleLabel2.setForeground(new Color(207, 161, 255));
		titleLabel2.setSize(500, 120);
		titleLabel2.setLocation(200, 0);

		// 그림자 효과
		// JLabel titleShadow1 = new JLabel("회원가입");
		// titleShadow1.setFont(titleFont);
		// titleShadow1.setSize(500, 120);
		// titleShadow1.setLocation(203, 3);

		JLabel titleShadow2 = new JLabel(titleLabel2.getText());
		titleShadow2.setFont(titleFont);
		titleShadow2.setSize(500, 120);
		titleShadow2.setLocation(203, 3);

		// 아이디 라벨
		JLabel idLabel = new JLabel("아이디 ");
		idLabel.setFont(labelFont);
		idLabel.setForeground(new Color(247, 243, 130));
		idLabel.setSize(100, 30);
		idLabel.setLocation(120, 120);

		// 아이디 그림자 효과
		JLabel idShadow = new JLabel(idLabel.getText());
		idShadow.setFont(labelFont);
		idShadow.setSize(100, 30);
		idShadow.setLocation(122, 122);

		// 아이디 텍스트
		JTextField idtxt = new JTextField(30);
		idtxt.setSize(300, 30);
		idtxt.setLocation(300, 120);

		// 비밀번호 라벨
		JLabel pwdLabel = new JLabel("비밀번호 ");
		pwdLabel.setFont(labelFont);
		pwdLabel.setForeground(new Color(247, 243, 130));
		pwdLabel.setSize(150, 30);
		pwdLabel.setLocation(120, 170);

		// 비밀번호 그림자 효과
		JLabel pwdShadow = new JLabel(pwdLabel.getText());
		pwdShadow.setFont(labelFont);
		pwdShadow.setSize(150, 30);
		pwdShadow.setLocation(123, 172);

		// 비밀번호 텍스트
		JTextField pwdtxt = new JTextField(30);
		pwdtxt.setSize(300, 30);
		pwdtxt.setLocation(300, 170);

		// 비밀번호 확인 라벨
		JLabel pwdLabel2 = new JLabel("비밀번호 확인 ");
		pwdLabel2.setFont(labelFont);
		pwdLabel2.setForeground(new Color(247, 243, 130));
		pwdLabel2.setSize(200, 30);
		pwdLabel2.setLocation(120, 220);

		// 비밀번호 확인 그림자 효과
		JLabel pwdShadow2 = new JLabel(pwdLabel2.getText());
		pwdShadow2.setFont(labelFont);
		pwdShadow2.setSize(200, 30);
		pwdShadow2.setLocation(123, 223);

		// 비밀번호 확인 텍스트
		JTextField pwdtxt2 = new JTextField(30);
		pwdtxt2.setSize(300, 30);
		pwdtxt2.setLocation(300, 220);

		// 닉네임 라벨
		JLabel nickLabel = new JLabel("닉네임 ");
		nickLabel.setFont(labelFont);
		nickLabel.setForeground(new Color(247, 243, 130));
		nickLabel.setSize(200, 30);
		nickLabel.setLocation(120, 270);

		// 닉네임 그림자 효과
		JLabel nickShadow = new JLabel(nickLabel.getText());
		nickShadow.setFont(labelFont);
		nickShadow.setSize(200, 30);
		nickShadow.setLocation(123, 273);

		// 닉네임 텍스트
		JTextField nicktxt = new JTextField(30);
		nicktxt.setSize(300, 30);
		nicktxt.setLocation(300, 270);

		// 이메일 라벨
		JLabel emailLabel = new JLabel("이메일 ");
		emailLabel.setFont(labelFont);
		emailLabel.setForeground(new Color(247, 243, 130));
		emailLabel.setSize(200, 30);
		emailLabel.setLocation(120, 320);

		// 이메일 그림자 효과
		JLabel emailShadow = new JLabel(emailLabel.getText());
		emailShadow.setFont(labelFont);
		emailShadow.setSize(200, 30);
		emailShadow.setLocation(123, 323);

		// 이메일 텍스트
		JTextField emailtxt = new JTextField(30);
		emailtxt.setSize(300, 30);
		emailtxt.setLocation(300, 320);

		// // 회원가입완료 버튼
		JButton signUp = new JButton("회원가입완료");
		signUp.setFont(littlebigFont);
		signUp.setForeground(new Color(247, 243, 130));
		signUp.setSize(400, 150);
		signUp.setLocation(200, 330);
		signUp.setBorderPainted(false);
		signUp.setContentAreaFilled(false); // 버튼 투명
		signUp.setFocusPainted(false);

		// 회원가입완료 그림자 효과
		// JLabel signUpShadow = new JLabel(signUp.getText());
		// signUpShadow.setFont(littlebigFont);
		// signUpShadow.setSize(350, 150);
		// signUpShadow.setLocation(250, 380);

		// JButton btn = new JButton();
		// btn.setLocation(250, 375);
		// btn.setSize(315, 65);
		// btn.setContentAreaFilled(false);

		// 패녈에 추가
		// panel.add(titleLabel1);
		panel.add(titleLabel2);
		// this.add(titleShadow1);
		panel.add(titleShadow2);
		panel.add(idLabel);
		panel.add(idShadow);
		panel.add(idtxt);
		panel.add(pwdLabel);
		panel.add(pwdShadow);
		panel.add(pwdtxt);
		panel.add(pwdLabel2);
		panel.add(pwdShadow2);
		panel.add(pwdtxt2);
		panel.add(signUp);
		// panel.add(signUpShadow);
		panel.add(nickLabel);
		panel.add(nickShadow);
		panel.add(nicktxt);
		panel.add(emailLabel);
		panel.add(emailtxt);
		panel.add(emailShadow);
		// this.add(btn);
		panel.add(background);
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
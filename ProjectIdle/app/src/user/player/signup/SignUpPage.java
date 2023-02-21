package user.player.signup;

import static user.player.run.Application.labelFont;
import static user.player.run.Application.littlebigFont;
import static user.player.run.Application.titleFont;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import user.player.signup.controller.SignUpController;

public class SignUpPage extends JFrame {

	private JFrame myPage;
	private SignUpController signUpController;
	private boolean isSignup;
	private String tempId;
	private String tempPwd;
	private String tempName;

	public SignUpPage() {

		signUpController = new SignUpController();
		Font checkFont = new Font("DungGeunMo", Font.PLAIN, 20);

		Color fontColor = new Color(247, 243, 130);

		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.myPage = this;

		ImageIcon img = new ImageIcon("images/background.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		JLabel titleLabel = new JLabel("회원가입");
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(new Color(207, 161, 255));
		titleLabel.setSize(400, 90);
		titleLabel.setLocation(200, 0);

		JLabel titleShadow = new JLabel(titleLabel.getText());
		titleShadow.setFont(titleFont);
		titleShadow.setSize(titleLabel.getWidth(), titleLabel.getHeight());
		titleShadow.setLocation(titleLabel.getX() + 3, titleLabel.getY() + 3);

		int labelW = 200;
		int H = 30;
		int i = 0;

		int labelX = 100;
		int labelY = 115;

		int fix = H + 25;

		int textW = 300;
		int textX = labelX + labelW;

		// 아이디 라벨
		JLabel idLabel = new JLabel("아이디 ");
		idLabel.setFont(labelFont);
		idLabel.setForeground(fontColor);
		idLabel.setSize(labelW, H);
		idLabel.setLocation(labelX, labelY + fix * i++);

		// 아이디 그림자 효과
		JLabel idShadow = new JLabel(idLabel.getText());
		idShadow.setFont(labelFont);
		idShadow.setSize(labelW, H);
		idShadow.setLocation(idLabel.getX() + 2, idLabel.getY() + 2);

		// 아이디 텍스트
		JTextField idtxt = new JTextField(30);
		idtxt.setSize(textW, H);
		idtxt.setLocation(textX, idLabel.getY());

		// 아이디 중복확인
		JButton idDistinctBtn = new JButton("중복확인");
		idDistinctBtn.setBorderPainted(false);
		idDistinctBtn.setContentAreaFilled(false);
		idDistinctBtn.setFocusPainted(false);
		idDistinctBtn.setFont(labelFont);
		idDistinctBtn.setForeground(fontColor);
		idDistinctBtn.setSize(labelW - 10, H);
		idDistinctBtn.setLocation(idtxt.getX() + idtxt.getWidth(), idLabel.getY());

		JLabel idDistinctShadow = new JLabel(idDistinctBtn.getText());
		idDistinctShadow.setFont(labelFont);
		idDistinctShadow.setSize(idDistinctBtn.getWidth(), idDistinctBtn.getHeight());
		idDistinctShadow.setLocation(idDistinctBtn.getX() + 2, idDistinctBtn.getY() + 2);
		idDistinctShadow.setHorizontalAlignment(JLabel.CENTER);

		JLabel idCheckMessage = new JLabel();
		idCheckMessage.setSize(textW, H);
		idCheckMessage.setLocation(textX, idtxt.getY() + H);
		idCheckMessage.setFont(checkFont);
		idCheckMessage.setHorizontalAlignment(JLabel.RIGHT);

		// 비밀번호 라벨
		JLabel pwdLabel = new JLabel("비밀번호 ");
		pwdLabel.setFont(labelFont);
		pwdLabel.setForeground(fontColor);
		pwdLabel.setSize(labelW, H);
		pwdLabel.setLocation(labelX, labelY + fix * i++);

		// 비밀번호 그림자 효과
		JLabel pwdShadow = new JLabel(pwdLabel.getText());
		pwdShadow.setFont(labelFont);
		pwdShadow.setSize(labelW, H);
		pwdShadow.setLocation(pwdLabel.getX() + 2, pwdLabel.getY() + 2);

		// 비밀번호 텍스트
		JTextField pwdtxt = new JTextField(30);
		pwdtxt.setSize(textW, H);
		pwdtxt.setLocation(textX, pwdLabel.getY());

		// 비밀번호 확인 라벨
		JLabel pwdLabel2 = new JLabel("비밀번호 확인 ");
		pwdLabel2.setFont(labelFont);
		pwdLabel2.setForeground(fontColor);
		pwdLabel2.setSize(labelW, H);
		pwdLabel2.setLocation(labelX, labelY + fix * i++);

		// 비밀번호 확인 그림자 효과
		JLabel pwdShadow2 = new JLabel(pwdLabel2.getText());
		pwdShadow2.setFont(labelFont);
		pwdShadow2.setSize(labelW, H);
		pwdShadow2.setLocation(pwdLabel2.getX() + 2, pwdLabel2.getY() + 2);

		// 비밀번호 확인 텍스트
		JTextField pwdtxt2 = new JTextField(30);
		pwdtxt2.setSize(textW, H);
		pwdtxt2.setLocation(textX, pwdLabel2.getY());

		JLabel pwdCheckMessage = new JLabel();
		pwdCheckMessage.setSize(textW, H);
		pwdCheckMessage.setLocation(textX, pwdLabel2.getY() + H);
		pwdCheckMessage.setFont(checkFont);
		pwdCheckMessage.setHorizontalAlignment(JLabel.RIGHT);

		// 비밀번호 일치 확인
		JButton pwdCheckBtn = new JButton("확인");
		pwdCheckBtn.setBorderPainted(false);
		pwdCheckBtn.setContentAreaFilled(false);
		pwdCheckBtn.setFocusPainted(false);
		pwdCheckBtn.setFont(labelFont);
		pwdCheckBtn.setForeground(fontColor);
		pwdCheckBtn.setSize(labelW - 10, H);
		pwdCheckBtn.setLocation(pwdtxt2.getX() + pwdtxt2.getWidth(), pwdtxt2.getY());

		JLabel pwdCheckShadow = new JLabel(pwdCheckBtn.getText());
		pwdCheckShadow.setFont(labelFont);
		pwdCheckShadow.setSize(pwdCheckBtn.getWidth(), pwdCheckBtn.getHeight());
		pwdCheckShadow.setLocation(pwdCheckBtn.getX() + 2, pwdCheckBtn.getY() + 2);
		pwdCheckShadow.setHorizontalAlignment(JLabel.CENTER);

		// 닉네임 라벨
		JLabel nickLabel = new JLabel("닉네임 ");
		nickLabel.setFont(labelFont);
		nickLabel.setForeground(fontColor);
		nickLabel.setSize(labelW, H);
		nickLabel.setLocation(labelX, labelY + fix * i++);

		// 닉네임 그림자 효과
		JLabel nickShadow = new JLabel(nickLabel.getText());
		nickShadow.setFont(labelFont);
		nickShadow.setSize(labelW, H);
		nickShadow.setLocation(nickLabel.getX() + 2, nickLabel.getY() + 2);

		// 닉네임 텍스트
		JTextField nicktxt = new JTextField(30);
		nicktxt.setSize(textW, H);
		nicktxt.setLocation(textX, nickLabel.getY());

		// 닉네임 중복 확인
		JButton nameDistinctBtn = new JButton("중복확인");
		nameDistinctBtn.setBorderPainted(false);
		nameDistinctBtn.setContentAreaFilled(false);
		nameDistinctBtn.setFocusPainted(false);
		nameDistinctBtn.setFont(labelFont);
		nameDistinctBtn.setForeground(fontColor);
		nameDistinctBtn.setSize(labelW - 10, H);
		nameDistinctBtn.setLocation(nicktxt.getX() + nicktxt.getWidth(), nicktxt.getY());

		JLabel nameDistinctShadow = new JLabel(nameDistinctBtn.getText());
		nameDistinctShadow.setFont(labelFont);
		nameDistinctShadow.setSize(nameDistinctBtn.getWidth(), nameDistinctBtn.getHeight());
		nameDistinctShadow.setLocation(nameDistinctBtn.getX() + 2, nameDistinctBtn.getY() + 2);
		nameDistinctShadow.setHorizontalAlignment(JLabel.CENTER);

		JLabel nameCheckMessage = new JLabel();
		nameCheckMessage.setSize(textW, H);
		nameCheckMessage.setLocation(textX, nicktxt.getY() + H);
		nameCheckMessage.setFont(checkFont);
		nameCheckMessage.setHorizontalAlignment(JLabel.RIGHT);

		// 이메일 라벨
		JLabel emailLabel = new JLabel("이메일 ");
		emailLabel.setFont(labelFont);
		emailLabel.setForeground(fontColor);
		emailLabel.setSize(labelW, H);
		emailLabel.setLocation(labelX, labelY + fix * i++);

		// 이메일 그림자 효과
		JLabel emailShadow = new JLabel(emailLabel.getText());
		emailShadow.setFont(labelFont);
		emailShadow.setSize(labelW, H);
		emailShadow.setLocation(emailLabel.getX() + 2, emailLabel.getY() + 2);

		// 이메일 텍스트
		JTextField emailtxt = new JTextField(30);
		emailtxt.setSize(textW, H);
		emailtxt.setLocation(textX, emailLabel.getY());

		// // 회원가입완료 버튼
		JButton signUp = new JButton("회원가입하기");
		signUp.setBorderPainted(false);
		signUp.setContentAreaFilled(false);
		signUp.setFocusPainted(false);
		signUp.setFont(littlebigFont);
		signUp.setForeground(fontColor);
		signUp.setSize(400, 55);
		signUp.setLocation(titleLabel.getX(), labelY + fix * i++);

		// 회원가입완료 그림자 효과
		JLabel signUpShadow = new JLabel(signUp.getText());
		signUpShadow.setFont(littlebigFont);
		signUpShadow.setSize(signUp.getWidth(), signUp.getHeight());
		signUpShadow.setLocation(signUp.getX() + 3, signUp.getY() + 3);

		Color labelColor = new Color(250, 220, 120);
		JLabel dialog = new JLabel();
		dialog.setSize(600, 300);
		dialog.setLocation(100, 100);
		dialog.setOpaque(true);
		dialog.setBackground(labelColor);
		dialog.setVisible(false);

		JLabel dialogText = new JLabel("hello");
		dialogText.setSize(dialog.getWidth(), 30);
		dialogText.setLocation(dialog.getX(), (dialog.getY() + (dialog.getHeight() - dialogText.getHeight()) / 2));
		dialogText.setFont(labelFont);
		dialogText.setHorizontalAlignment(JLabel.CENTER);
		dialogText.setVisible(false);

		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setFont(labelFont);
		closeBtn.setSize(200, 50);
		closeBtn.setLocation(dialog.getX() + (dialog.getWidth() - closeBtn.getWidth()) / 2,
				(dialog.getY() + dialog.getHeight() - closeBtn.getHeight()));
		closeBtn.setVisible(false);

		panel.add(dialogText);
		panel.add(closeBtn);
		panel.add(dialog);

		// 패널에 추가
		panel.add(titleLabel);
		panel.add(titleShadow);

		panel.add(idLabel);
		panel.add(idShadow);
		panel.add(idtxt);
		panel.add(idCheckMessage);
		panel.add(idDistinctBtn);
		panel.add(idDistinctShadow);

		panel.add(pwdLabel);
		panel.add(pwdShadow);
		panel.add(pwdtxt);

		panel.add(pwdLabel2);
		panel.add(pwdShadow2);
		panel.add(pwdtxt2);
		panel.add(pwdCheckMessage);
		panel.add(pwdCheckBtn);
		panel.add(pwdCheckShadow);

		panel.add(nickLabel);
		panel.add(nickShadow);
		panel.add(nicktxt);
		panel.add(nameCheckMessage);
		panel.add(nameDistinctBtn);
		panel.add(nameDistinctShadow);

		panel.add(emailLabel);
		panel.add(emailtxt);
		panel.add(emailShadow);

		panel.add(signUp);

		panel.add(background);

		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		idDistinctBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (idtxt.getText().equals("")) {
					idCheckMessage.setText("아이디를 입력해주세요.");
					return;
				}

				Map<String, String> map = new HashMap<>();
				map.put("id", idtxt.getText());

				idCheckMessage.setText(signUpController.findUserDistinct(map));

				if (idCheckMessage.getText().equals("사용 가능 합니다.")) {
					tempId = idtxt.getText();
				}
			}
		});

		nameDistinctBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (nicktxt.getText().equals("")) {
					nameCheckMessage.setText("닉네임을 입력해주세요.");
					return;
				}

				Map<String, String> map = new HashMap<>();
				map.put("name", nicktxt.getText());

				nameCheckMessage.setText(signUpController.findUserDistinct(map));

				if (nameCheckMessage.getText().equals("사용 가능 합니다.")) {
					tempName = nicktxt.getText();
				}
			}
		});

		pwdCheckBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (pwdtxt.getText().equals("")) {
					pwdCheckMessage.setText("비밀번호를 입력해 주세요.");
					pwdCheckMessage.setForeground(Color.RED);
				} else {
					if (pwdtxt.getText().equals(pwdtxt2.getText())) {
						pwdCheckMessage.setText("비밀번호가 일치합니다.");
						pwdCheckMessage.setForeground(Color.BLUE);
						tempPwd = pwdtxt.getText();
					} else {
						pwdCheckMessage.setText("비밀번호가 일치하지 않습니다.");
						pwdCheckMessage.setForeground(Color.RED);
					}
				}
			}
		});

		signUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (idtxt.getText().equals(tempId) && pwdtxt.getText().equals(tempPwd)
						&& nicktxt.getText().equals(tempName) && !emailtxt.getText().equals("")) {
					Map<String, String> map = new HashMap<>();
					map.put("id", idtxt.getText());
					map.put("pwd", pwdtxt.getText());
					map.put("name", nicktxt.getText());
					map.put("email", emailtxt.getText());

					isSignup = signUpController.insertNewPlayer(map);

					if (isSignup) {
						dialogText.setText("회원가입에 성공하셨습니다.");
					} else {
						dialogText.setText("회원가입에 실패하셨습니다.");
					}
				} else {
					dialogText.setText("비어있거나 잘못된 정보가 있습니다.");
				}

				dialog.setVisible(true);
				dialogText.setVisible(true);
				closeBtn.setVisible(true);
			}
		});

		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dialog.setVisible(false);
				dialogText.setVisible(false);
				closeBtn.setVisible(false);

				if (isSignup) {
					myPage.dispose();
					new LoginPage();
				}
			}
		});

	}

}
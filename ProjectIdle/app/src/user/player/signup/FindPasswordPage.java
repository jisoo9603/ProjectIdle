package user.player.signup;

import static user.player.run.Application.labelFont;

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

import user.player.signup.controller.SignUpController;;

public class FindPasswordPage extends JFrame {

	private JFrame myPage;

	public FindPasswordPage() {

		this.myPage = this;

		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		myPage.setTitle("비밀번호 찾기");

		ImageIcon img = new ImageIcon("images/FindPasswordMain.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		ImageIcon pwdResult = new ImageIcon("images/pwdResult.png");
		JLabel resultPassword = new JLabel(pwdResult);

		resultPassword.setSize(pwdResult.getIconWidth() + 20, pwdResult.getIconHeight());
		resultPassword.setLocation((800 - resultPassword.getWidth()) / 2, (500 - resultPassword.getHeight()) / 2);
		resultPassword.setVisible(false);

		JLabel msgPwd = new JLabel("hello");
		msgPwd.setSize(resultPassword.getWidth(), 30);
		msgPwd.setLocation(resultPassword.getX(), resultPassword.getY() + resultPassword.getHeight() / 2);
		msgPwd.setFont(labelFont);
		msgPwd.setHorizontalAlignment(JLabel.CENTER);
		msgPwd.setVisible(false);

		JButton closeBtn = new JButton();
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setSize(100, 50);
		closeBtn.setLocation(resultPassword.getX() + (resultPassword.getWidth() - closeBtn.getWidth()) / 2,
				resultPassword.getY() + resultPassword.getHeight() - closeBtn.getHeight());
		closeBtn.setVisible(false);

		JTextField id = new JTextField();

		id.setSize(360, 30);
		id.setLocation(210, 230);

		JTextField email = new JTextField();

		email.setSize(360, 30);
		email.setLocation(210, 300);

		// 검색 버튼
		JButton btn = new JButton();
		btn.setContentAreaFilled(false);
		// btn.setFont(EmailFont);
		btn.setSize(120, 100);
		btn.setLocation(640, 220);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);

		// 패널로 화면에 노출
		panel.add(closeBtn);
		panel.add(msgPwd);
		panel.add(resultPassword);

		panel.add(id);
		panel.add(email);
		panel.add(btn);
		panel.add(background);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Map<String, String> map = new HashMap<>();
				map.put("id", id.getText());
				map.put("email", email.getText());

				SignUpController signUpController = new SignUpController();

				String message = signUpController.findPwdByIdAndEmail(map);

				msgPwd.setText(message);

				closeBtn.setVisible(true);
				msgPwd.setVisible(true);
				resultPassword.setVisible(true);

			}
		});

		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				closeBtn.setVisible(false);
				msgPwd.setVisible(false);
				resultPassword.setVisible(false);

			}
		});

	}
}
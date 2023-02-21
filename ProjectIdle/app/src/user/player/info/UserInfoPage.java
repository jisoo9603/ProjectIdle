package user.player.info;

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

import user.player.gamemain.GameMain;
import user.player.rank.RankPage;

public class UserInfoPage extends JFrame {
	private JFrame myPage;

	public UserInfoPage() {

		this.myPage = this;

		myPage.setSize(800, 500);
		myPage.setLocationRelativeTo(null);
		myPage.setResizable(false);

		Font labelfont = new Font("DungGeunMo", Font.PLAIN, 25);
		Color fontColor = new Color(255, 255, 140);
		Color btnColor = new Color(90, 190, 255);

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon back = new ImageIcon("img/MainBackground.png");
		ImageIcon board = new ImageIcon("img/board.png");
		ImageIcon panelImg = new ImageIcon("img/buttonFrame.png");

		// 배경
		JLabel backgroundLabel = new JLabel(back);
		backgroundLabel.setSize(800, 500);
		backgroundLabel.setLocation(0, -30);

		JLabel boardLabel = new JLabel(board);
		boardLabel.setSize(800, 500);
		boardLabel.setLocation(0, -10);

		// 라벨
		int infoW = 220;
		int infoH = 60;
		int infoX = 295;
		int infoY = 30;

		JLabel infoLabel = new JLabel(panelImg);
		infoLabel.setSize(infoW, infoH);
		infoLabel.setLocation(infoX, infoY);

		JLabel infoText = new JLabel("내 정보");
		infoText.setHorizontalAlignment(JLabel.CENTER);
		infoText.setFont(labelfont);
		infoText.setForeground(fontColor);
		infoText.setSize(infoW, infoH);
		infoText.setLocation(infoX, infoY);

		JLabel infoTextShadow = new JLabel(infoText.getText());
		infoTextShadow.setHorizontalAlignment(JLabel.CENTER);
		infoTextShadow.setFont(labelfont);
		infoTextShadow.setSize(infoW, infoH);
		infoTextShadow.setLocation(infoX + 2, infoY + 2);

		int lblW = 100;
		int lblH = 30;
		int lblX = 160;
		int lblY = 130;
		int txtW = 350;

		String[] text = new String[] {
				"내정보", "경험치", "가게이름", "자금"
		};
		JLabel[] infoLabels = new JLabel[text.length];
		JLabel[] infoLabelShadows = new JLabel[infoLabels.length];
		JTextField[] infoTexts = new JTextField[infoLabels.length];

		for (int i = 0; i < infoLabels.length; i++) {
			infoLabels[i] = new JLabel(text[i]);
			infoLabels[i].setFont(labelfont);
			infoLabels[i].setHorizontalAlignment(JLabel.RIGHT);
			infoLabels[i].setForeground(fontColor);
			infoLabels[i].setSize(lblW, lblH);
			infoLabels[i].setLocation(lblX, lblY + (lblH + 30) * i);
			panel.add(infoLabels[i]);
		}

		for (int i = 0; i < infoLabelShadows.length; i++) {
			infoLabelShadows[i] = new JLabel(text[i]);
			infoLabelShadows[i].setFont(labelfont);
			infoLabelShadows[i].setHorizontalAlignment(JLabel.RIGHT);
			infoLabelShadows[i].setSize(lblW, lblH);
			infoLabelShadows[i].setLocation(lblX + 2, lblY + (lblH + 30) * i + 2);
			panel.add(infoLabelShadows[i]);
		}

		for (int i = 0; i < infoTexts.length; i++) {
			infoTexts[i] = new JTextField();
			infoTexts[i].setFont(labelfont);
			infoTexts[i].setEditable(false);
			infoTexts[i].setSize(txtW, lblH);
			infoTexts[i].setLocation(lblX + lblW + 20, lblY + (lblH + 30) * i);
			panel.add(infoTexts[i]);
		}

		int btnW = 90;
		int btnH = 30;
		int fix = btnW + 70;
		int btnX = lblX + btnW + 100;
		int btnY = lblY + (lblH + 30) * infoLabels.length;

		// 랭킹 버튼
		JButton rankBtn = new JButton("랭킹");
		rankBtn.setBorderPainted(false);
		rankBtn.setContentAreaFilled(false);
		rankBtn.setFocusPainted(false);
		rankBtn.setFont(labelfont);
		rankBtn.setForeground(btnColor);
		rankBtn.setSize(btnW, btnH);
		rankBtn.setLocation(btnX - fix, btnY);

		JLabel rankBtnShadow = new JLabel(rankBtn.getText());
		rankBtnShadow.setHorizontalAlignment(JLabel.CENTER);
		rankBtnShadow.setFont(labelfont);
		rankBtnShadow.setSize(btnW, btnH);
		rankBtnShadow.setLocation(btnX - fix + 2, btnY + 2);

		// 닫기 버튼
		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setFont(labelfont);
		closeBtn.setForeground(btnColor);
		closeBtn.setSize(btnW, btnH);
		closeBtn.setLocation(btnX, btnY);

		JLabel closeBtnShadow = new JLabel(closeBtn.getText());
		closeBtnShadow.setHorizontalAlignment(JLabel.CENTER);
		closeBtnShadow.setFont(labelfont);
		closeBtnShadow.setSize(btnW, btnH);
		closeBtnShadow.setLocation(btnX + 2, btnY + 2);

		// 회원탈퇴 버튼
		JButton signOutBtn = new JButton("회원탈퇴");
		signOutBtn.setBorderPainted(false);
		signOutBtn.setContentAreaFilled(false);
		signOutBtn.setFocusPainted(false);
		signOutBtn.setFont(labelfont);
		signOutBtn.setForeground(new Color(255, 155, 200));
		signOutBtn.setSize(btnW * 2 - 40, btnH);
		signOutBtn.setLocation(btnX + fix, btnY);

		JLabel signOutBtnShadow = new JLabel(signOutBtn.getText());
		signOutBtnShadow.setHorizontalAlignment(JLabel.CENTER);
		signOutBtnShadow.setFont(labelfont);
		signOutBtnShadow.setSize(btnW * 2 - 40, btnH);
		signOutBtnShadow.setLocation(btnX + fix + 2, btnY + 2);

		rankBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new RankPage();

			}
		});

		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain();

			}
		});

		signOutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new UserDeleteCheckPage();

			}
		});

		// 패널에 추가

		panel.add(infoText);
		panel.add(infoTextShadow);
		panel.add(infoLabel);

		panel.add(rankBtn);
		panel.add(rankBtnShadow);

		panel.add(closeBtn);
		panel.add(closeBtnShadow);

		panel.add(signOutBtn);
		panel.add(signOutBtnShadow);

		panel.add(boardLabel);
		panel.add(backgroundLabel);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

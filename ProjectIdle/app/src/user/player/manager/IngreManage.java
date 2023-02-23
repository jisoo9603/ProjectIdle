package user.player.manager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IngreManage extends JFrame {

	private JFrame myPage;

	private List<JLabel> ingreList;
	private int index = 0;

	public IngreManage() {

		this.myPage = this;
		myPage.setSize(800, 500);
		myPage.setLocationRelativeTo(null);
		myPage.setResizable(false);

		JPanel panel = new JPanel();

		panel.setLayout(null);

		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 40);

		Color labelColor = new Color(250, 220, 120);
		Color fontColor = new Color(50, 50, 250);

		// 배경
		ImageIcon backgrond = new ImageIcon("images/Market.png");

		// 뒤로가기
		ImageIcon back = new ImageIcon("images/back.png");

		// 목차
		Image btn = new ImageIcon("images/buttonFrame.png").getImage().getScaledInstance(600, 60, 0);
		ImageIcon btnImg = new ImageIcon(btn);

		Image plusImg = new ImageIcon("images/plusButton.png").getImage().getScaledInstance(30, 30, 0);
		ImageIcon plus = new ImageIcon(plusImg);

		// 배경
		JLabel background = new JLabel(backgrond);
		background.setSize(800, 500);
		background.setLocation(0, 0);

		// 이전 화면 이동
		JButton backBtn = new JButton();
		backBtn.setIcon(back);
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setFocusPainted(false);
		backBtn.setSize(back.getIconWidth(), back.getIconHeight());
		backBtn.setLocation(0, 0);

		// 타이틀
		JLabel titleLabel = new JLabel(btnImg);
		titleLabel.setSize(btnImg.getIconWidth(), btnImg.getIconHeight());
		titleLabel.setLocation((myPage.getWidth() - titleLabel.getWidth()) / 2, 0);

		JLabel titleText = new JLabel("재료 관리");
		titleText.setSize(btnImg.getIconWidth(), btnImg.getIconHeight());
		titleText.setLocation((myPage.getWidth() - titleLabel.getWidth()) / 2, 0);
		titleText.setFont(labelFont);
		titleText.setForeground(fontColor);
		titleText.setHorizontalAlignment(JLabel.CENTER);

		// 재료 화면

		int lblW = 700;
		int lblH = 380;

		int lblX = 50;
		int lblY = 70;

		// 관리 목록 배경
		JLabel backLabel = new JLabel();
		backLabel.setSize(lblW, lblH);
		backLabel.setLocation(lblX, lblY);
		backLabel.setOpaque(true);
		backLabel.setBackground(labelColor);

		ingreList = new ArrayList<>();

		JLabel[][] ingre = new JLabel[3][5];
		for (int i = 0; i < ingre.length; i++) {
			for (int k = 0; k < ingre[i].length; k++) {
				ingre[i][k] = new JLabel();
				ingre[i][k].setSize(100, 100);
				ingre[i][k].setLocation(lblX + (ingre[i][k].getWidth() + 30) * k + 40,
						lblY + (ingre[i][k].getHeight() + 20) * i + 20);
//				ingre[i][k].setOpaque(true);
//				ingre[i][k].setBackground(fontColor);

				ingreList.add(ingre[i][k]);
			}
		}

		for (JLabel label : ingreList) {
			panel.add(label);
		}
		System.out.println(ingreList.size());

		JButton addBtn = new JButton();
		addBtn.setIcon(plus);
		addBtn.setSize(plus.getIconWidth(), plus.getIconHeight());
		addBtn.setLocation(ingreList.get(index).getX() + ingreList.get(index).getWidth() / 2,
				ingreList.get(index).getY() + ingreList.get(index).getHeight() / 2);

		// 패널에 추가
		panel.add(addBtn);
		panel.add(titleText);
		panel.add(titleLabel);
		panel.add(backLabel);

		panel.add(backBtn);
		panel.add(background);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index++;
				if (index < ingreList.size()) {

					addBtn.setLocation(ingreList.get(index).getX() + ingreList.get(index).getWidth() / 2,
							ingreList.get(index).getY() + ingreList.get(index).getHeight() / 2);
				}
			}
		});
	}

}
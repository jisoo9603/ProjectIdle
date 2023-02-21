package user.player.store.receip;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.storage.StoragePage;

public class RecipeStoragePage extends JFrame {

	private JFrame myPage;

	public RecipeStoragePage() {
		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
		Font ingreLabelFont = new Font("DungGeunMo", Font.PLAIN, 20);

		this.myPage = this;
		myPage.setSize(800, 500);
		myPage.setLocationRelativeTo(null);
		myPage.setResizable(false);

		JPanel panel = new JPanel();

		panel.setLayout(null);

		int btnW = 220;
		int btnH = 60;
		int btnX = 400 - btnW / 2;
		int btnY = 0;

		ImageIcon backgrond = new ImageIcon("images/storage.png");
		ImageIcon img = new ImageIcon("images/buttonFrame.png");
		ImageIcon back = new ImageIcon("images/back.png");

		// 배경
		JLabel background = new JLabel(backgrond);
		background.setSize(800, 500);
		background.setLocation(0, 0);

		// 이전 페이지
		JLabel backLabel = new JLabel(back);
		backLabel.setSize(70, 49);
		backLabel.setLocation(30, 10);

		JButton backBtn = new JButton();
		backBtn.setBorderPainted(false);
		backBtn.setContentAreaFilled(false);
		backBtn.setFocusPainted(false);
		backBtn.setSize(70, 49);
		backBtn.setLocation(30, 10);

		// 재료 라벨
		JLabel panelLabel = new JLabel();
		panelLabel.setIcon(img);
		panelLabel.setSize(btnW, btnH);
		panelLabel.setLocation(btnX, btnY);

		JLabel ingreText = new JLabel("레시피 확인");
		ingreText.setFont(labelFont);
		ingreText.setHorizontalAlignment(JLabel.CENTER);
		ingreText.setSize(btnW, btnH);
		ingreText.setLocation(btnX, btnY);

		int recipeW = 90;
		int recipeH = recipeW;
		int recipeX = 135;
		int recipeY = 55;

		Image recipe = new ImageIcon("images/recipe1.png").getImage().getScaledInstance(recipeW, recipeH, 0);

		JLabel[][] ingreLabels = new JLabel[3][4];
		JLabel[][] ingreCntLabels = new JLabel[3][4];

		for (int i = 0; i < ingreLabels.length; i++) {
			for (int k = 0; k < ingreLabels[i].length; k++) {
				ingreLabels[i][k] = new JLabel(new ImageIcon(recipe));
				ingreLabels[i][k].setSize(recipeW, recipeH);
				ingreLabels[i][k].setLocation(recipeX + 150 * k, recipeY + 145 * i);
				panel.add(ingreLabels[i][k]);
			}
		}
		
		for (int i = 0; i < ingreCntLabels.length; i++) {
			for (int k = 0; k < ingreCntLabels[i].length; k++) {
				ingreCntLabels[i][k] = new JLabel("x1");
				ingreCntLabels[i][k].setFont(ingreLabelFont);
				ingreCntLabels[i][k].setHorizontalAlignment(JLabel.CENTER);
				ingreCntLabels[i][k].setSize(recipeW, 25);
				ingreCntLabels[i][k].setLocation(recipeX + 150 * k, recipeY + recipeH + 145 * i);
				panel.add(ingreCntLabels[i][k]);
			}
		}
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new StoragePage();

			}
		});

		// 패녈에 추가
		panel.add(backBtn);
		panel.add(backLabel);
		panel.add(ingreText);
		panel.add(panelLabel);
		panel.add(background);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
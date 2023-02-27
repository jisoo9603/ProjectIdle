package user.player.storage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.common.dto.RecipeStorageIngreDTO;
import user.player.ingreup.controller.RecipeStorageIngreController;

public class RecipeIngreStoragePage extends JFrame {

	private JFrame myPage;
	
	public RecipeIngreStoragePage(Map <String, String> map) {
		Font ingreLabelFont = new Font("DungGeunMo", Font.PLAIN, 20);
		RecipeStorageIngreController recipeStorageIngreController = new RecipeStorageIngreController();
		
		this.myPage = this;

		myPage.setSize(800, 500);
		myPage.setLocationRelativeTo(null);
		myPage.setResizable(false);
	
		Font labelfont = new Font("DungGeunMo", Font.PLAIN, 25);
		Color fontColor = new Color(0, 0, 0);
		Color btnColor = new Color(90, 190, 255);

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon back = new ImageIcon("images/storage.png");
		ImageIcon ingreboard = new ImageIcon("images/storageingreboard.png");

		// 배경
		JLabel backgroundLabel = new JLabel(back);
		backgroundLabel.setSize(myPage.getWidth(), myPage.getHeight());
		backgroundLabel.setLocation(0, -30);

		JLabel ingreboardLabel = new JLabel(ingreboard);
		ingreboardLabel.setSize(myPage.getWidth(), myPage.getHeight());
		ingreboardLabel.setLocation(0, -10);

		// 라벨

		JLabel infoText = new JLabel("레시피 재료");
		infoText.setHorizontalAlignment(JLabel.CENTER);
		infoText.setFont(labelfont);
		infoText.setForeground(fontColor);
		infoText.setSize(200, 200);
		infoText.setLocation(120, 30);


		int btnW = 90;
		int btnH = 30;
		int fix = btnW + 70;
		int btnX = 160 + btnW + 100;
		int btnY = 130 + (30 + 30) * 4;

		// 닫기 버튼
		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setFont(labelfont);
		closeBtn.setForeground(btnColor);
		closeBtn.setSize(90, btnH);
		closeBtn.setLocation(btnX - fix + 170, btnY -30);

		JLabel closeBtnShadow = new JLabel(closeBtn.getText());
		closeBtnShadow.setHorizontalAlignment(JLabel.CENTER);
		closeBtnShadow.setFont(labelfont);
		closeBtnShadow.setSize(closeBtn.getWidth(), closeBtn.getHeight());
		closeBtnShadow.setLocation(closeBtn.getX() + 2, closeBtn.getY() + 2);
		
		
		int ingreW = 90;
		int ingreH = ingreW;
		int ingreX = 135;
		int ingreY = 200;

		List<RecipeStorageIngreDTO> recipeStorageIngreList = recipeStorageIngreController.findRecipeStorageIngre(map); 		
		
		int index = 0;
		
		JLabel [] ingreLabels = new JLabel [4];
		JLabel [] ingreCntLabels = new JLabel [4];

		label:
		for (int i = 0; i < ingreLabels.length; i++) {
				if(index >= recipeStorageIngreList.size()) break label;
				
				Image IngreeImage = new ImageIcon(recipeStorageIngreList.get(index).getImg()).getImage().getScaledInstance(ingreW -20, ingreH -20, 0);
				ingreLabels[i] = new JLabel(new ImageIcon(IngreeImage));
				ingreLabels[i].setSize(ingreW, ingreH);
				ingreLabels[i].setLocation(ingreX + 150 * i, ingreY);
				panel.add(ingreLabels[i]);
		
				ingreCntLabels[i] = new JLabel((recipeStorageIngreList.get(index).getName()));
				ingreCntLabels[i].setFont(ingreLabelFont);
				ingreCntLabels[i].setHorizontalAlignment(JLabel.CENTER);
				ingreCntLabels[i].setSize(ingreW, 25);
				ingreCntLabels[i].setLocation(ingreX + 150 * i, ingreY + ingreH);
				panel.add(ingreCntLabels[i]);
				index++;
				
			}

		// 회원탈퇴 버튼
//		JButton signOutBtn = new JButton("회원탈퇴");
//		signOutBtn.setBorderPainted(false);
//		signOutBtn.setContentAreaFilled(false);
//		signOutBtn.setFocusPainted(false);
//		signOutBtn.setFont(labelfont);
//		signOutBtn.setForeground(fontColor);
//		signOutBtn.setSize(150, btnH);
//		signOutBtn.setLocation(btnX + fix, btnY);
//
//		JLabel signOutBtnShadow = new JLabel(signOutBtn.getText());
//		signOutBtnShadow.setHorizontalAlignment(JLabel.CENTER);
//		signOutBtnShadow.setFont(labelfont);
//		signOutBtnShadow.setSize(signOutBtn.getWidth(), signOutBtn.getHeight());
//		signOutBtnShadow.setLocation(signOutBtn.getX() + 2, signOutBtn.getY() + 2);
		
		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new RecipeStoragePage();

			}
			
		});

//		signOutBtn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				myPage.dispose();
//				new UserDeletePage();
//
//			}
//		});

		// 패널에 추가

		panel.add(infoText);

		panel.add(closeBtn);
		panel.add(closeBtnShadow);

//		panel.add(signOutBtn);
//		panel.add(signOutBtnShadow);

		panel.add(ingreboardLabel);
		panel.add(backgroundLabel);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

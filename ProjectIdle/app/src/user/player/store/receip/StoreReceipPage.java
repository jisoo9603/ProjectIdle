package user.player.store.receip;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.store.StoreMainPage;

public class StoreReceipPage extends JFrame {

	private JFrame myPage;

	public StoreReceipPage() {
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);

		this.myPage = this;

		ImageIcon img = new ImageIcon("images/StoreReceip.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		JButton btnBack = new JButton();
		btnBack.setLocation(5, 5);
		btnBack.setSize(70, 40);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);

		JButton btnLeft = new JButton();
		btnLeft.setLocation(360, 380);
		btnLeft.setSize(35, 35);
		btnLeft.setContentAreaFilled(false);
		btnLeft.setBorderPainted(false);
		btnLeft.setFocusPainted(false);

		JButton btnRight = new JButton();
		btnRight.setLocation(420, 380);
		btnRight.setSize(35, 35);
		btnRight.setContentAreaFilled(false);
		btnRight.setBorderPainted(false);
		btnRight.setFocusPainted(false);

		Image[] recipe = new Image[] {

		for (int i = 0; i < recipeList.length; i++) {
			for (int k = 0; k < recipeList[i].length; k++) {
				recipeList[i][k] = new JLabel(new ImageIcon(recipe[(i + k) % recipe.length]));
				recipeList[i][k].setSize(65, 65);
				recipeList[i][k].setLocation(130 * k + 100, 100 * i + 100);
				panel.add(recipeList[i][k]);
			}
		}
		//레시피 버튼 나열
		for(int i = 0; i < recipeBtn.length; i++) {
			for(int k = 0; k < recipeBtn[i].length; k++) {
				recipeBtn[i][k] = new JButton();
				recipeBtn[i][k].setBorderPainted(false);
				recipeBtn[i][k].setContentAreaFilled(false);
				recipeBtn[i][k].setFocusPainted(false);
				recipeBtn[i][k].setSize(65, 65);
				recipeBtn[i][k].setLocation(recipeList[i][k].getX(), recipeList[i][k].getY());
				panel.add(recipeBtn[i][k]);
			}			
		}
		//레시피 가격 나열
		for(int i = 0; i < recipePriceList.length; i++) {
			for(int k = 0; k < recipePriceList[i].length; k++) {
				recipePriceList[i][k] = new JLabel("1000원");
				recipePriceList[i][k].setSize(65, 30);
				recipePriceList[i][k].setLocation(recipeList[i][k].getX() + 10, recipeList[i][k].getY() + recipeList[i][k].getHeight());
				panel.add(recipePriceList[i][k]);
			}
		}
		
		
		
		panel.add(btnBack);
		panel.add(btnLeft);
		panel.add(btnRight);
		panel.add(background);

		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new StoreMainPage();

			}
		});
	}

}
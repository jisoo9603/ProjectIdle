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

import user.player.store.StoreMainPage;

public class StoreReceipPage extends JFrame {
	
	Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
	Font textFont = new Font("DungGeunMo", Font.PLAIN, 20);

	private JFrame myPage;

	public StoreReceipPage() {
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);

		this.myPage = this;

		ImageIcon img = new ImageIcon("images/StoreReceip.png");
		
		JLabel background = new JLabel(img);
		background.setSize(800, 500);
		background.setLocation(0, 0);
		

		JPanel panel = new JPanel();

		panel.setLayout(null);

		ImageIcon boardIcon = new ImageIcon("images/board2.png");
		JLabel board = new JLabel(boardIcon);
		board.setSize(boardIcon.getIconWidth(), boardIcon.getIconHeight());
		board.setLocation((myPage.getWidth() - board.getWidth()) / 2, (myPage.getHeight() - board.getHeight()) / 2);
		board.setVisible(false);
		
		JButton payBtn = new JButton("구매");
		payBtn.setBorderPainted(false);
		payBtn.setContentAreaFilled(false);
		payBtn.setFocusPainted(false);
		payBtn.setSize(board.getWidth(), 30);
		payBtn.setLocation(board.getX() + 100, board.getY() + board.getHeight() - payBtn.getHeight() * 2);
		payBtn.setFont(labelFont);
		payBtn.setVisible(false);
		
		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setSize(board.getWidth(), 30);
		closeBtn.setLocation(board.getX() - 100, board.getY() + board.getHeight() - closeBtn.getHeight() * 2);
		closeBtn.setFont(labelFont);
		closeBtn.setVisible(false);
		
		JLabel msglbl = new JLabel();
		msglbl.setSize(board.getWidth(), 30);
		msglbl.setLocation(board.getX(), board.getY() + (board.getHeight() - msglbl.getHeight()) / 2);
		msglbl.setFont(labelFont);
		msglbl.setHorizontalAlignment(JLabel.CENTER);
		msglbl.setVisible(false);
		
		panel.add(payBtn);
		panel.add(msglbl);
		panel.add(closeBtn);
		panel.add(board);
		
		JLabel payLabel = new JLabel();
		payLabel.setSize(220, 280);
		payLabel.setLocation(25, 70);
		
		//뒤로가기 버튼
		JButton btnBack = new JButton();
		btnBack.setLocation(5, 5);
		btnBack.setSize(70, 40);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setFocusPainted(false);
		
		//왼쪽 페이지 넘기기 버튼
		JButton btnLeft = new JButton();
		btnLeft.setLocation(360, 380);
		btnLeft.setSize(35, 35);
		btnLeft.setContentAreaFilled(false);
		btnLeft.setBorderPainted(false);
		btnLeft.setFocusPainted(false);
		
		//오른쪽 페이지 넘기기 버튼
		JButton btnRight = new JButton();
		btnRight.setLocation(420, 380);
		btnRight.setSize(35, 35);
		btnRight.setContentAreaFilled(false);
		btnRight.setBorderPainted(false);
		btnRight.setFocusPainted(false);

		Image[] recipe = new Image[] {
				new ImageIcon("images/recipe1.png").getImage().getScaledInstance(65, 65, 0)
		};

		JButton[][] recipeBtn = new JButton[3][5];
		JLabel[][] recipeList = new JLabel[3][5];
		JLabel[][] recipePriceList = new JLabel[3][5];

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
				recipeBtn[i][k].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						payBtn.setVisible(true);
						msglbl.setVisible(true);
						board.setVisible(true);
						closeBtn.setVisible(true);
					}
				});
				
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
		
		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl.setVisible(false);
				payBtn.setVisible(false);
				
			} 
		});
	}

}
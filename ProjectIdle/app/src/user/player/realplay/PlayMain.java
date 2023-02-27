package user.player.realplay;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.common.dto.PlayerDTO;
import user.player.gamemain.GameMain;
import user.player.store.ingre.IngreMarketPage;

public class PlayMain extends JFrame {
	Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);

	private JFrame myPage;

	private List<JButton> totalList;
	private int index = 0;

	public PlayMain(PlayerDTO player) {

		this.myPage = this;

		this.setSize(800, 530);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		this.setTitle("영업화면");

		// 메뉴 랜덤 발생
		String[] orders = {
				"라면", "김밥", "떡볶이", "제육볶음", "닭도리탕"
		};

		int randomOrderIndex1 = (int) (Math.random() * orders.length);

		int randomOrderIndex2 = (int) (Math.random() * orders.length);

		int randomOrderIndex3 = (int) (Math.random() * orders.length);

		ImageIcon img = new ImageIcon("images/PlayMain.png");

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		JButton goStore = new JButton();
		goStore.setContentAreaFilled(false);
		goStore.setSize(170, 60);
		goStore.setLocation(20, 420);
		goStore.setFocusPainted(false);
		goStore.setBorderPainted(false);
		goStore.addActionListener(new ActionListener() {
			// 상점이동 액션
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new IngreMarketPage(player);
			}
		});

		JButton playOut = new JButton();
		playOut.setContentAreaFilled(false);
		playOut.setSize(170, 60);
		playOut.setLocation(620, 420);
		playOut.setFocusPainted(false);
		playOut.setBorderPainted(false);
		playOut.addActionListener(new ActionListener() {

			// 영업종료 액션
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain(player);
			}
		});

		JButton cook1 = new JButton(orders[randomOrderIndex1]);
		cook1.setSize(150, 80);
		cook1.setFont(labelFont);
		cook1.setLocation(20, 70);
		cook1.setContentAreaFilled(false);
		cook1.setFocusPainted(false);
		cook1.setBorderPainted(false);

		JButton cook2 = new JButton(orders[randomOrderIndex2]);
		cook2.setSize(150, 80);
		cook2.setFont(labelFont);
		cook2.setLocation(195, 70);
		cook2.setContentAreaFilled(false);
		cook2.setFocusPainted(false);
		cook2.setBorderPainted(false);

		JButton cook3 = new JButton(orders[randomOrderIndex3]);
		cook3.setSize(150, 80);
		cook3.setFont(labelFont);
		cook3.setLocation(390, 70);
		cook3.setContentAreaFilled(false);
		cook3.setFocusPainted(false);
		cook3.setBorderPainted(false);

		ImageIcon boardIcon = new ImageIcon("images/board2.png");
		JLabel board = new JLabel(boardIcon);
		board.setSize(boardIcon.getIconWidth(), boardIcon.getIconHeight());
		board.setLocation(140, 150);
		board.setVisible(false);

		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setSize(150, 30);
		closeBtn.setForeground(new Color(164, 219, 255));
		closeBtn.setLocation(260, 300);
		closeBtn.setFont(labelFont);
		closeBtn.setVisible(false);

		JLabel msglbl1 = new JLabel(orders[randomOrderIndex1]);
		msglbl1.setSize(board.getWidth(), 30);
		msglbl1.setLocation(board.getX() - 100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl1.setFont(labelFont);
		msglbl1.setHorizontalAlignment(JLabel.CENTER);
		msglbl1.setVisible(false);

		JLabel msglbl2 = new JLabel(orders[randomOrderIndex2]);
		msglbl2.setSize(board.getWidth(), 30);
		msglbl2.setLocation(board.getX() - 100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl2.setFont(labelFont);
		msglbl2.setHorizontalAlignment(JLabel.CENTER);
		msglbl2.setVisible(false);

		JLabel msglbl3 = new JLabel(orders[randomOrderIndex3]);
		msglbl3.setSize(board.getWidth(), 30);
		msglbl3.setLocation(board.getX() - 100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl3.setFont(labelFont);
		msglbl3.setHorizontalAlignment(JLabel.CENTER);
		msglbl3.setVisible(false);

		JButton made1 = new JButton("제작하기");
		// closeBtn.setBorderPainted(false);
		made1.setContentAreaFilled(false);
		made1.setFocusPainted(false);
		made1.setSize(140, 30);
		made1.setForeground(new Color(164, 219, 255));
		made1.setLocation(380, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		made1.setFont(labelFont);
		made1.setVisible(false);

		JButton made2 = new JButton("제작하기");
		// closeBtn.setBorderPainted(false);
		made2.setContentAreaFilled(false);
		made2.setFocusPainted(false);
		made2.setSize(140, 30);
		made2.setForeground(new Color(164, 219, 255));
		made2.setLocation(380, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		made2.setFont(labelFont);
		made2.setVisible(false);

		JButton made3 = new JButton("제작하기");
		// closeBtn.setBorderPainted(false);
		made3.setContentAreaFilled(false);
		made3.setFocusPainted(false);
		made3.setSize(140, 30);
		made3.setForeground(new Color(164, 219, 255));
		made3.setLocation(380, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		made3.setFont(labelFont);
		made3.setVisible(false);

		totalList = new ArrayList<>();

		JButton[] madeLabel = new JButton[5];
		for (int i = 0; i < madeLabel.length; i++) {
			madeLabel[i] = new JButton();
			madeLabel[i].setFont(labelFont);
			madeLabel[i].setSize(120, 40);
			madeLabel[i].setLocation(510 + madeLabel[i].getWidth(), 50 * i + 130);
			madeLabel[i].setBorderPainted(false);
			madeLabel[i].setContentAreaFilled(false);
			madeLabel[i].setFocusPainted(false);
			totalList.add(madeLabel[i]);

		}

		for (JButton label : totalList) {
			panel.add(label);
		}
		System.out.println(totalList.size());

		// panel.add(plusmade2);
		// panel.add(plusmade3);

		panel.add(made1);
		panel.add(made2);
		panel.add(made3);
		panel.add(closeBtn);
		panel.add(msglbl1);
		panel.add(msglbl2);
		panel.add(msglbl3);
		panel.add(board);

		panel.add(cook1);
		panel.add(cook2);
		panel.add(cook3);
		panel.add(background);
		panel.add(goStore);
		panel.add(playOut);

		cook1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				board.setVisible(true);
				closeBtn.setVisible(true);
				msglbl1.setVisible(true);
				made1.setVisible(true);
			}
		});

		cook2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				board.setVisible(true);
				closeBtn.setVisible(true);
				msglbl2.setVisible(true);
				made2.setVisible(true);
			}
		});

		cook3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				board.setVisible(true);
				closeBtn.setVisible(true);
				msglbl3.setVisible(true);
				made3.setVisible(true);
			}
		});
		closeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl1.setVisible(false);
				msglbl2.setVisible(false);
				msglbl3.setVisible(false);
				made1.setVisible(false);
				made2.setVisible(false);
				made3.setVisible(false);
			}
		});

		made1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (index < totalList.size()) {
					totalList.get(index).setText(msglbl1.getText());
				}
				index++;

				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl1.setVisible(false);
				msglbl2.setVisible(false);
				msglbl3.setVisible(false);
				made1.setVisible(false);
				// plusmade1.setVisible(true);
			}
		});

		made2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (index < totalList.size()) {
					totalList.get(index).setText(msglbl2.getText());
				}
				index++;

				// plusmade1.setText(msglbl2.getText());

				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl1.setVisible(false);
				msglbl2.setVisible(false);
				msglbl3.setVisible(false);
				made2.setVisible(false);
				// plusmade1.setVisible(true);
			}
		});

		made3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (index < totalList.size()) {
					totalList.get(index).setText(msglbl3.getText());
				}
				index++;

				// plusmade1.setText(msglbl3.getText());

				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl1.setVisible(false);
				msglbl2.setVisible(false);
				msglbl3.setVisible(false);
				made3.setVisible(false);
				// plusmade1.setVisible(true);
			}
		});

		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//
	// private static void getOrderMenu() {
	// PlayService playService = new PlayService();
	//
	// playService.getOrderMenuInPlayer();
	// }
	//

}

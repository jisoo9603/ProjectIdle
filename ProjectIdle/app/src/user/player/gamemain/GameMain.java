package user.player.gamemain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.common.dto.PlayerDTO;
import user.player.info.UserInfoPage;
import user.player.realplay.PlayMain;
import user.player.signup.GameStart;
import user.player.storage.StoragePage;
import user.player.store.StoreMainPage;

public class GameMain extends JFrame {

	private JFrame myPage;

	public GameMain(PlayerDTO player) {
		this.setSize(800, 510);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);

		this.myPage = this;

		ImageIcon img = new ImageIcon("images/GameMain.png");

		JPanel panel = new JPanel();

		panel.setLayout(null);

		JLabel background = new JLabel(img);
		background.setLocation(0, 0);
		background.setSize(800, 500);

		JButton play = new JButton();
		play.setContentAreaFilled(false);
		play.setSize(137, 45);
		play.setLocation(68, 220);
		play.setFocusPainted(false);
		play.setBorderPainted(false);

		play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new PlayMain(player);
			}
		});

		JButton store = new JButton();

		store.setContentAreaFilled(false);
		store.setSize(137, 45);
		store.setLocation(511, 87);
		store.setFocusPainted(false);
		store.setBorderPainted(false);

		store.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new StoreMainPage();
			}
		});
		JButton storage = new JButton();

		storage.setContentAreaFilled(false);
		storage.setSize(125, 45);
		storage.setLocation(279, 102);
		storage.setFocusPainted(false);
		storage.setBorderPainted(false);
		storage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new StoragePage();
			}
		});

		JButton mypage = new JButton();
		//
		mypage.setContentAreaFilled(false);
		mypage.setSize(137, 45);
		mypage.setLocation(402, 346);
		mypage.setFocusPainted(false);
		mypage.setBorderPainted(false);
		mypage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new UserInfoPage();
			}
		});

		//
		JButton gameout = new JButton();

		gameout.setContentAreaFilled(false);
		gameout.setSize(137, 45);
		gameout.setLocation(645, 427);
		gameout.setFocusPainted(false);
		gameout.setBorderPainted(false);
		gameout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameStart();
			}
		});

		panel.setLayout(null);
		panel.add(play);
		panel.add(store);
		panel.add(storage);
		panel.add(mypage);
		panel.add(gameout);
		panel.add(background);

		myPage.add(panel);

		myPage.setVisible(true);
		myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

package user.player.store.receip;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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

		panel.add(btnBack);
		panel.add(btnLeft);
		panel.add(btnRight);
		panel.add(background);

		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
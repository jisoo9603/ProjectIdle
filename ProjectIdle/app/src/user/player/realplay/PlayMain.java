package user.player.realplay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.gamemain.GameMain;

public class PlayMain extends JFrame{
	
	private JFrame myPage;
	
	public PlayMain() {
		
		this.myPage = this;
		
		this.setSize(800, 530);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		this.setTitle("영업화면");
		
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
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain();
			}
		});
		
		JButton playOut = new JButton();
		playOut.setContentAreaFilled(false);
		playOut.setSize(170, 60);
		playOut.setLocation(620, 420);
		playOut.setFocusPainted(false);
		playOut.setBorderPainted(false);
		playOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain();
			}
		});
		
		JButton cook1 = new JButton();
		cook1.setSize(150, 100);
		cook1.setLocation(5, 60);
		cook1.setContentAreaFilled(false);
		cook1.setFocusPainted(false);
		cook1.setBorderPainted(false);
		
		JButton cook2 = new JButton();
		cook2.setSize(150, 100);
		cook2.setLocation(185, 60);
		cook2.setContentAreaFilled(false);
		cook2.setFocusPainted(false);
		cook2.setBorderPainted(false);
		
		JButton cook3 = new JButton();
		cook3.setSize(150, 100);
		cook3.setLocation(385, 60);
		cook3.setContentAreaFilled(false);
		cook3.setFocusPainted(false);
		cook3.setBorderPainted(false);
		
		panel.add(cook1);
		panel.add(cook2);
		panel.add(cook3);
        panel.add(background);
        panel.add(goStore);
        panel.add(playOut);
        
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}

}

package test;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gamestart extends JFrame {
	
    private JFrame myPage;
	
	public Gamestart() {
			
	      this.myPage = this;
	      myPage.setSize(800, 500);
	      myPage.setLocationRelativeTo(null);
	      myPage.setResizable(false);
		
	      JPanel panel = new JPanel();
	      
	      panel.setLayout(null);
			
	      Image backgrond = new ImageIcon("images/start.png").getImage().getScaledInstance(800, 500, 0); // 배경
	      
	      
	      JLabel background = new JLabel(new ImageIcon(backgrond));
	      background.setSize(800, 500);
	      background.setLocation(0, -30);
	      
	      panel.add(background);
	      
	      myPage.add(panel);

	      myPage.setVisible(true);
	      myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      panel.addMouseListener(new MouseAdapter() {
		
	    		@Override
				public void mouseClicked(MouseEvent e) {
					myPage.dispose();
					new Connecting();
					
				}
	      
	      });
	
	}
}

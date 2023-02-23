package user.player.realplay;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import user.player.common.dto.PlayerDTO;
import user.player.gamemain.GameMain;
import user.player.store.ingre.IngreMarketPage;


public class PlayMain extends JFrame{
	Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
		
	private JFrame myPage;
	
	public PlayMain(PlayerDTO player) {
		
		this.myPage = this;
		
		this.setSize(800, 530);
		this.setLocationRelativeTo(null);
		this.setAutoRequestFocus(false);
		this.setTitle("영업화면");
		
		String order1 = "떡볶이";
		String order2 = "라면";
		String order3 = "김밥";
		
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
			
			//상점이동 액션
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new IngreMarketPage();
			}
		});
		
		JButton playOut = new JButton();
		playOut.setContentAreaFilled(false);
		playOut.setSize(170, 60);
		playOut.setLocation(620, 420);
		playOut.setFocusPainted(false);
		playOut.setBorderPainted(false);
		playOut.addActionListener(new ActionListener() {
			
			//영업종료 액션
			@Override
			public void actionPerformed(ActionEvent e) {
				myPage.dispose();
				new GameMain(player);
			}
		});
		
		JButton cook1 = new JButton(order1);
		cook1.setSize(130, 80);
		cook1.setLocation(25, 70);
		cook1.setContentAreaFilled(false);
		cook1.setFocusPainted(false);
		cook1.setBorderPainted(false);
		
		JButton cook2 = new JButton(order2);
		cook2.setSize(130, 80);
		cook2.setLocation(200, 70);
		cook2.setContentAreaFilled(false);
		cook2.setFocusPainted(false);
		cook2.setBorderPainted(false);
		
		JButton cook3 = new JButton(order3);
		cook3.setSize(130, 80);
		cook3.setLocation(395, 70);
		cook3.setContentAreaFilled(false);
		cook3.setFocusPainted(false);
		cook3.setBorderPainted(false);
		
		JLabel board = new JLabel();
		board.setSize(500, 250);
		board.setOpaque(true);
		board.setBackground(new Color(246, 246, 246));
		board.setLocation(140,150);
		board.setVisible(false);
		
		JButton closeBtn = new JButton("닫기");
		closeBtn.setBorderPainted(false);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setFocusPainted(false);
		closeBtn.setSize(150, 30);
		closeBtn.setForeground(new Color(164, 219, 255));
		closeBtn.setLocation(320, 350);
		closeBtn.setFont(labelFont);
		closeBtn.setVisible(false);
		
		JLabel msglbl1 = new JLabel(order1);
		msglbl1.setSize(board.getWidth(), 30);
		msglbl1.setLocation(board.getX()-100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl1.setFont(labelFont);
		msglbl1.setHorizontalAlignment(JLabel.CENTER);
		msglbl1.setVisible(false);
		
		JLabel msglbl2 = new JLabel(order2);
		msglbl2.setSize(board.getWidth(), 30);
		msglbl2.setLocation(board.getX()-100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl2.setFont(labelFont);
		msglbl2.setHorizontalAlignment(JLabel.CENTER);
		msglbl2.setVisible(false);
		
		JLabel msglbl3 = new JLabel(order3);
		msglbl3.setSize(board.getWidth(), 30);
		msglbl3.setLocation(board.getX()-100, board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		msglbl3.setFont(labelFont);
		msglbl3.setHorizontalAlignment(JLabel.CENTER);
		msglbl3.setVisible(false);
		
		JLabel plusmade1 = new JLabel(order1); 
		plusmade1.setSize(board.getWidth(), 30);
		plusmade1.setLocation(430, 140);
		plusmade1.setFont(labelFont);
		plusmade1.setHorizontalAlignment(JLabel.CENTER);
		plusmade1.setVisible(false);
		
		JLabel plusmade2 = new JLabel(order2);
		plusmade2.setSize(board.getWidth(), 30);
		plusmade2.setLocation(430, 140);
		plusmade2.setFont(labelFont);
		plusmade2.setHorizontalAlignment(JLabel.CENTER);
		plusmade2.setVisible(false);
		
		JLabel plusmade3 = new JLabel(order3);
		plusmade3.setSize(board.getWidth(), 30);
		plusmade3.setLocation(430, 140);
		plusmade3.setFont(labelFont);
		plusmade3.setHorizontalAlignment(JLabel.CENTER);
		plusmade3.setVisible(false);
//		
//		JLabel[][] madeList = new JLabel[5][1];
//		
//		for(int i = 0; i < madeList.length; i++) {
//			for(int j = 0; j < madeList.length; j++) {
//				madeList[i][j] = new JLabel();
//			}
//		}

		JButton made1 = new JButton("제작하기");
		//closeBtn.setBorderPainted(false);
		made1.setContentAreaFilled(false);
		made1.setFocusPainted(false);
		made1.setSize(140, 30);
		made1.setForeground(new Color(164, 219, 255));
		made1.setLocation(480,  board.getY() + (board.getHeight() - msglbl1.getHeight()) / 2);
		made1.setFont(labelFont);
		made1.setVisible(false);
		
		panel.add(plusmade1);
		panel.add(plusmade2);
		panel.add(plusmade3);
		
		panel.add(made1);
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
				made1.setVisible(true);
			}
		});
    	
    	cook3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				board.setVisible(true);
				closeBtn.setVisible(true);
				msglbl3.setVisible(true);
				made1.setVisible(true);
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
			}
		});
    	
    	made1.addActionListener(new ActionListener() {
    		
			@Override
			public void actionPerformed(ActionEvent e) {

				board.setVisible(false);
				closeBtn.setVisible(false);
				msglbl1.setVisible(false);
				msglbl2.setVisible(false);
				msglbl3.setVisible(false);
				made1.setVisible(false);
				plusmade1.setVisible(true);
			}
		});
 
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

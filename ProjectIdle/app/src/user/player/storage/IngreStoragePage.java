package user.player.storage;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lombok.RequiredArgsConstructor;
import user.player.ingreup.controller.IngreController;

public class IngreStoragePage extends JFrame {

	private JFrame myPage;

	public IngreStoragePage() {
		Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
		Font ingreLabelFont = new Font("DungGeunMo", Font.PLAIN, 20);
		IngreController ingreController = new IngreController();

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

		JLabel ingreText = new JLabel("재료 확인");
		ingreText.setFont(labelFont);
		ingreText.setHorizontalAlignment(JLabel.CENTER);
		ingreText.setSize(btnW, btnH);
		ingreText.setLocation(btnX, btnY);

		int ingreW = 90;
		int ingreH = ingreW;
		int ingreX = 135;
		int ingreY = 55;
//		필요한 것 저장해주는 변수 배열! or array list
//		ingreController.findAllingre(); 
//		저장해주는 변수 배열! or array list
		
		Image ingre = new ImageIcon("images/chicken.png").getImage().getScaledInstance(ingreW, ingreH, 0);

		JLabel[][] ingreLabels = new JLabel[3][4];
		JLabel[][] ingreCntLabels = new JLabel[3][4];

		for (int i = 0; i < ingreLabels.length; i++) {
			for (int k = 0; k < ingreLabels[i].length; k++) {
				ingreLabels[i][k] = new JLabel(new ImageIcon(ingre));
				ingreLabels[i][k].setSize(ingreW, ingreH);
				ingreLabels[i][k].setLocation(ingreX + 150 * k, ingreY + 145 * i);
				panel.add(ingreLabels[i][k]);
			}
		}

		for (int i = 0; i < ingreCntLabels.length; i++) {
			for (int k = 0; k < ingreCntLabels[i].length; k++) {
				ingreCntLabels[i][k] = new JLabel("i*k=" + (i * k));
				ingreCntLabels[i][k].setFont(ingreLabelFont);
				ingreCntLabels[i][k].setHorizontalAlignment(JLabel.CENTER);
				ingreCntLabels[i][k].setSize(ingreW, 25);
				ingreCntLabels[i][k].setLocation(ingreX + 150 * k, ingreY + ingreH + 145 * i);
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
		
		public class IngreList
		{
			Connection con; // 멤버변수
			Statement stmt;
			ResultSet rs;	
			Ingre[]c_array;
		
			public IngreList
		
		}
		
		
		
		@Override
	    public void actionPerformed(ActionEvent e) {
		       String btnLabel =e.getActionCommand();//이벤트주체 대한 Label 가져오기
		       
		       if(btnLabel.equals("조회")){
		           if(list(this) > 0 ){//가입성공
		               messageBox(this , name.getText()+"님 가입축드립니다.");
		               dispose();//JDialog 창닫기
		               
		               dao.userSelectAll(me.dt);//모든레코드가져와서 DefaultTableModel에 올리기
		               
		               if(me.dt.getRowCount() > 0)
		                   me.jt.setRowSelectionInterval(0, 0);//첫번째 행 선택
		               
		           }else{//가입실패
		               messageBox(this,"가입되지 않았습니다.");
		           }

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
}
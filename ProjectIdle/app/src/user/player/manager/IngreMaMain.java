package user.player.manager;

import static user.player.run.Application.labelFont;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IngreMaMain extends JFrame {

   private JFrame myPage;

   public IngreMaMain() {

      //     Font signUpFont = new Font("DungGeunMo", Font.BOLD, 70);
      this.setSize(800, 500);
      this.setLocationRelativeTo(null);
      this.setAutoRequestFocus(false);

      this.myPage = this;

      ImageIcon img = new ImageIcon("images/ingreM.png");

      JPanel panel = new JPanel();

      panel.setLayout(null);

      JLabel background = new JLabel(img);
      background.setLocation(0, 0);
      background.setSize(800, 500);

    
      //뒤로가기버튼
      JButton close = new JButton();
      close.setSize(60, 40);
      close.setLocation(10, 10);
      close.setBorderPainted(false); 
      close.setContentAreaFilled(false); // 버튼 투명
      close.setFocusPainted(false);

      //재료현황버튼
      JButton ingreNow= new JButton();
      ingreNow.setSize(200, 60);
      ingreNow.setLocation(580, 70);
      ingreNow.setBorderPainted(false); 
      ingreNow.setContentAreaFilled(false); // 버튼 투명
      ingreNow.setFocusPainted(false);

      
    //재료등록버튼
      JButton ingrePlus = new JButton();
      ingrePlus.setSize(200, 60);
      ingrePlus.setLocation(580, 160);
      ingrePlus.setBorderPainted(false); 
      ingrePlus.setContentAreaFilled(false); // 버튼 투명
      ingrePlus.setFocusPainted(false);

      
    //재료수정버튼
      JButton ingreEdit = new JButton();
      ingreEdit.setSize(200, 50);
      ingreEdit.setLocation(580, 250);
      ingreEdit.setBorderPainted(false); 
      ingreEdit.setContentAreaFilled(false); // 버튼 투명
      ingreEdit.setFocusPainted(false);

      
      
    // 재료삭제 버튼
      JButton ingreDelete = new JButton();
      ingreDelete.setSize(200, 50);
      ingreDelete.setLocation(580, 340);
      ingreDelete.setBorderPainted(false); 
      ingreDelete.setContentAreaFilled(false); // 버튼 투명
      ingreDelete.setFocusPainted(false);

      
 

      panel.add(close);
      panel.add(ingreNow);
      panel.add(ingrePlus);
      panel.add(ingreEdit);
      panel.add(ingreDelete);
      
      
   
      panel.add(background);
      this.add(panel);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
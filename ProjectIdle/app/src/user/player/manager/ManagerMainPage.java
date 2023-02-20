package user.player.manager;

import static user.player.run.Application.labelFont;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ManagerMainPage extends JFrame {

   private JFrame myPage;

   public ManagerMainPage() {

      //     Font signUpFont = new Font("DungGeunMo", Font.BOLD, 70);
      this.setSize(800, 500);
      this.setLocationRelativeTo(null);
      this.setAutoRequestFocus(false);

      this.myPage = this;

      ImageIcon img = new ImageIcon("images/managerMain.png");

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

      //회원관리버튼
      JButton userM = new JButton();
      userM.setSize(150, 40);
      userM.setLocation(150, 190);
      userM.setBorderPainted(false); 
      userM.setContentAreaFilled(false); // 버튼 투명
      userM.setFocusPainted(false);

      
    //랭킹관리버튼
      JButton rankM = new JButton();
      rankM.setSize(150, 40);
      rankM.setLocation(150, 320);
      rankM.setBorderPainted(false); 
      rankM.setContentAreaFilled(false); // 버튼 투명
      rankM.setFocusPainted(false);

      
    //재료버튼
      JButton ingreM = new JButton();
      ingreM.setSize(90, 40);
      ingreM.setLocation(570, 150);
      ingreM.setBorderPainted(false); 
      ingreM.setContentAreaFilled(false); // 버튼 투명
      ingreM.setFocusPainted(false);

      
      
    // 레시피버튼
      JButton receipM = new JButton();
      receipM.setSize(90, 40);
      receipM.setLocation(570, 250);
      receipM.setBorderPainted(false); 
      receipM.setContentAreaFilled(false); // 버튼 투명
      receipM.setFocusPainted(false);

      
      
    //확장권버튼
      JButton updateM = new JButton();
      updateM.setSize(100, 40);
      updateM.setLocation(560, 350);
      updateM.setBorderPainted(false); 
      updateM.setContentAreaFilled(false); // 버튼 투명
      updateM.setFocusPainted(false);

     
      // 회원가입완료 그림자 효과
      //            JLabel signUpShadow = new JLabel(signUp.getText());
      //            signUpShadow.setFont(littlebigFont);
      //            signUpShadow.setSize(350, 150);
      //            signUpShadow.setLocation(250, 380);



      //      JButton btn = new JButton();
      //      btn.setLocation(250, 375);
      //      btn.setSize(315, 65);
      //      btn.setContentAreaFilled(false);   

      // 패녈에 추가

      panel.add(close);
      panel.add(userM);
      panel.add(rankM);
      panel.add(ingreM);
      panel.add(receipM);
      panel.add(updateM);
      
   
      panel.add(background);
      this.add(panel);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
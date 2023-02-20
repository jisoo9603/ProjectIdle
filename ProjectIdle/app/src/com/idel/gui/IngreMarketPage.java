package com.idel.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IngreMarketPage extends JFrame {

   private JFrame myPage;

   public IngreMarketPage() {
      Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
      Font textFont = new Font("DungGeunMo", Font.PLAIN, 20);

      this.myPage = this;
      myPage.setSize(800, 500);
      myPage.setLocationRelativeTo(null);
      myPage.setResizable(false);

      JPanel panel = new JPanel();

      panel.setLayout(null);

      ImageIcon backgrond = new ImageIcon("img/Market.png"); // 배경

      Image backImg = new ImageIcon("img/back.png").getImage().getScaledInstance(50, 35, 0);
      ImageIcon back = new ImageIcon(backImg); // 이전화면

      ImageIcon panelImg = new ImageIcon("img/panelFrame.png"); // 항목 배경

      Image btn = new ImageIcon("img/buttonFrame.png").getImage().getScaledInstance(146, 40, 0);
      ImageIcon btnImg = new ImageIcon(btn); // 자금 배경

      // 배경
      JLabel background = new JLabel(backgrond);
      background.setSize(800, 500);
      background.setLocation(0, 0);

      // 이전 화면 이동
      JLabel backLabel = new JLabel(back);
      backLabel.setSize(back.getIconWidth(), back.getIconHeight());
      backLabel.setLocation(30, 10);

      JButton backBtn = new JButton();
      backBtn.setBorderPainted(false);
      backBtn.setContentAreaFilled(false);
      backBtn.setFocusPainted(false);
      backBtn.setSize(70, 49);
      backBtn.setLocation(30, 10);

      // 재료 화면
      Color labelColor = new Color(250, 220, 120);
      Color fontColor = new Color(255, 255, 140);

      int lblX = 25;
      int lblY = 60;

      // 재료 목록
      JLabel ingreLabel = new JLabel();
      ingreLabel.setSize(500, 390);
      ingreLabel.setLocation(lblX, lblY);
      ingreLabel.setOpaque(true);
      ingreLabel.setBackground(labelColor);

      JLabel ingrePanel = new JLabel(panelImg);
      ingrePanel.setSize(panelImg.getIconWidth(), panelImg.getIconHeight());
      ingrePanel.setLocation((ingreLabel.getWidth() - ingrePanel.getWidth()) / 2 + 20, 10);

      JLabel ingreText = new JLabel("재료 구매");
      ingreText.setSize(ingrePanel.getWidth(), ingrePanel.getHeight());
      ingreText.setLocation(ingrePanel.getX(), ingrePanel.getY());
      ingreText.setFont(labelFont);
      ingreText.setForeground(fontColor);
      ingreText.setHorizontalAlignment(JLabel.CENTER);

      // 주문 목록
      JLabel orderLabel = new JLabel();
      orderLabel.setSize(220, 280);
      orderLabel.setLocation(lblX + ingreLabel.getWidth() + 20, lblY);
      orderLabel.setOpaque(true);
      orderLabel.setBackground(labelColor);

      JLabel orderPanel = new JLabel(panelImg);
      orderPanel.setSize(panelImg.getIconWidth(), panelImg.getIconHeight());
      orderPanel.setLocation(orderLabel.getX(), 10);

      JLabel orderText = new JLabel("구매 목록");
      orderText.setSize(orderPanel.getWidth(), orderPanel.getHeight());
      orderText.setLocation(orderPanel.getX(), orderPanel.getY());
      orderText.setFont(labelFont);
      orderText.setForeground(fontColor);
      orderText.setHorizontalAlignment(JLabel.CENTER);

      // 총 금액 및 결재
      JLabel payLabel = new JLabel();
      payLabel.setSize(orderLabel.getWidth(), ingreLabel.getHeight() - (orderLabel.getHeight() + 10));
      payLabel.setLocation(orderLabel.getX(), lblY + orderLabel.getHeight() + 10);
      payLabel.setOpaque(true);
      payLabel.setBackground(labelColor);

      int pay = 4000;
      JLabel payText = new JLabel("총 : " + pay + "원");
      payText.setSize(payLabel.getWidth(), 30);
      payText.setLocation(payLabel.getX(), payLabel.getY());
      payText.setFont(labelFont);
      payText.setHorizontalAlignment(JLabel.CENTER);

      JButton payBtn = new JButton("결재하기");
      payBtn.setBorderPainted(false);
      payBtn.setContentAreaFilled(false);
      payBtn.setFocusPainted(false);
      payBtn.setSize(payLabel.getWidth(), 30);
      payBtn.setLocation(payLabel.getX(), payLabel.getY() + payLabel.getHeight() - payBtn.getHeight());
      payBtn.setFont(labelFont);

      // 자금
      JLabel btnPanel = new JLabel(btnImg);
      btnPanel.setSize(btnImg.getIconWidth(), btnImg.getIconHeight());
      btnPanel.setLocation(ingreLabel.getX() + ingreLabel.getWidth() - btnImg.getIconWidth(),
            (ingreLabel.getY() - btnImg.getIconHeight()) / 2);

      int gold = 500;
      JLabel btnText = new JLabel("자금 : " + gold + "원");
      btnText.setSize(btnPanel.getWidth(), btnPanel.getHeight());
      btnText.setLocation(btnPanel.getX(), btnPanel.getY());
      btnText.setFont(textFont);
      btnText.setHorizontalAlignment(JLabel.CENTER);

      ImageIcon boardIcon = new ImageIcon("img/board2.png");
      JLabel board = new JLabel(boardIcon);
      board.setSize(boardIcon.getIconWidth(), boardIcon.getIconHeight());
      board.setLocation(100, 100);
      board.setVisible(false);

      JLabel msglbl = new JLabel("hell");
      msglbl.setSize(boardIcon.getIconWidth(), 30);
      msglbl.setLocation(board.getX(), 220);
      msglbl.setFont(labelFont);
      msglbl.setHorizontalAlignment(JLabel.CENTER);
      msglbl.setVisible(false);

      JButton closeBtn = new JButton("닫기");
      closeBtn.setBorderPainted(false);
      closeBtn.setContentAreaFilled(false);
      closeBtn.setFocusPainted(false);
      closeBtn.setSize(100, 30);
      closeBtn.setLocation(350, 350);
      closeBtn.setFont(labelFont);
      closeBtn.setVisible(false);

      panel.add(closeBtn);
      panel.add(msglbl);
      panel.add(board);

      // 재료 변수 들
      int ingreW = 65;
      int ingreH = ingreW;
      int ingreX = lblX + 15;
      int ingreY = lblY + 35;

      // 재료 이미지
      Image[] ingre = new Image[] {
            new ImageIcon("img/chicken.png").getImage().getScaledInstance(ingreW, ingreH, 0),
            new ImageIcon("img/beef.png").getImage().getScaledInstance(ingreW, ingreH, 0),
            new ImageIcon("img/fish.png").getImage().getScaledInstance(ingreW, ingreH, 0)
      };

      JButton[][] ingreBtn = new JButton[3][5]; // 재료 버튼
      JLabel[][] ingreList = new JLabel[3][5]; // 재료 리스트
      JLabel[][] ingrePriceList = new JLabel[3][5]; // 재료 가격 리스트

      // 재료 목록 나열
      for (int i = 0; i < ingreList.length; i++) {
         for (int k = 0; k < ingreList[i].length; k++) {
            ingreList[i][k] = new JLabel(new ImageIcon(ingre[(i + k) % ingre.length]));
            ingreList[i][k].setSize(ingreW, ingreH);
            ingreList[i][k].setLocation(ingreX + 100 * k, ingreY + 100 * i);
            panel.add(ingreList[i][k]);
         }
      }

      // 재료 버튼 나열
      for (int i = 0; i < ingreBtn.length; i++) {
         for (int k = 0; k < ingreBtn[i].length; k++) {
            ingreBtn[i][k] = new JButton();
            ingreBtn[i][k].setBorderPainted(false);
            ingreBtn[i][k].setContentAreaFilled(false);
            ingreBtn[i][k].setFocusPainted(false);
            ingreBtn[i][k].setSize(ingreW, ingreH);
            ingreBtn[i][k].setLocation(ingreList[i][k].getX(), ingreList[i][k].getY());
            panel.add(ingreBtn[i][k]);
         }
      }

      // 재료 가격 나열
      for (int i = 0; i < ingrePriceList.length; i++) {
         for (int k = 0; k < ingrePriceList[i].length; k++) {
            ingrePriceList[i][k] = new JLabel("1000원");
            ingrePriceList[i][k].setSize(ingreW, 30);
            ingrePriceList[i][k].setLocation(ingreList[i][k].getX(), ingreList[i][k].getY() + ingreH);
            ingrePriceList[i][k].setFont(textFont);
            ingrePriceList[i][k].setHorizontalAlignment(JLabel.CENTER);
            panel.add(ingrePriceList[i][k]);
         }
      }

      int orderW = 50;
      int orderH = orderW;

      Image[] order = new Image[] {
            new ImageIcon("img/chicken.png").getImage().getScaledInstance(orderW, orderH, 0),
            new ImageIcon("img/beef.png").getImage().getScaledInstance(orderW, orderH, 0),
            new ImageIcon("img/fish.png").getImage().getScaledInstance(orderW, orderH, 0)
      };

      JLabel[] orderList = new JLabel[4];
      JLabel[] orderTextList = new JLabel[4];

      for (int i = 0; i < orderList.length; i++) {
         orderList[i] = new JLabel(new ImageIcon(order[i % order.length]));
         orderList[i].setSize(orderW, orderH);
         orderList[i].setLocation(orderLabel.getX() + 10, ingreY + (orderList[i].getHeight() + 10) * i);
         panel.add(orderList[i]);
      }

      for (int i = 0; i < orderTextList.length; i++) {
         orderTextList[i] = new JLabel("1000원");
         orderTextList[i].setSize(100, 30);
         orderTextList[i].setLocation(orderList[i].getX() + orderList[i].getWidth(),
         orderList[i].getY() + orderList[i].getHeight() / 6);
         orderTextList[i].setFont(textFont);
         orderTextList[i].setHorizontalAlignment(JLabel.CENTER);
         panel.add(orderTextList[i]);
      }

      // 패녈에 추가

      panel.add(btnText);
      panel.add(btnPanel);

      panel.add(ingreText);
      panel.add(ingrePanel);
      panel.add(ingreLabel);

      panel.add(orderText);
      panel.add(orderPanel);
      panel.add(orderLabel);

      panel.add(payText);
      panel.add(payBtn);
      panel.add(payLabel);

      panel.add(backBtn);
      panel.add(backLabel);
      panel.add(background);

      myPage.add(panel);

      myPage.setVisible(true);
      myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      backBtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {

            myPage.dispose();
            new GameMain();

         }
      });

      payBtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {

            String message;
            if (pay > gold) {
               message = "자금이 부족합니다.";
            } else {
               message = "성공적으로 구매하셨습니다.";
            }

            System.out.println(message);
            msglbl.setText(message);

            closeBtn.setVisible(true);
            msglbl.setVisible(true);
            board.setVisible(true);

         }
      });
      closeBtn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            closeBtn.setVisible(false);
            msglbl.setVisible(false);
            board.setVisible(false);

         }
      });
   }

}
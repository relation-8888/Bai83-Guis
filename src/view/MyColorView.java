package view;

import controller.MyColorListener;
import model.MyColorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;


    public MyColorView()  {
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("My color");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyColorListener myColorListener = new MyColorListener(this);

        jLabel = new JLabel("Text..........");
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new GridLayout(2,3));
        Font font = new Font("Arial",Font.BOLD,18);

        Font fontest = new Font("Arial", Font.BOLD,100);
        jLabel.setFont(fontest);
        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.addActionListener(myColorListener);

        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.addActionListener(myColorListener);

        JButton jButton_text_Green = new JButton("Green Text");
        jButton_text_Green.setFont(font);
        jButton_text_Green.setForeground(Color.GREEN);
        jButton_text_Green.addActionListener(myColorListener);

        //mmàu nền

        JButton jButton_background_red = new JButton("Red Background");
        jButton_background_red.setFont(font);
        jButton_background_red.setBackground(Color.RED);
        jButton_background_red.setOpaque(true);

        JButton jButton_background_yellow = new JButton("Yellow Background");
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        jButton_background_yellow.setOpaque(true);

        JButton jButton_background_Green = new JButton("Green Background");
        jButton_background_Green.setFont(font);
        jButton_background_Green.setBackground(Color.GREEN);

        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_Green);
        jPanel.add(jButton_background_red);
        jPanel.add(jButton_background_yellow);
        jPanel.add(jButton_background_Green);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);




        this.setVisible(true);
    }

    public void changTextColor(Color color) {
        this.jLabel.setForeground(color);
    }
    public void changBackgroundColor(Color color) {
        this.jLabel.setBackground(color);
    }
}

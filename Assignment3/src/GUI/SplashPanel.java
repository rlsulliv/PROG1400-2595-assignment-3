package GUI;

import javax.swing.*;
import java.awt.*;

public class SplashPanel extends JPanel {


    private JLabel titleLabel;
    private JLabel homePagePic;
    private JButton startBut;

    public JButton getStartBut() {
        return startBut;
    }

    public SplashPanel() {
        Font myFont = new Font("Calibri", Font.BOLD, 24);

        setLayout(null);
        setBackground(new Color(128, 220, 220));
        setVisible(true);

        //Label control for name
        titleLabel = new JLabel("RPG Character Creator");
        titleLabel.setFont(myFont);
        titleLabel.setForeground(new Color(128, 0, 128));
        titleLabel.setBounds(250, 20, 400, 40);

        ImageIcon image = new ImageIcon(this.getClass().getResource("/Images/dd_1400x.jpg"));

        homePagePic = new JLabel(image);
        homePagePic.setFont(myFont);
        homePagePic.setBounds(200, 80, 400, 300);


        startBut = new JButton("Build a Character");
        startBut.setFont(myFont);
        startBut.setBackground(new Color(128, 0, 128));
        startBut.setForeground(Color.WHITE);
        startBut.setFocusPainted(false);
        startBut.setBounds(250, 400, 300, 50);

        //Add all controls to Panel
        add(titleLabel);
        add(homePagePic);
        add(startBut);

    }


}

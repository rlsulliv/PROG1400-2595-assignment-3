package GUI;

import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setTitle("DND Game");
        setLayout(null);

        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        SplashPanel splashPanel = new SplashPanel();

        splashPanel.setBounds(0,0,1000,800);
        chooseScreen.setBounds(0,0,1000,800);
        displayScreen.setBounds(0,0,1000,800);


        splashPanel.getStartBut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                splashPanel.setVisible(false);
                chooseScreen.setVisible(true);
            }
        });
        chooseScreen.getStartBattleBut().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                PlayerCharacter player = chooseScreen.createPlayer();
                Monster enemy = chooseScreen.createMonster();

                displayScreen.updateBattleSummary(player, enemy);

                chooseScreen.setVisible(false);
                displayScreen.setVisible(true);
            }
        });


        displayScreen.getPlayAgainBut().addActionListener(e -> {
            displayScreen.setVisible(false);
            chooseScreen.setVisible(true);
        });

        add(splashPanel);
        add(chooseScreen);
        add(displayScreen);

        setVisible(true);
        chooseScreen.setVisible(false);
        displayScreen.setVisible(false);
    }
}
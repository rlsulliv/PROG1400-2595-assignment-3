package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//extends JFrame
public class MainFrame extends JFrame {

    // Constructor
    public MainFrame() {
        //Set Frame Properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setTitle("DND Game");
        setLayout(new CardLayout());

        //Add Panel "screens"
        ChoosePanel chooseScreen = new ChoosePanel();
        DisplayPanel displayScreen = new DisplayPanel();
        SplashPanel splashPanel = new SplashPanel();

        JButton startButton= splashPanel.getStartBut();
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                splashPanel.setVisible(false);
                chooseScreen.setVisible(true); }
        });

        JButton startBattleButton = chooseScreen.getStartBattleBut();
        startBattleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
    }
}

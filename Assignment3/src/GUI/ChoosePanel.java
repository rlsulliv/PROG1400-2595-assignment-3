package GUI;

import javax.swing.*;
import java.awt.*;

public class ChoosePanel extends JPanel {
    private JLabel chooseLabel;
    private JLabel enterNameLabel;
    private JTextField enterNameField;
    private JLabel characterTypeLabel;

    private JRadioButton warriorBut;
    private JRadioButton wizardBut;
    private JRadioButton clericBut;

    public ChoosePanel() {
        Font myFont = new Font("Calibri", Font.BOLD, 24);

        setLayout(null);
        setBackground(new Color(128, 220, 220));
        setVisible(true);

        chooseLabel = new JLabel("Character Generator");
        chooseLabel.setFont(myFont);
        chooseLabel.setForeground(new Color(128, 0, 128));
        chooseLabel.setBounds(250, 20, 400, 40);

        enterNameLabel= new JLabel("Enter Name");
        enterNameLabel.setBounds(50, 100, 150, 30);
        enterNameLabel.setFont(myFont);

        enterNameField = new JTextField(20);
        enterNameField.setBounds(210, 100, 150, 30);

        add(chooseLabel);
        add(enterNameLabel);
        add(enterNameField);
    }
}

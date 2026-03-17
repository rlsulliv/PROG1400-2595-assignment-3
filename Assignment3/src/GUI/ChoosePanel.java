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

    private JTextArea infoCharArea;

    private JLabel selectWeaponLabel;

    private JRadioButton daggerBut;
    private JRadioButton swordBut;
    private JRadioButton hammerBut;

    private JTextArea infoWeaponArea;

    private JLabel characterStatsLabel;
    private JLabel hitPointsLabel;
    private JTextField hitPointsField;
    private JLabel defenceLabel;
    private JTextField defenceField;
    private JLabel agilityLabel;
    private JTextField agilityField;
    private JLabel baseAttackLabel;
    private JTextField baseAttackField;

    private JLabel weaponStats;
    private JLabel attackModLabel;
    private JTextField attackModField;
    private JLabel weightLabel;
    private JTextField weightField;

    private JButton rerollBut;
    private JButton startBattleBut;

    public JButton getStartBattleBut() {
        return startBattleBut;
    }

    public ChoosePanel() {

        Font myFont = new Font("Calibri", Font.BOLD, 24);

        setLayout(null);
        setBackground(new Color(128, 220, 220));
        setVisible(true);

        chooseLabel = new JLabel("Character Generator");
        chooseLabel.setFont(myFont);
        chooseLabel.setForeground(new Color(128, 0, 128));
        chooseLabel.setBounds(250, 20, 400, 40);

        enterNameLabel = new JLabel("Enter Name");
        enterNameLabel.setBounds(50, 100, 150, 30);
        enterNameLabel.setFont(myFont);
        enterNameLabel.setForeground(new Color(128, 0, 128));

        enterNameField = new JTextField(20);
        enterNameField.setBounds(210, 100, 150, 30);

        characterTypeLabel = new JLabel("Character Type");
        characterTypeLabel.setFont(myFont);
        characterTypeLabel.setForeground(new Color(128, 0, 128));
        characterTypeLabel.setBounds(100, 150, 200, 30);

        warriorBut = new JRadioButton("Warrior");
        warriorBut.setFont(myFont);
        warriorBut.setForeground(new Color(128, 0, 128));
        warriorBut.setBounds(50, 180, 150, 30);
        warriorBut.setBackground(new Color(128, 220, 220));

        wizardBut = new JRadioButton("Wizard");
        wizardBut.setFont(myFont);
        wizardBut.setForeground(new Color(128, 0, 128));
        wizardBut.setBounds(50, 220, 150, 30);
        wizardBut.setBackground(new Color(128, 220, 220));

        clericBut = new JRadioButton("Cleric");
        clericBut.setFont(myFont);
        clericBut.setForeground(new Color(128, 0, 128));
        clericBut.setBounds(50, 260, 150, 30);
        clericBut.setBackground(new Color(128, 220, 220));

        ButtonGroup classGroup = new ButtonGroup();
        classGroup.add(warriorBut);
        classGroup.add(wizardBut);
        classGroup.add(clericBut);

        infoCharArea = new JTextArea();
        infoCharArea.setBounds(50, 300, 350, 100);
        infoCharArea.setEditable(false);
        infoCharArea.setLineWrap(true);
        infoCharArea.setWrapStyleWord(true);
        infoCharArea.setFont(myFont);
        infoCharArea.setForeground(new Color(128, 0, 128));

        selectWeaponLabel = new JLabel("Select Your Weapon");
        selectWeaponLabel.setFont(myFont);
        selectWeaponLabel.setForeground(new Color(128, 0, 128));
        selectWeaponLabel.setBounds(100, 410, 250, 30);

        daggerBut = new JRadioButton("Dagger");
        daggerBut.setFont(myFont);
        daggerBut.setForeground(new Color(128, 0, 128));
        daggerBut.setBounds(50, 450, 150, 30);
        daggerBut.setBackground(new Color(128, 220, 220));

        swordBut = new JRadioButton("Sword");
        swordBut.setFont(myFont);
        swordBut.setForeground(new Color(128, 0, 128));
        swordBut.setBounds(50, 495, 150, 30);
        swordBut.setBackground(new Color(128, 220, 220));

        hammerBut = new JRadioButton("Hammer");
        hammerBut.setFont(myFont);
        hammerBut.setForeground(new Color(128, 0, 128));
        hammerBut.setBounds(50, 540, 150, 30);
        hammerBut.setBackground(new Color(128, 220, 220));

        ButtonGroup classGroupTwo = new ButtonGroup();
        classGroupTwo.add(daggerBut);
        classGroupTwo.add(swordBut);
        classGroupTwo.add(hammerBut);

        infoWeaponArea = new JTextArea();
        infoWeaponArea.setBounds(50, 580, 350, 80);
        infoWeaponArea.setEditable(false);
        infoWeaponArea.setLineWrap(true);
        infoWeaponArea.setWrapStyleWord(true);
        infoWeaponArea.setForeground(new Color(128, 0, 128));
        infoWeaponArea.setFont(myFont);

        characterStatsLabel = new JLabel("Character Stats");
        characterStatsLabel.setForeground(new Color(128, 0, 128));
        characterStatsLabel.setFont(myFont);
        characterStatsLabel.setBounds(500, 150, 200, 30);

        // ── Fixed widths on right-side labels so text doesn't get cut off ────
        hitPointsLabel = new JLabel("Hit Points");
        hitPointsLabel.setForeground(new Color(128, 0, 128));
        hitPointsLabel.setFont(myFont);
        hitPointsLabel.setBounds(450, 180, 160, 30);  // was 100

        hitPointsField = new JTextField();
        hitPointsField.setEditable(false);
        hitPointsField.setBounds(650, 180, 60, 30);

        defenceLabel = new JLabel("Defence");
        defenceLabel.setForeground(new Color(128, 0, 128));
        defenceLabel.setFont(myFont);
        defenceLabel.setBounds(450, 220, 160, 30);  // was 100

        defenceField = new JTextField();
        defenceField.setEditable(false);
        defenceField.setBounds(650, 220, 60, 30);

        agilityLabel = new JLabel("Agility");
        agilityLabel.setForeground(new Color(128, 0, 128));
        agilityLabel.setFont(myFont);
        agilityLabel.setBounds(450, 260, 160, 30);  // was 100

        agilityField = new JTextField();
        agilityField.setEditable(false);
        agilityField.setBounds(650, 260, 60, 30);

        baseAttackLabel = new JLabel("Base Attack");
        baseAttackLabel.setForeground(new Color(128, 0, 128));
        baseAttackLabel.setFont(myFont);
        baseAttackLabel.setBounds(450, 300, 160, 30);  // was 150

        baseAttackField = new JTextField();
        baseAttackField.setEditable(false);
        baseAttackField.setBounds(650, 300, 60, 30);

        weaponStats = new JLabel("Weapon Stats");
        weaponStats.setForeground(new Color(128, 0, 128));
        weaponStats.setFont(myFont);
        weaponStats.setBounds(500, 410, 200, 30);

        attackModLabel = new JLabel("Attack Mod");
        attackModLabel.setForeground(new Color(128, 0, 128));
        attackModLabel.setFont(myFont);
        attackModLabel.setBounds(450, 450, 160, 30);  // was 150

        attackModField = new JTextField();
        attackModField.setEditable(false);
        attackModField.setBounds(650, 450, 60, 30);

        weightLabel = new JLabel("Weight");
        weightLabel.setForeground(new Color(128, 0, 128));
        weightLabel.setFont(myFont);
        weightLabel.setBounds(450, 490, 160, 30);  // was 150

        weightField = new JTextField();
        weightField.setEditable(false);
        weightField.setBounds(650, 490, 60, 30);

        rerollBut = new JButton("Reroll");
        rerollBut.setFont(myFont);
        rerollBut.setBounds(490, 350, 150, 40);

        startBattleBut = new JButton("Start Battle");
        startBattleBut.setFont(myFont);
        startBattleBut.setBounds(490, 540, 200, 40);

        // ── Add all components ────────────────────────────────────────────────
        add(chooseLabel);
        add(enterNameLabel);
        add(enterNameField);
        add(characterTypeLabel);
        add(warriorBut);
        add(wizardBut);
        add(clericBut);
        add(infoCharArea);
        add(selectWeaponLabel);
        add(daggerBut);
        add(swordBut);
        add(hammerBut);
        add(infoWeaponArea);
        add(characterStatsLabel);
        add(hitPointsLabel);
        add(hitPointsField);
        add(defenceLabel);
        add(defenceField);
        add(agilityLabel);
        add(agilityField);
        add(baseAttackLabel);
        add(baseAttackField);
        add(weaponStats);
        add(attackModLabel);
        add(attackModField);
        add(weightLabel);
        add(weightField);
        add(rerollBut);
        add(startBattleBut);
    }
}
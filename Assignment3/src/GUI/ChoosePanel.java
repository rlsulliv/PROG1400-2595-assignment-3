package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static Classes.Sword.getSwordPic;


public class ChoosePanel extends JPanel {
    private JLabel chooseLabel;
    private JLabel enterNameLabel;
    private JTextField enterNameField;
    private JLabel characterTypeLabel;

    private static JRadioButton warriorBut;
    private static JRadioButton wizardBut;
    private static JRadioButton clericBut;

    private JTextArea infoCharArea;

    private JLabel selectWeaponLabel;

    private static JRadioButton daggerBut;
    private static JRadioButton swordBut;
    private static JRadioButton hammerBut;

    private JTextArea infoWeaponArea;

    private JLabel characterStatsLabel;
    private JLabel hitPointsLabel;
    private static JTextField hitPointsField;
    private JLabel defenceLabel;
    private static JTextField defenceField;
    private JLabel agilityLabel;
    private static JTextField agilityField;
    private JLabel baseAttackLabel;
    private static JTextField baseAttackField;

    private JLabel weaponStats;
    private JLabel attackModLabel;
    private static JTextField attackModField;
    private JLabel weightLabel;
    private static JTextField weightField;

    private JButton rerollBut;
    private JButton startBattleBut;

    private JLabel characterImageLabel;
    private JLabel weaponImageLabel;

    public JButton getStartBattleBut() {
        return startBattleBut;
    }
    public JButton getRerollBut() {
        return rerollBut;
    }

    public ChoosePanel() {

        Font myFont = new Font("Calibri", Font.BOLD, 24);

        setLayout(null);
        setBackground(new Color(128, 220, 220));

        chooseLabel = new JLabel("Character Generator");
        chooseLabel.setFont(myFont);
        chooseLabel.setForeground(new Color(128, 0, 128));
        chooseLabel.setBounds(300, 20, 400, 40);

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
        swordBut.setBounds(50, 490, 150, 30);
        swordBut.setBackground(new Color(128, 220, 220));

        hammerBut = new JRadioButton("Hammer");
        hammerBut.setFont(myFont);
        hammerBut.setForeground(new Color(128, 0, 128));
        hammerBut.setBounds(50, 530, 150, 30);
        hammerBut.setBackground(new Color(128, 220, 220));

        ButtonGroup classGroupTwo = new ButtonGroup();
        classGroupTwo.add(daggerBut);
        classGroupTwo.add(swordBut);
        classGroupTwo.add(hammerBut);

        infoWeaponArea = new JTextArea();
        infoWeaponArea.setBounds(50, 570, 350, 180);
        infoWeaponArea.setEditable(false);
        infoWeaponArea.setLineWrap(true);
        infoWeaponArea.setWrapStyleWord(true);
        infoWeaponArea.setForeground(new Color(128, 0, 128));
        infoWeaponArea.setFont(myFont);

        // ===== IMAGE =====
        characterImageLabel = new JLabel();
        characterImageLabel.setBounds(300, 180, 100, 100);
        weaponImageLabel = new JLabel();
        weaponImageLabel.setBounds(300, 450, 100, 100);

        // ===== CHARACTER STATS =====
        characterStatsLabel = new JLabel("Character Stats");
        characterStatsLabel.setForeground(new Color(128, 0, 128));
        characterStatsLabel.setFont(myFont);
        characterStatsLabel.setBounds(650, 150, 250, 30);

        hitPointsLabel = new JLabel("Hit Points");
        hitPointsLabel.setForeground(new Color(128, 0, 128));
        hitPointsLabel.setFont(myFont);
        hitPointsLabel.setBounds(600, 190, 160, 30);

        hitPointsField = new JTextField();
        hitPointsField.setEditable(false);
        hitPointsField.setBounds(800, 190, 80, 30);

        defenceLabel = new JLabel("Defence");
        defenceLabel.setForeground(new Color(128, 0, 128));
        defenceLabel.setFont(myFont);
        defenceLabel.setBounds(600, 230, 160, 30);

        defenceField = new JTextField();
        defenceField.setEditable(false);
        defenceField.setBounds(800, 230, 80, 30);

        agilityLabel = new JLabel("Agility");
        agilityLabel.setForeground(new Color(128, 0, 128));
        agilityLabel.setFont(myFont);
        agilityLabel.setBounds(600, 270, 160, 30);

        agilityField = new JTextField();
        agilityField.setEditable(false);
        agilityField.setBounds(800, 270, 80, 30);

        baseAttackLabel = new JLabel("Base Attack");
        baseAttackLabel.setForeground(new Color(128, 0, 128));
        baseAttackLabel.setFont(myFont);
        baseAttackLabel.setBounds(600, 310, 160, 30);

        baseAttackField = new JTextField();
        baseAttackField.setEditable(false);
        baseAttackField.setBounds(800, 310, 80, 30);

        rerollBut = new JButton("Reroll");
        rerollBut.setFont(myFont);
        rerollBut.setBounds(650, 360, 180, 40);

        // ===== WEAPON STATS =====
        weaponStats = new JLabel("Weapon Stats");
        weaponStats.setForeground(new Color(128, 0, 128));
        weaponStats.setFont(myFont);
        weaponStats.setBounds(600, 540, 250, 30);

        attackModLabel = new JLabel("Attack Mod");
        attackModLabel.setForeground(new Color(128, 0, 128));
        attackModLabel.setFont(myFont);
        attackModLabel.setBounds(600, 580, 160, 30);

        attackModField = new JTextField();
        attackModField.setEditable(false);
        attackModField.setBounds(800, 580, 80, 30);

        weightLabel = new JLabel("Weight");
        weightLabel.setForeground(new Color(128, 0, 128));
        weightLabel.setFont(myFont);
        weightLabel.setBounds(600, 620, 160, 30);

        weightField = new JTextField();
        weightField.setEditable(false);
        weightField.setBounds(800, 620, 80, 30);

        startBattleBut = new JButton("Start Battle");
        startBattleBut.setFont(myFont);
        startBattleBut.setBounds(650, 680, 200, 50);

        // ===== ADD COMPONENTS =====
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
        add(characterImageLabel);
        add(weaponImageLabel);
        add(characterStatsLabel);
        add(hitPointsLabel);
        add(hitPointsField);
        add(defenceLabel);
        add(defenceField);
        add(agilityLabel);
        add(agilityField);
        add(baseAttackLabel);
        add(baseAttackField);
        add(rerollBut);
        add(weaponStats);
        add(attackModLabel);
        add(attackModField);
        add(weightLabel);
        add(weightField);
        add(startBattleBut);

        rollStats();
        rerollBut.addActionListener(e -> rollStats());

        clericBut.addActionListener(e -> {
            infoCharArea.setText(Cleric.getCharacterInformString());
            characterImageLabel.setIcon(scaleImage(getClericPic(), 100, 100));
        });

        warriorBut.addActionListener(e -> {
            infoCharArea.setText(Warrior.getCharacterInformString());
            characterImageLabel.setIcon(scaleImage(getWarriorPic(), 100, 100));
        });

        wizardBut.addActionListener(e -> {
            infoCharArea.setText(Wizard.getCharacterInformString());
            characterImageLabel.setIcon(scaleImage(getWizardPic(), 100, 100));
        });

        swordBut.addActionListener(e -> {
            infoWeaponArea.setText(Sword.getWeaponDescription());
            weaponImageLabel.setIcon(scaleImage(getSwordPic(), 100, 100));
        });

        hammerBut.addActionListener(e -> {
            infoWeaponArea.setText(Hammer.getWeaponDescription());
            weaponImageLabel.setIcon(scaleImage(getHammerPic(), 100, 100));
        });

        daggerBut.addActionListener(e -> {
            infoWeaponArea.setText(Dagger.getWeaponDescription());
            weaponImageLabel.setIcon(scaleImage(getDaggerPic(), 100, 100));
        });
    }

    // [0]=HP, [1]=Defense, [2]=Agility, [3]=BaseAttack, [4]=WeaponAttack, [5]=WeaponWeight
    public static int[] getTextFieldsData() {
        int[] stats = {
                Integer.parseInt(hitPointsField.getText()),
                Integer.parseInt(defenceField.getText()),
                Integer.parseInt(agilityField.getText()),
                Integer.parseInt(baseAttackField.getText()),
                Integer.parseInt(attackModField.getText()),
                Integer.parseInt(weightField.getText())};
        return stats;
    }
    private static ImageIcon scaleImage(ImageIcon icon, int width, int height) {
        Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
public static ImageIcon getWarriorPic() {
    return new ImageIcon(ChoosePanel.class.getResource("/images/fighter.png"));
}
    public static ImageIcon getClericPic() {
        return new ImageIcon(ChoosePanel.class.getResource("/images/dwarf.png"));
    }
    public static ImageIcon getWizardPic() {
        return new ImageIcon(ChoosePanel.class.getResource("/images/wizard.png"));
    }
    public static ImageIcon getDaggerPic() {
        return new ImageIcon(ChoosePanel.class.getResource("/images/dagger.png"));
    }
    public static ImageIcon getHammerPic() {
        return new ImageIcon(ChoosePanel.class.getResource("/images/hammer.png"));
    }
    public static ImageIcon getSwordPic() {
        return new ImageIcon(ChoosePanel.class.getResource("/images/sword.png"));
    }
    public static String getCharacterType() {
        if (warriorBut.isSelected()) return "Warrior";
        else if (wizardBut.isSelected()) return "Wizard";
        else if (clericBut.isSelected()) return "Cleric";
        else return "Unknown";
    }

    public static String getWeaponType(){
        if (daggerBut.isSelected()) return "Dagger";
        else if (swordBut.isSelected()) return "Sword";
        else if (hammerBut.isSelected()) return "Hammer";
        else return "Unknown";
    }

    static Random randomInt = new Random();

    public void rollStats(){
        int hp = 50 + randomInt.nextInt(101);
        int defence = 5 + randomInt.nextInt(31);
        int agility = 5 + randomInt.nextInt(31);
        int baseAtt = 5 + randomInt.nextInt(31);
        int attackMod = randomInt.nextInt(16);
        int weight = 1 + randomInt.nextInt(20);

        hitPointsField.setText(String.valueOf(hp));
        defenceField.setText(String.valueOf(defence));
        agilityField.setText(String.valueOf(agility));
        baseAttackField.setText(String.valueOf(baseAtt));
        attackModField.setText(String.valueOf(attackMod));
        weightField.setText(String.valueOf(weight));
    }
    private static String[] monsterNames = {"Goblin", "Orc", "Dragon", "Skeleton", "Troll"};
    private static String monsterName = monsterNames[randomInt.nextInt(monsterNames.length)];
    private static int[] monsterStats = new int[]{
            30 + randomInt.nextInt(71),
            3 + randomInt.nextInt(21),
            3 + randomInt.nextInt(21),
            3 + randomInt.nextInt(21)
    };

    public static int[] getSelectMonster() {
        return monsterStats;
    }

    public static String getMonsterName() {
        return monsterName;
    }
}

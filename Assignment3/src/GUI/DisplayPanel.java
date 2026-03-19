package GUI;

import Classes.Monster;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private JLabel battleTitleLabel;
    private JLabel playerLabel;
    private JLabel monsterLabel;

    private JLabel playerImage;
    private JLabel monsterImage;

    private JTextArea infoArea;

    private JButton playAgainBut;
    public DisplayPanel() {
        Font myFont = new Font("Calibri", Font.BOLD, 24);

        setLayout(null);
        setBackground(new Color(128, 220, 220));

        battleTitleLabel = new JLabel("Battle To The Death");
        battleTitleLabel.setFont(myFont);
        battleTitleLabel.setForeground(new Color(128, 0, 128));
        battleTitleLabel.setBounds(450, 20, 400, 50);

        playerLabel = new JLabel("Player");
        playerLabel.setFont(myFont);
        playerLabel.setBounds(250, 70, 200, 30);
        playerLabel.setForeground(new Color(128, 0, 128));

        monsterLabel = new JLabel("Monster");
        monsterLabel.setFont(myFont);
        monsterLabel.setBounds(700, 70, 200, 30);
        monsterLabel.setForeground(new Color(128, 0, 128));

        playerImage = new JLabel();
        playerImage.setBounds(220, 100, 200, 200);

        monsterImage = new JLabel();
        monsterImage.setBounds(650, 100, 200, 200);

        infoArea = new JTextArea();
        infoArea.setBounds(100, 300, 800, 360);
        infoArea.setEditable(false);
        infoArea.setFont(myFont);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);

        playAgainBut = new JButton("Play Again");
        playAgainBut.setBounds(400, 690, 200, 50);
        playAgainBut.setFont(myFont);
        playAgainBut.setForeground(new Color(128, 0, 128));

        add(battleTitleLabel);
        add(playerLabel);
        add(monsterLabel);
        add(playerImage);
        add(monsterImage);
        add(infoArea);
        add(playAgainBut);


}
    public void getPlayerAndMonsterInfo() {
        playerLabel.setText(ChoosePanel.getCharacterType());
        monsterLabel.setText(ChoosePanel.getMonsterName());

        if (ChoosePanel.getCharacterType().equalsIgnoreCase("Warrior")) {
            playerImage.setIcon(ChoosePanel.getWarriorPic());
        } else if (ChoosePanel.getCharacterType().equalsIgnoreCase("Cleric")) {
            playerImage.setIcon(ChoosePanel.getClericPic());
        } else if (ChoosePanel.getCharacterType().equalsIgnoreCase("Wizard")) {
            playerImage.setIcon(ChoosePanel.getWizardPic());
        }
        monsterImage.setIcon(Monster.getMonsterPic());

        int[] stats = ChoosePanel.getTextFieldsData();
        int[] monsterStats = ChoosePanel.getSelectMonster();

        infoArea.setText(
                "Player: " + ChoosePanel.getEnterNameField().getText() + "\n" +
                        "-------------------\n" +
                        "Class: " + ChoosePanel.getCharacterType() + "\n" +
                        "HP: " + stats[0] + "\tDefense: " + stats[1] +
                        "\tAgility: " + stats[2] + "\tBase Attack: " + stats[3] + "\n" +
                        "Weapon: " + ChoosePanel.getWeaponType() +
                        "\tWeight: " + stats[5] + "\tAttack Mod: " + stats[4] + "\n\n" +
                        "Monster: " + ChoosePanel.getMonsterName() + "\n" +
                        "-------------------\n" +
                        "HP: " + monsterStats[0] + "\tDefense: " + monsterStats[1] +
                        "\tAgility: " + monsterStats[2] + "\tBase Attack: " + monsterStats[3]
        );
    }
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);

        if (visible) {
            getPlayerAndMonsterInfo();
        }
    }

    public static String getPlayerName() {
        return ChoosePanel.getEnterNameField().getText();
    }

    public JButton getPlayAgainBut() {
        return playAgainBut;
    }

    public void setPlayAgainBut(JButton playAgainBut) {
        this.playAgainBut = playAgainBut;
    }

    public void loadBattleData() {

    }
}

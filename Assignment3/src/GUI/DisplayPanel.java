package GUI;

import Classes.*;

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
        monsterImage.setBounds(710, 100, 200, 200);

        infoArea = new JTextArea();
        infoArea.setBounds(100, 300, 800, 360);
        infoArea.setEditable(false);
        infoArea.setFont(myFont);
        infoArea.setForeground(new Color(128, 0, 128));
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
    public void updateBattleSummary(PlayerCharacter p, Monster m) {
        // resultsTextArea is the JTextArea on your battle summary screen
        infoArea.setText(p.toString());
        infoArea.append("\n\n--- VS ---\n\n");
        infoArea.append(m.toString());

        playerLabel.setText(p.getName());
        monsterLabel.setText(m.getName());

        switch (p) {
            case Warrior warrior -> playerImage.setIcon(Warrior.getWarriorPic());
            case Cleric cleric -> playerImage.setIcon(Cleric.getClericPic());
            case Wizard wizard -> playerImage.setIcon(Wizard.getWizardPic());
            default -> {
            }
        }

        switch(m) {
            case Goblin goblin -> monsterImage.setIcon(Goblin.getGoblinPic());
            case Orc orc -> monsterImage.setIcon(Orc.getOrcPic());
            case Troll troll -> monsterImage.setIcon(Troll.getTrollPic());
            default -> {
            }
        }
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    public JButton getPlayAgainBut() {
        return playAgainBut;
    }

}

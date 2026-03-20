package Classes;

import javax.swing.*;

public class Goblin extends Monster {
    private static ImageIcon goblinPic;

    public Goblin(int hitPoints, int defense, int agility, int baseAttack) {
        super("Sneaky Goblin", hitPoints, defense, agility, baseAttack);
        goblinPic = new ImageIcon(this.getClass().getResource("/images/goblin.jpg"));
    }

    @Override
    public String getMonsterQuote() {
        return "Hand over your gold!";
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                        "\n%s",
                getMonsterQuote());
    }

    public static ImageIcon getGoblinPic() {
        return goblinPic;
    }

}
package Classes;

import javax.swing.*;

public class Troll extends Monster {
    private static ImageIcon trollPic;

    public Troll(int hitPoints, int defense, int agility, int baseAttack) {
        super("Mountain Troll", hitPoints, defense, agility, baseAttack);
        trollPic = new ImageIcon(this.getClass().getResource("/images/troll.jpg"));
    }

    public static ImageIcon getTrollPic() {
        return trollPic;
    }

    @Override
    public String getMonsterQuote() {
        return "TROLL SMASH!";
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                        "\n%s",
                getMonsterQuote());
    }
}
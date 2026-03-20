package Classes;
import javax.swing.*;

public class Orc extends Monster {
    private static ImageIcon orcPic;

    public Orc(int hitPoints, int defense, int agility, int baseAttack) {
        // Monster constructor requires an ImageIcon, so we pass null for now
        super("Orc", hitPoints, defense, agility, baseAttack);
        orcPic = new ImageIcon(this.getClass().getResource("/images/orc.jpg"));
    }

    public static ImageIcon getOrcPic() {
        return orcPic;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                        "\n%s",
                getMonsterQuote());
    }

    @Override
    public String getMonsterQuote() {
        return "Lok-Tar Ogar!";
    }
}
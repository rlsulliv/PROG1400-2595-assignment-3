package Classes;
import javax.swing.*;

public abstract class Monster extends Character {
    private ImageIcon monsterPic;

    public Monster(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name, hitPoints, defense, agility, baseAttack);

    }

    public abstract String getMonsterQuote();

    public ImageIcon getMonsterPic() {
        return monsterPic;
    }

    public void setMonsterPic(ImageIcon monsterPic) {
        this.monsterPic = monsterPic;
    }

    @Override
    public String toString() {
        return String.format("Monster: %s\n------------------\nHP: %d\tDefense: %d\tAgility: %d\tAttack: %d",
                getName(), getHitPoints(), getDefense(), getAgility(), getBaseAttack());
    }
}
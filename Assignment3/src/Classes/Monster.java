package Classes;
import javax.swing.*;

public abstract class Monster extends Character {

    public Monster(String name, int hitPoints, int defense, int agility, int baseAttack) {
        super(name, hitPoints, defense, agility, baseAttack);

    }

    public abstract String getMonsterQuote();


    @Override
    public String toString() {
        return String.format("Monster: %s\n------------------\nHP: %d\tDefense: %d\tAgility: %d\tAttack: %d",
                getName(), getHitPoints(), getDefense(), getAgility(), getBaseAttack());
    }
}
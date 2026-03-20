package Classes;

import GUI.*;
import javax.swing.*;

public class Warrior extends PlayerCharacter {
    private static ImageIcon warriorPic;

    //Constructors
    public Warrior(String name, int hitPoints, int defense, int agility, int baseAttack, Weapon weapon) {
        super(name, hitPoints, defense, agility, baseAttack, weapon);
        warriorPic = new ImageIcon(this.getClass().getResource("/images/fighter.png"));
    }

    public static ImageIcon getWarriorPic() {
        return warriorPic;
    }

    @Override
    public String toString() {
        return String.format("Player: %s\n---------------------" +
                        "\nClass: Warrior" +
                        "\nHP: %d\tDefense: %d\tAgility: %d\tBase Attack: %d" +
                        "\nWeapon: %s",
                this.getName(),
                this.getHitPoints(),
                this.getDefense(),
                this.getAgility(),
                this.getBaseAttack(),
                this.getWeapon().getWeaponStats()); // Gets description from the Weapon object
    }

    public String getCharacterInformString() {
        return "Fighters are often human.Have higher HP and defence but low agility.";
    }
}

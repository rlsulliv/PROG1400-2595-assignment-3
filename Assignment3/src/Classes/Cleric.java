package Classes;

import GUI.*;
import javax.swing.*;

public class Cleric extends PlayerCharacter {
    private static ImageIcon clericPic;

    //Constructor
    public Cleric(String name, int hitPoints, int defense, int agility, int baseAttack, Weapon weapon) {
        super(name, hitPoints, defense, agility, baseAttack, weapon);

        clericPic = new ImageIcon(this.getClass().getResource("/images/dwarf.png"));
    }

    public static ImageIcon getClericPic() {
        return clericPic;
    }

    @Override
    public String toString() {
        // Use the object's own getters instead of ChoosePanel
        return String.format("Player: %s\n" +
                        "\nClass: Cleric" +
                        "\nHP: %d\tDefense: %d\tAgility: %d\tBase Attack: %d" +
                        "\nWeapon: %s",
                getName(),
                getHitPoints(),
                getDefense(),
                getAgility(),
                getBaseAttack(),
                getWeapon().getWeaponStats());
    }

    public String getCharacterInformString() {
        return "Clerics are usually dwarf. Have higher defense but low agility ";
    }

}

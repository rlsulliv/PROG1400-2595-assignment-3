package Classes;

import GUI.*;
import javax.swing.*;

public class Wizard extends PlayerCharacter {
    private static ImageIcon wizardPic;

    //Constructors
    public Wizard(String name, int hitPoints, int defense, int agility, int baseAttack, Weapon weapon) {
        super(name, hitPoints, defense, agility, baseAttack, weapon);

        //Set image for this shape
        wizardPic = new ImageIcon(this.getClass().getResource("/images/wizard.png"));
    }

    public static ImageIcon getWizardPic() {
        return wizardPic;
    }

    @Override
    public String toString() {
        // We use the object's own getters (this.get...) instead of ChoosePanel
        return String.format("Player: %s\n---------------------" +
                        "\nClass: Wizard" +
                        "\nHP: %d\tDefense: %d\tAgility: %d\tBase Attack: %d" +
                        "\nWeapon: %s",
                this.getName(),
                this.getHitPoints(),
                this.getDefense(),
                this.getAgility(),
                this.getBaseAttack(),
                this.getWeapon().getWeaponStats());
    }

    public String getCharacterInformString() {
        return "Wizards are usually elf. Have higher hit points but low defense ";
    }


}

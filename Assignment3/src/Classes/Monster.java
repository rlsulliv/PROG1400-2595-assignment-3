package Classes;

import javax.swing.*;

public class Monster extends Character{

//    Constructor
public Monster(String name, int hitPoints, int defense, int agility, int baseAttack) {
    super(name, hitPoints, defense, agility, baseAttack);
}

    public String getCharacterInformString() {
        return "Monsters are scary!";
    }

}
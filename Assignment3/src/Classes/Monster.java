package Classes;

import javax.swing.*;

public class Monster extends Character{
    private static ImageIcon monsterPic;

    public static ImageIcon getMonsterPic() {
        return monsterPic;
    }

    public Monster(String name, int hitPoints, int defense, int agility, int baseAttack, ImageIcon monsterPic) {
    super(name, hitPoints, defense, agility, baseAttack);

    monsterPic = new ImageIcon(this.getClass().getResource("/images/monster.png"));
}

    public String getCharacterInformString() {
        return "Monsters are scary!";
    }


}
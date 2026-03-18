package Classes;

import javax.swing.*;

public abstract class PlayerCharacter extends Character {
    private Weapon weapon;

    public PlayerCharacter(String name, int hitPoints, int defense, int agility, int baseAttack, Weapon weapon) {
        super(name, hitPoints, defense, agility, baseAttack);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "My name is " + super.getName() + ". My weapon is " + (weapon != null ? weapon.getWeaponInformString() : "none") + ".";
    }
}

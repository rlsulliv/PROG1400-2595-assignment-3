package Classes;

import GUI.*;

public abstract class Character {

    //Declare properties of ANY shape
    private String name;
    private int baseAttack;
    private int defense;
    private int agility;
    private int hitPoints;

    public Character(String name, int hitPoints, int defense, int agility, int baseAttack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;
    }

//    Getters & Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "My name is " + name + ".";
    }
}
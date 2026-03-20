package Classes;

import javax.swing.*;

public class Dagger extends Weapon {
    private static ImageIcon daggerPic;

    //Constructors
    public Dagger(int attack, int weight) {
        super(attack,weight);

        //Set image for this weapon
        daggerPic = new ImageIcon(this.getClass().getResource("/images/dagger.png"));
    }

    public static ImageIcon getDaggerPic() {
        return daggerPic;
    }

    public void setDaggerPic(ImageIcon daggerPic) {
        this.daggerPic = daggerPic;
    }

    @Override
    public String getWeaponInformString() {
        return "A dagger is a light and fast weapon. " +
                "It can maintain fast attack speed, but the increase in additional attack power is not high..";
    }
    @Override
    public String getWeaponStats() {
        return "Dagger " + super.getWeaponStats();
    }
}

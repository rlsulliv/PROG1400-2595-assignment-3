package Classes;

import javax.swing.*;

public class Hammer extends Weapon {
    private static ImageIcon hammerPic;

    //Constructors
    public Hammer(int attack, int weight) {
        super(attack,weight);

        //Set image for this shape
        hammerPic = new ImageIcon(this.getClass().getResource("/images/hammer.png"));
    }

    public static ImageIcon getDaggerPic() {
        return hammerPic;
    }

    public ImageIcon getHammerPic() {
        return hammerPic;
    }

    public void setHammerPic(ImageIcon hammerPic) {
        this.hammerPic = hammerPic;
    }

    @Override
    public String getWeaponInformString() {
        return "The hammer is a weapon with powerful attack power. " +
                "A single attack can create a high hit point. " +
                "However, it is a heavy weapon and has a slow attack speed. ";
    }

    public static String getWeaponDescription() {
        return "The hammer is a weapon with powerful attack power. " +
                "A single attack can create a high hit point. " +
                "However, it is a heavy weapon and has a slow attack speed. ";
    }
}

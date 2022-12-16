/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic13.Zad1;

/**
 *
 * @author simeonyav
 */
public class Trabant extends Car {
    private int slownessLevel;

    public int getSlownessLevel() {
        return slownessLevel;
    }

    public void setSlownessLevel(int slownessLevel) {
        this.slownessLevel = slownessLevel;
    }

    public Trabant(int slownessLevel, float speed, int numberOfWheels, String color) {
        super(speed, numberOfWheels, color);
        this.slownessLevel = slownessLevel;
    }

    public void startTrabant() {
        System.out.println("WHY");
    }
    
    @Override
    public String toString() {
        return String.format(
                "Your trabant has slowness level of %d",
                slownessLevel
        );
    }
}

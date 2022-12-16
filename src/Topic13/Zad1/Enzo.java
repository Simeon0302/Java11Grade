/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic13.Zad1;

/**
 *
 * @author simeonyav
 */
public class Enzo extends Ferrari {
    private boolean isUsed;
    private boolean isCrashed;

    public boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public boolean getIsCrashed() {
        return isCrashed;
    }

    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }
    
    public Enzo(boolean isUsed, boolean isCrashed, String racingStatus, double price, float speed, int numberOfWheels, String color) {
        super(racingStatus, price, speed, numberOfWheels, color);
        this.isUsed = isUsed;
        this.isCrashed = isCrashed;
    }
    
    public void Buy() {
        isUsed = true;
        System.out.println("You just spent 10000000 on car");
    }
    
    public void DriveFast() {
        isCrashed = true;
        System.out.println("Ha ha ha you have just crashed");
    }
    
    @Override
    public String toString() {
        return "This Enzo ferrari is " + (isUsed ? "is used" : "is not used")
                + "This Enzo is " + (isCrashed ? "crashed" : "not crashed");
    }
}

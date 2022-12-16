/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic13.Zad1;

/**
 *
 * @author simeonyav
 */
public class Car {
    private float speed;
    private int numberOfWheels;
    private String color;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if(speed > 0) this.speed = speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if(numberOfWheels > 0) this.numberOfWheels = numberOfWheels;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        if(color != null) this.color = color;
    }
    
    public void removeWheel() {
        if (numberOfWheels - 1 <= 0) {
            numberOfWheels--;
        }
    }
    
    public void upgradeEngine(int percents) {
        this.speed = this.speed + percents * this.speed;
    }
    
    public Car() {
        this.speed = 10;
        this.numberOfWheels = 4;
        this.color = "Green";
    }
    
    public Car(float speed, int numberOfWheels, String color) {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }
}

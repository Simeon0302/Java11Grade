/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic13.Zad1;

import java.util.Random;

/**
 *
 * @author simeonyav
 */
public class Kabrio extends Trabant{
    private boolean areWippersNew;
    private String engineStatus;

    public boolean getAreWippersNew() {
        return areWippersNew;
    }

    public void setAreWippersNew(boolean areWippersNew) {
        this.areWippersNew = areWippersNew;
    }

    public String getEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(String engineStatus) {
        this.engineStatus = engineStatus;
    }

    public Kabrio(boolean areWippersNew, String engineStatus, int slownessLevel, float speed, int numberOfWheels, String color) {
        super(slownessLevel, speed, numberOfWheels, color);
        this.areWippersNew = areWippersNew;
        this.engineStatus = engineStatus;
    }
    
    public void changeWippers() {
        areWippersNew = true;
    }
    
    public void tryToStart() {
        Random rand = new Random();
        int randNum = rand.nextInt(2 - 1 + 1);
        if(randNum == 0) {
            engineStatus = "Everything is fine";
        }
        else if(randNum == 1) {
            engineStatus = "Bad";
        }
    }
    
    @Override
    public String toString() {
        return "The kabrio's wippers " + (areWippersNew ? "are new" : "are not new")
                + "The kabrio's engine status is " + engineStatus;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Topic11;

/**
 *
 * @author simeonyav
 */
public class Clock {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    public int getHour() {
        return this.hour;
    }
    
    public void setHour(int hour) {
        if(hour >= 0 && hour <= 24) {
            this.hour = hour;
        }
    }
    
    public int getMinutes() {
        return this.minute;
    }
    
    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }
    
    public int getSecond() {
        return this.second;
    }
    
    public void setSecond(int second) {
        if(second >= 0 && second <= 59) {
            this.second = second;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%d hour, %d minute and %d second", hour, minute, second);
    }
}

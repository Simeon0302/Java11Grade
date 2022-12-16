/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad5;

/**
 *
 * @author Moni
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0 && day < 30) this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 && month < 13) this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0 && year < 2023) this.year = year;
    }
    
    public Date(){
        setDay(1);
        setMonth(1);
        setYear(2000);
    }
    
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}

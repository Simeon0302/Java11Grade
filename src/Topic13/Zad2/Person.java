/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad2;

/**
 *
 * @author Moni
 */
public class Person {
    private int birthYear;
    private String birthCity;
    private String name;

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Person() {
        setBirthYear(2000);
        setBirthCity("Sofia");
        setName("Default");
    }
    
    public Person(int birthYear, String birthCity, String name) {
        setBirthYear(birthYear);
        setBirthCity(birthCity);
        setName(name);
    }
    
    public void sayHi() {
        System.out.println(name + " says hello");
    }
    
    public int calculateAge() {
        return 2022 - birthYear;
    }
}

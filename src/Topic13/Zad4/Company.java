/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad4;

/**
 *
 * @author Moni
 */
public class Company {
    private String name;
    private String creationDate;
    private String bulstat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        if(creationDate != null) this.creationDate = creationDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if(bulstat.length() == 10) this.bulstat = bulstat;
    }
    
    public Company() {
        setName("Default");
        setCreationDate("01_01_2000");
        setBulstat("123456789S");
    }
    
    public Company(Company company) {
        setName(company.getName());
        setCreationDate(company.getCreationDate());
        setBulstat(company.getBulstat());
    }
}

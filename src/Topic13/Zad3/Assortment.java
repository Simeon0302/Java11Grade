/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad3;

/**
 *
 * @author Moni
 */
public class Assortment {
    private GSM[] gsms = new GSM[1000];
    private int numberOfGSMS = 0;
    
    public GSM findGSMWithLowestPrice(String brand, int creationYear) {
        double minPrice = Double.MAX_VALUE;
        GSM gsmMinPrice = new GSM();
        
        for(int i = 0; i < numberOfGSMS; i++) {
            if(gsms[i].getBrand().equals(brand) && gsms[i].getCreationYear() == creationYear) {
                if(minPrice > gsms[i].getPrice()) {
                    gsmMinPrice = gsms[i];
                    minPrice = gsmMinPrice.getPrice();
                }
            }
        }
        
        return gsmMinPrice;
    }
    
    public void AddGSM(GSM gsm) {
        if(numberOfGSMS <= 999) {
            numberOfGSMS++;
            gsms[numberOfGSMS - 1] = gsm;
        }
    }
    
    public void sortByCreationYear() {
        for(int i = 0; i < numberOfGSMS; i++) {
            for(int j = 0; j < numberOfGSMS - i - 1; j++) {
                if(gsms[j].getPrice() < gsms[j + 1].getPrice()) {
                    var temp = gsms[j];
                    gsms[j] = gsms[j + 1];
                    gsms[j + 1] = temp;
                }
            }
        }
    }
}

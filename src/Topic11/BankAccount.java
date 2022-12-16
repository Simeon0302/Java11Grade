/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic11;

/**
 *
 * @author simeonyav
 */
public class BankAccount {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
}

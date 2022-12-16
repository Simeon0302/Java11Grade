/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Topic11;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);

        bankAccount.setBalance(sc.nextFloat());

        System.out.println("Your balance is " + bankAccount.getBalance());
    }
}

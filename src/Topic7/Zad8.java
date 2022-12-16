/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic7;

import java.util.Random;

/**
 *
 * @author Moni
 */
public class Zad8 {
    public static void main(String[] args) {
        String password = "";
        Random rand = new Random();
        int smallLetterMin = (int)'a';
        int smallLetterMax = (int)'z';
        
        int bigLetterMin = (int)'A';
        int bigLetterMax = (int)'Z';
        
        for(int i = 0; i < 4; i++) {
            //determine uppercase or lowercase letter
            //lowercase
            boolean isUpper = rand.nextBoolean();
            if(!isUpper) {
                password = password.concat(
                        String.valueOf(
                                (char)(rand.nextInt(smallLetterMax - smallLetterMin + 1) + smallLetterMin)
                        )
                );
            }
            //uppercase
            if(isUpper) {
                password = password.concat(
                        String.valueOf(
                                (char)(rand.nextInt(bigLetterMax - bigLetterMin + 1) + bigLetterMin)
                        )
                );
            }
        }
        
        //add symbols
        for(int i = 0; i < 3; i++) {
            password = password.concat(
                    String.valueOf(
                            (char)(rand.nextInt(47 - 33 + 1) + 33)
                    )
            );
        }
        
        //add digits
        for(int i = 0; i < 2; i++) {
            password = password.concat(
                    String.valueOf(
                            rand.nextInt(10)
                    )
            );
        }
        
        for(int i = password.length() - 1; i >= 0; i--) {
            System.out.print(password.charAt(i));
        }
    }
}

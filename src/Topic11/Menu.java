/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Topic11;

/**
 *
 * @author simeonyav
 */
public class Menu {
    private int sum2;

    public void func(int num) {
        int sum = 0, temp = num, factorial = 1, oppositeNum = 0, numOfDigits = 0;
        while(temp > 0) {
            sum += temp % 10;
            numOfDigits++;
            temp = temp / 10;
        }

        temp = num;
        while(temp > 1) {
            factorial *= temp;
            temp--;
        }

        temp = num;
        numOfDigits--;
        while(temp > 0) {
            oppositeNum += temp % 10 * Math.pow(10, numOfDigits);
            numOfDigits--;
            temp /= 10;
        }

        temp = num - 1;
        while(temp > 0) {
            sum2 += temp;
            temp--;
        }

        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The factorial is equal to " + factorial);
        System.out.println("The opposite number is " + oppositeNum);
        System.out.println(num == sum2 ? "The num is perfect" : "The num is not perfect");
    }
}

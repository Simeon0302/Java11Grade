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
public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Scanner sc = new Scanner(System.in);
        
        clock.setHour(sc.nextInt());
        clock.setMinute(sc.nextInt());
        clock.setSecond(sc.nextInt());
        
        System.out.println(clock.toString());
    }
}

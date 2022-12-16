/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises1;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class MovieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movies movie = new Movies(sc.next(), sc.nextFloat(), sc.nextFloat());
        Movies movie2 = new Movies();
        Movies movie3 = new Movies(movie);
        
        System.out.println(movie.toString());
        System.out.println(movie2.toString());
        System.out.println(movie3.toString());
    }
}

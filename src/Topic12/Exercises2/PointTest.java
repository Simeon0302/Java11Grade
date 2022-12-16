/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises2;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class PointTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Point point1 = new Point(new int[] {x, y});
        System.out.println(point1.toString());
        
        int n = sc.nextInt();
        Point[] points = new Point[n];
        
        for(int i = 0; i < n; i++) {
            points[i] = new Point(new int[] {sc.nextInt(), sc.nextInt()});
        }
        
        if(point1.searchPoint(points)) {
            System.out.println("Found point");
        }
        else {
            System.out.println("Cannot find point");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises2;

/**
 *
 * @author simeonyav
 */
public class Point {
    private int[] coordinates = new int[2];

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        if(coordinates.length == 2) this.coordinates = coordinates;
    }
    
    public Point() {
        this.coordinates[0] = 0;
        this.coordinates[1] = 0;
    }
    
    public Point(int[] coordinates) {
        this.coordinates = coordinates.clone();
    }
    
    public Point(Point point) {
        int[] coordinates = point.getCoordinates();
        this.coordinates[0] = coordinates[0];
        this.coordinates[1] = coordinates[1];
    }
    
    public boolean searchPoint(Point[] points) {
        int x = this.coordinates[0];
        int y = this.coordinates[1];
        
        for(int i = 0; i < points.length; i++) {
            int currentX = points[i].getCoordinates()[0];
            int currentY = points[i].getCoordinates()[1];
        
            if(x == currentX && y == currentY) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("(%d %d)", this.coordinates[0], this.coordinates[1]);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Topic11;

/**
 *
 * @author simeonyav
 */
public class Square {
    private int sideSize;

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        if(sideSize > 0) this.sideSize = sideSize;
    }

    public int calculateArea() {
        return sideSize * sideSize;
    }

    public int calculatePerimeter() {
        return sideSize * 4;
    }

    public double calculateDiagonal() {
        return Math.sqrt(2 * sideSize * sideSize);
    }

    public String print() {
        return String.format("The area is %d; The perimeter is %d; The size of the diagonal is %f",
                calculateArea(),
                calculatePerimeter(),
                calculateDiagonal()
        );
    }
}

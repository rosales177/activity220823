/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2_220823;
import clases.Point;
import clases.Triangle;
/**
 *
 * @author Root
 */
public class Actividad2_220823 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle t = new Triangle(new Point(1,1), new Point(7,1), new Point(5,5));
        
        System.out.println(t.isRegular());
        
    }
    
}

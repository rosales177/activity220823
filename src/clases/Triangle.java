/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Objects;

/**
 *
 * @author Root
 */
public class Triangle extends GeometricFigure {

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
   

    @Override
    public double CalculateArea() {
        try{
            Double l1;
            Double l2;
            Double l3;
            Double h;
            
            l1 = point1.getDistance(point2);
            l2 = point2.getDistance(point3);
            l3 = point2.getDistance(point1);
            
            if(isRegular()){
                h = Math.pow(l1,2) + Math.pow(l2, 2);
            }
            
            
            return (double) 0;
        }catch(Exception e){
            return (double)0;
        }
    }

    @Override
    public boolean isRegular() {
        Double l1;
        Double l2;
        Double l3;
        
        l1 = point1.getDistance(point2);
        l2 = point2.getDistance(point3);
        l3 = point2.getDistance(point1);    
        
        if(l1 == l2 && l2 == l3)
        {
            return 
        }
                
    }
            
    
}

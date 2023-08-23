/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Root
*/
public class Point {
    private int x;
    private int y;
    
    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public Double getDistance(){
        return getDistance(this);
    }
    
    public Double getDistance(Point otherPoint){
      try{
        Double d = Math.pow(((double)otherPoint.getX() - (double)this.getX()),2) + Math.pow(((double)otherPoint.getY() - (double)this.getY()),2);
        d = Math.sqrt(d); 
        return d;
      }catch (Exception er){
          return (double) 0;
      }
    }
    

}

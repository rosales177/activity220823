/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Root
 */
public abstract class GeometricFigure {
    
    private String name;
    
    
    public GeometricFigure(){}
    
    public GeometricFigure(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public abstract double CalculateArea();
    
    public abstract boolean isRegular();
}

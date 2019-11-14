/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat4Polimorphism;

/**
 *
 * @author Asus
 */
public class rectangle extends Shape{
    //private member variables
    private int length;
    private int width;
    //constructor
    public rectangle(String color, int length,int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return"Retangle[Length="+length+",width"+width+","+super.toString()+"]";
    }
    @Override
    public double getArea(){
        return length*width;
    }
    
}

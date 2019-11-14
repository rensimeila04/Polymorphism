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
public class testshape {
    public static void main(String[] args) {
        Shape s1 = new rectangle("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is"+s1.getArea());
        
        Shape s2 = new triangle("blue", 4, 5);
        System.out.println(s2);
        System.out.println("Area is"+s2.getArea());
    }
}

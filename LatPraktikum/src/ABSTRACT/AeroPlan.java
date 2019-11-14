/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRACT;

/**
 *
 * @author Asus
 */
public class AeroPlan extends VEHICLE{
    public void walk(){
        System.out.println("Aeroplan is Fliying");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}

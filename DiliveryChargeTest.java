/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaraje-pe23033
 */
public class DiliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();
        double base = 250.0;

        System.out.println("Base Charge: " + calculator.calculateCharge(base));
        System.out.println("With Distance: " + calculator.calculateCharge(base, 10.0));
        System.out.println("With Distance & Weight: " + calculator.calculateCharge(base, 10.0, 5.0));
        System.out.println("With Express: " + calculator.calculateCharge(base, true));

       
    }
}
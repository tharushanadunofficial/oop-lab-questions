/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author amaraje-pe23033
 */
public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("C-1001", "Toyota", 5, 4500.0);
        Vehicle vehicle2 = new Bike("B-2002", "Yamaha", 10, 150.0);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());

        
    }
}
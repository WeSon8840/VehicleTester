/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;
import javax.swing.*;

/**
 *
 * @author glSon8840
 */
public class Vehicletester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0, 15, 5.75, 1.39);
        //Vehicle car2 = new Vehicle();
        String gasPrice = JOptionPane.showInputDialog("What is the price of gas today in $/L?");
        //Show Vehicle Info
        System.out.println(car1);

        //Drive car for 300km
        car1.driveVehicle(300.0);
        System.out.println(car1);

        //Drive car for 225 kms
        car1.driveVehicle(225.0);
        System.out.println(car1);

//        //Try to drive 1000 km - runs out of gas
//        car1.driveVehicle(1000.0);
//        System.out.println(car1);
//
//        //Add 25L of gas
//        car1.addFuel(25.0);
//        System.out.println(car1);
//
//        //Try to add 100 L of gas
//        car1.addFuel(100.0);
//        System.out.println(car1);
        
        //print the vehicle revenue
        System.out.println("Revenue = " + car1.vehicleRevenue());
        
        //print the vehicle cost
        System.out.println("Cost = " + car1.vehicleCost());
        
        //print the profits
        System.out.println("Profit = " + car1.vehicleProfit());
    }
    
}

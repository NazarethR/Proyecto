/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptons;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Main {

    static Scanner scan = new Scanner(System.in);//escaner

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(ingresarEdad());
        } catch (IlegalAgeException ex) {
            System.out.println(ex);
            System.out.println(ingresarPrecio());
            int a, b, c;//Tres variables

            a = scan.nextInt();//lee la variable 
            b = scan.nextInt();
        }
        try {
            System.out.println(ingresarPrecio());
        } catch (InvaliPriceException e) {
            System.out.println(0);
        }

    }

    public static int ingresarEdad() throws IlegalAgeException {
        System.out.println("Ingrese la edad");
        int edad = scan.nextInt();
        if (edad < 18) {
            throw new IlegalAgeException();
        }
        return edad;
    }

    public static double ingresarPrecio() {
        System.out.println("Ingrese la Precio");
        double precio = scan.nextDouble();
        return precio;
    }

}

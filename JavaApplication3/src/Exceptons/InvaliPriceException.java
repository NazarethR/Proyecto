/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptons;

import java.util.InputMismatchException;

/**
 *
 * @author Student
 */
public class InvaliPriceException extends InputMismatchException{
     public InvaliPriceException() {
   super("La edad ilegal ");
    }
}

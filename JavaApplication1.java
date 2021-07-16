/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuál es tu nombre? ");
        String name = scanner.nextLine();
         System.out.print("Cuál es tu apellido? ");
        String apellido = scanner.nextLine();
         System.out.print("Cuál es tu edad? ");
        String edad = scanner.nextLine();
         System.out.print("Cuál es tu hobbie? ");
        String hobbie = scanner.nextLine();
         System.out.print("Cuál es tu editor de codigo preferido? ");
        String editor = scanner.nextLine();
         System.out.print("Cuál es su sistema operativo? ");
        String sistemaOperativo = scanner.nextLine();
        System.out.println("nombre: "+ name + " apellido: "+ apellido + " edad: " + edad + " hobbie: " + hobbie + " editor " + editor + " sistemaOperativo: " + sistemaOperativo); 
    }
    
}


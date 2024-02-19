/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_captura.de.datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_capturaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        System.out.println("introduce tu nombre:");
        Scanner captura = new Scanner(System.in);
        nombre = captura.nextLine();
        System.out.println("introduce tu edad:");
        edad = captura.nextInt();
                System.out.println("tu nombre es:");
System.out.println(nombre);
System.out.println("tu edad es:");
System.out.println(edad);
    }
    
}

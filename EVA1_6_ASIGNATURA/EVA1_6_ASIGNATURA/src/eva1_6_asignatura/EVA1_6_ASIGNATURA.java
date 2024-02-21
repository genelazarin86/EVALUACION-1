/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave,nombre,carrera;
        int creditos,horasTeo,horasPrac;
                boolean tipoMat;
                Scanner captu = new Scanner(System.in);
                System.out.println("itroduce la clave de la asignatura:");
                clave = captu.nextLine();
                System.out.println("itroduce el nombre  de la asignatura:");
                nombre = captu.nextLine();
                System.out.println("itroduce la carrera de la asignatura:");
                carrera = captu.nextLine();
                System.out.println("introduce los creditos de la asignatura:");
                creditos = captu.nextInt();
                System.out.println("introduce las horas teoricas de la asignatura:");
                horasTeo = captu.nextInt();
                System.out.println("introduce las horas practicas de la asignatura:");
                horasPrac = captu.nextInt();
                System.out.println("introduce el tipo de la asignatura:");
                tipoMat = captu.hasNextBoolean();
                
               System.out.println("datos de la asignatura");
               System.out.println(clave);
               System.out.println(nombre);
               System.out.println(carrera);
               System.out.println(creditos);
               System.out.println(horasTeo);
               System.out.println(horasPrac);
               System.out.println(tipoMat);
               
               
                       
    }
    
}

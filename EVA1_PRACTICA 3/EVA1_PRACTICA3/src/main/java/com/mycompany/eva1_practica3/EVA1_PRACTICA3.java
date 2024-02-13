/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_practica3;

/**
 *
 * @author leo
 */
public class EVA1_PRACTICA3 {

    public static void main(String[] args) {
        byte pruebaByte;
        //256 no cabe en la variable
        pruebaByte = -127;
        pruebaByte =  127;
        
        short pruebaShort;
        //pruebaShort = 23769 no cabe
        pruebaShort = 32767;
        System.out.println(pruebaShort);
            pruebaShort++;
            System.out.println(pruebaShort);
        
    }
}

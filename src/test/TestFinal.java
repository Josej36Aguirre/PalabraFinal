/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Domain.Persona;

/**
 *
 * @author INDRA
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
//        miVariable = 5;
//Persona.MI_CONSTANTE = 5;
System.out.println("Mi constante "+Persona.MI_CONSTANTE);

final Persona persona1 = new Persona();
persona1.setNombre("Jose");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Diana");
        System.out.println("persona1 = " + persona1.getNombre());
    }
}

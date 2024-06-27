/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salu.javapoo;

/**
 *
 * @author salu
 */
public class JavaPOO {

    public static void main(String[] args) {
        
       Alumno alu1 = new Alumno();
       Alumno alu2 = new Alumno(5, "Salustiano", "Robles Teran");
       
       System.out.println("La id del alumno 2 es " + alu2.getId());
       System.out.println("El nombre es: " + alu2.getNombre());
       System.out.println("El nombre es: " + alu2.getApellido());
        
       
       alu1.setId(8);
       alu1.setNombre("Vale");
       alu1.setApellido("Burgos");
       
       System.out.println("------------------");
       
       System.out.println("La id del alumno 2 es " + alu1.getId());
       System.out.println("El nombre es: " + alu1.getNombre());
       System.out.println("El nombre es: " + alu1.getApellido());
       
       System.out.println("------------------");
       
       // Modificar datos con el set
       alu2.setId(35);
       System.out.println("La id del alumno 2 es " + alu2.getId());
       System.out.println("El nombre es: " + alu2.getNombre());
       System.out.println("El nombre es: " + alu2.getApellido());
       
       
       
       
       
       
       // Herencia
       System.out.println("----------- Herencia ------------");
       
       Empleado empl = new Empleado ();
       
       empl.getNum_legajo();
       
       
       Consultor consul = new Consultor();
       
       
       
       // Polimorfismo: Permite en un vector guardar distintas clases hijas.-----------------------
       Persona vector[] = new Persona[5];
       
       vector[0] = new Persona();
       vector[1] = new Empleado();
       vector[2] = new Consultor();
       vector[3] = new Jefe();
       
       Persona pers = new Persona();
       Consultor cons = new Consultor();
       
       pers = cons; // puedo hacer de un hijo a su papa
       
       // cons = pers; // No puedo hacer de un papa a su hijo
       
       
       // Encapsulamiento-----------------------
       
       Alumno alu = new Alumno();
       Alumno al2 = new Alumno(15, "Salustiano", "Robles Teran");
       
       System.out.println("Id: " + alu2.getId());
       System.out.println("Nombre: " + alu2.getNombre());
       System.out.println("Apellido: " + alu2.getApellido());
       
       
    }
}

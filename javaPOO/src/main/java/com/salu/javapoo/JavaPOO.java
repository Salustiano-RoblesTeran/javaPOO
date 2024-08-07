/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salu.javapoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
       
       
      // CLASE ABSTRACTA
      
      
      // Pila
        Stack<Integer> pila = new Stack<Integer>();
    
        System.out.println("Pila: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        
        // Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        
        // Recorrido
        for(Integer pilita:pila) {
            System.out.println(pilita);
        }
      
        // mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Esta vacia? " + pila.isEmpty());
        
        pila.pop(); // elimina el ultimo registro que entro
        System.out.println("Esta el 3: " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
        
        //! HASHMAP
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1523, "Suscribite a todoCode");
        mapaEmpleados.put(1524, "Salu");
        mapaEmpleados.put(1525, "Vale");
        mapaEmpleados.put(1526, "Hola a todos");
        
        boolean estaOnoValue = mapaEmpleados.containsValue("Vale");
        boolean estaOnoKey = mapaEmpleados.containsKey(1523);
        
        if (estaOnoValue == true) {
            System.out.println("El valo buscado esta");
        } else {
            System.out.println("El valor buscado no esta");
        }
        
        if (estaOnoKey == true) {
            System.out.println("El valo buscado esta");
        } else {
            System.out.println("El valor buscado no esta");
        }
        
        // Listar todos los valores
        System.out.println(mapaEmpleados.values());
        
        System.out.println(mapaEmpleados.keySet());
        
        // Buscar por nombre
        String nombre = mapaEmpleados.get(1524);
        
        System.out.println(nombre);
        
        //Elimino
        mapaEmpleados.remove(1526);
        
       
    }
}

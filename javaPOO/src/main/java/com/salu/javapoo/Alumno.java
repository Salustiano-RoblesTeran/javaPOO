package com.salu.javapoo;

public class Alumno {
    
    // Creamos el molde
    private int id;
    private String nombre;
    private String apellido;
    
    // Metodos constructures: nos permiten crear objetos

    public Alumno() {
        
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    
    // Metodos
    public void mostrarNombre () {// Metodos que indican procedimiento (no devuelven nada)
       System.out.println("Hola soy una alumno y se decir mi nombre");
    }
    
    public void saberAprodo (double calificacion) {
        if (calificacion >= 6) {
            System.out.println("Aprobe la materia!");
        } else {
            System.out.println("No aprobe");
        }
    }
    
    
    
    
}

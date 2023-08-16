/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    ArrayList <Persona> listaPersona = new ArrayList();
    ServicioPerro servicioPerro;
    
    public ServicioPersona(ServicioPerro servicioPerro) {
        this.servicioPerro = servicioPerro;
    }
    
    public void crearPersona(){
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese el apellido de la persona");
        p1.setApellido(leer.nextLine());
        
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese su documento");
        p1.setDocumento(leer.nextLong());
        leer.nextLine();
        
        p1.setPerro(servicioPerro.adoptar());
        listaPersona.add(p1);
        
    }
    
    public void mostrarPersona(){
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
    }
    
  
    
}

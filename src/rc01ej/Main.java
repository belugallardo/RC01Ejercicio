/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc01ej;

import Servicio.ServicioPerro;
import Servicio.ServicioPersona;


/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
/**
 *
 * @author belugallardo
 */
public class Main {

    public static void main(String[] args) {
      
        ServicioPerro sPerro = new ServicioPerro();
        ServicioPersona sPersona = new ServicioPersona(sPerro);
     
        System.out.println("Damos de alta dos perros");
        for (int i = 0; i < 2; i++) {
            sPerro.crearPerro();
            
        }
        System.out.println("Damos de alta dos personas");
        for (int i = 0; i < 2; i++) {
            sPersona.crearPersona();
        }
        
        sPersona.mostrarPersona();
        
        
        
    }
    
}

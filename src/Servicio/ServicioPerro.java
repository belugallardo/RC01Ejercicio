/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in);
    ArrayList<Perro> listaPerro = new ArrayList();

    public void crearPerro() {
        Perro p1 = new Perro();

        System.out.println("Ingrese el nombre del perro");
        p1.setNombre(leer.nextLine());

        System.out.println("Ingrese la raza del perro");
        p1.setRaza(leer.nextLine());

        System.out.println("Ingrese la edad del perro");
        p1.setEdad(leer.nextInt());
        leer.nextLine();

        System.out.println("Ingrese el tamaño del perro");
        p1.setTamanio(leer.nextLine());

        listaPerro.add(p1);
    }

    public void mostrarPerros() {

        for (Perro perro : listaPerro) {
            System.out.println(perro);
        }
    }

    public Perro adoptar() {
        System.out.println("¿Que perro desea adoptar? Ingrese su nombre");
        mostrarPerros();
        String nombre = leer.nextLine();
        
        
        for (Perro perro : listaPerro) {
            if (perro.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Adopcion exitosa");
                return perro;
            }

        }
        System.out.println("Nombre equivocado, vuelva a ingresar");
        return adoptar(); 
    }
}

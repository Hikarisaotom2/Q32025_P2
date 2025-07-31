/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28072025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase {
    private String seccion;
    private String nombre;
    private ArrayList<Persona> alumnos;

    public Clase(String seccion, String nombres) {
        this.seccion = seccion;
        this.nombre = nombre;
        this.alumnos = new ArrayList();
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Persona> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Clase{" + "seccion=" + seccion + ", nombre=" + nombre + ", alumnos=" + alumnos + '}';
    }
    
}
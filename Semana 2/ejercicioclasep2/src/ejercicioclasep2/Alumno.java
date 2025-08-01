/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclasep2;

/**
 *
 * @author Fernando
 */
public class Alumno {
    private String nombre;
    private int numero;
    private int inasistencias;
    private String carrera;
    
    public  Alumno(){
        
    }
    
    public  Alumno(String nombre, int numero,String carrera){
        this.nombre = nombre;
        this.numero = numero;
        this.carrera = carrera;
        this.inasistencias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias() {
        this.inasistencias += 1;
//        this.inasistencias = inasistencias+1;
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Nombre : "+nombre+"\nCarrera : "+carrera+"\nNumero de Cuenta : "+numero+"\nInasistencias : "+inasistencias;
    }
    
    
    
}

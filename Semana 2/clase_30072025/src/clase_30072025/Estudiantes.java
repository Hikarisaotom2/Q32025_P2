package clase_30072025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class Estudiantes {
    //nombre, numero de cuenta (solo lectura), inasistencias, carrera. 
    private String nombre;
    private int cuenta;
    private  int inasistencias;
    private  String carrera;

    public Estudiantes(String nombre, int cuenta, int inasistencias, String carrera) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.inasistencias = inasistencias;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }


    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return   cuenta + nombre +"( "+ inasistencias+ " inasistencias )" ;
    }
    
    
    
}

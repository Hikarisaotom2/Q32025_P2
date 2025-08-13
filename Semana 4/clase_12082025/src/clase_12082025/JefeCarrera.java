/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_12082025;

/**
 *
 * @author claudiacortes
 */
public class JefeCarrera extends Docente{
    
    private double sueldoBase;
    private double valorClase;

    public JefeCarrera(double sueldoBase, double valorClase, String nombre, String email, String carrera) {
        super(nombre, email, carrera);
        this.sueldoBase = sueldoBase;
        this.valorClase = valorClase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getValorClase() {
        return valorClase;
    }

    public void setValorClase(double valorClase) {
        this.valorClase = valorClase;
    }
    
    
}

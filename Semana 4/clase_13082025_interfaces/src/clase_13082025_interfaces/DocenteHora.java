/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082025_interfaces;

/**
 *
 * @author claudiacortes
 */


public class DocenteHora  extends Docente implements MetodosPolimorficos{
    
    private int cantidadClases;
    private double valorPorClase;

    public DocenteHora(int cantidadClases, double valorPorClase, String nombre, String email, String carrera) {
        super(nombre, email, carrera);
        this.cantidadClases = cantidadClases;
        this.valorPorClase = valorPorClase;
    }

    public DocenteHora(String nombre, String email, String carrera) {
        super(nombre, email, carrera);
    }
    
    
    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    public double getValorPorClase() {
        return valorPorClase;
    }

    public void setValorPorClase(double valorPorClase) {
        this.valorPorClase = valorPorClase;
    }

    
    @Override 
    public void generarBoletapago1(){
        
    }
    

    @Override
    public String toString() {
        return "DocenteHora{" + "cantidadClases=" + cantidadClases + ", valorPorClase=" + valorPorClase + '}';
    }
    
    
    
}

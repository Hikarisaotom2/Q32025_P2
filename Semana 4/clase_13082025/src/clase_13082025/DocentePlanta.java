/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082025;

/**
 *
 * @author claudiacortes
 */
public class DocentePlanta extends Docente{
    private double sueldoBase;

    public DocentePlanta(double sueldoBase, String nombre, String email, String carrera) {
        super(nombre, email, carrera);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    @Override 
     public  void generarBoletaPago(){
     
     }
    
}

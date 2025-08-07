/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04082025;

/**
 *
 * @author claudiacortes
 */
public class Mujer extends Paciente{
      
    String fechaUltPeriodoMenstrual;
    boolean embarazo;

    public Mujer(String fechaUltPeriodoMenstrual, boolean embarazo, int edad, String tipoSangre, double peso, double altura, String infoPadres, String enfermedades, String alergias, String prodMedicos, String nombre, int id, String comidaFav) {
        super(edad, tipoSangre, peso, altura, infoPadres, enfermedades, alergias, prodMedicos, nombre, id, comidaFav);
        this.fechaUltPeriodoMenstrual = fechaUltPeriodoMenstrual;
        this.embarazo = embarazo;
                /*NO ESTAMOS LLAMANDO AL CONSTRUCTOR DEL PADRE*/
        
//        super -> referencia al padre 
//        this -> referencia a esta clase 
    }

    public String getFechaUltPeriodoMenstrual() {
        return fechaUltPeriodoMenstrual;
    }

    public void setFechaUltPeriodoMenstrual(String fechaUltPeriodoMenstrual) {
        this.fechaUltPeriodoMenstrual = fechaUltPeriodoMenstrual;
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }

    @Override
    public String toString() {
       return "Mujer: "+ super.nombre +" - "+super.tipoSangre+" "+super.edad;
    }
    
    

   
}

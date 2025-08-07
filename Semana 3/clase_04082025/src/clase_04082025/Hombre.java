/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04082025;

/**
 *
 * @author claudiacortes
 */
public class Hombre extends Paciente{
    String fechaUltRevisionUrologo;

    public Hombre(String fechaUltRevisionUrologo, int edad, String tipoSangre, double peso, double altura, String infoPadres, String enfermedades, String alergias, String prodMedicos, String nombre, int id, String comidaFav) {
        super(edad, tipoSangre, peso, altura, infoPadres, enfermedades, alergias, prodMedicos, nombre, id, comidaFav);
        this.fechaUltRevisionUrologo = fechaUltRevisionUrologo;
    }

    public String getFechaUltRevisionUrologo() {
        return fechaUltRevisionUrologo;
    }

    public void setFechaUltRevisionUrologo(String fechaUltRevisionUrologo) {
        this.fechaUltRevisionUrologo = fechaUltRevisionUrologo;
    }

    @Override
    public String toString() {
        return "Hombre: "+ super.nombre +" - "+super.tipoSangre+" "+super.edad;
    }
    
    
    
    
    
    
}

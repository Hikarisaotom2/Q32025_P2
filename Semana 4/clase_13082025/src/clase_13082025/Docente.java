/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_13082025;

/**
 *
 * @author claudiacortes
 */

/*
 Clase abstracta 
 1 las clases abstractas NO SE PUEDEN INSTANCIAR. 
normalmente el metodo abstracto es el metodo que queremos sobreescribir, los metodos abstractos solamente existen en las clases abstractas 
*/
public abstract class Docente {
    
    protected String nombre;
    protected String email;
    protected String carrera;

    public Docente(String nombre, String email, String carrera) {
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public abstract void generarBoletaPago();
    
}

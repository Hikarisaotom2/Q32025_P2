/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_28072025;

/**
 *
 * @author claudiacortes
 */
public class Persona {
    
     private String nombre; 
     private String carerra; 
     
        
    /*
    reglas 
    snake_case : edad_juan
    camelCase: edadJuan
    PascalCase: EdadJuan
    kebab-case : edad-juan (en java no se puede)
    */
    
    //1)  variables 
    //2) constructores / getters/setters 
    
 
    
    // 1) atributos
    // 2) Metodos 
        // 1) constructor 
        // 2) mutadores: -> getters y setters 
        // controles de acceso -> valores solo lectura / valores de solo escritura 
     
     

    public Persona(String nombre, String carerra) {
        this.nombre = nombre;
        this.carerra = carerra;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
        this.carerra = "Sistemas";
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarerra() {
        return carerra;
    }

    public void setCarerra(String carerra) {
        this.carerra = carerra;
    }
    
    
    public void imprimir (int x, String valor){ // gemelo 
        
    }
    
    public void imprimir(String valor, int suma){ // gemelo 2
        
    }
 
    
}

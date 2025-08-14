/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_12082025;

/**
 *
 * @author claudiacortes
 */
public class Clase_12082025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Polimorfismo 
        Se refiere a la capacidad de una clase de adaptarse a diferentes comportamientos. 
        
        Padre : 
        generica que incluye los comportamientos en comun del tipo de dato 
        
        animal 
         nombre
        nombreCi
        peso 
        color de pelaje 
        * comen () 
        * reproducen 
        * duermen 
        * sonido
        
        
        1) Sobre escritura simple  (trabaja con herencia): 
           * es el mas simple y el menos restrictivo de los tpos de polimorfismo 
            * se configura en la clase hija 
            * tiene que cumplir con la definicion del metodo del padre
            * cada hijo tiene la libertad de implementar o no implementar el metodo polimorfico 
        
        2) Con clases abstractas (trabaja con herencia)
        3) Con interfaces (NO trabaja con herencia)
        
        
        DOCENTES. 
        
        Para todos los docentes se conoce su nombre, su email, su carrera, para todos se debe poder generar una boleta de pago.
        
        
        
        -> Docente hora catedra:
            - dueldo: valor de clase * cantidad de clases 
            - deducciones:  RAP, IHSS : 
            -> boleta de pago muestra la cantidad de clases, el valor por clase y las ducciones + sueldo neto 
        -> Docente planta: 
            -> Sueldo: sueldo base 
            -  RAP, IHSS, IMP (15%)
        -> boleta de pago muestra el sueldo base  y las ducciones + sueldo neto 
        -> Jefes de carrera 
            -> Sueldo: sueldo base +  valor de clase
             - RAP, IHSS, IMP  (15%)
        -> boleta de pago muestra la cantidad de clases, el valor por clase y las ducciones + sueldo neto 
        
        */
        
        Docente d = new DocenteHora(2, 8000, "claudia", "ing sistemas", "clau_cortes@unitec.edu");
        Docente planta = new DocentePlanta(30000, "claudia", "ing sistemas", "clau_cortes@unitec.edu");
        
        d.generarBoletaPago();
        planta.generarBoletaPago();

    }

    
    
}

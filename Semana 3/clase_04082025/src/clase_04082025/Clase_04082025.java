
package clase_04082025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_04082025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        Herencia: 
        Una clase, adquiere caracteristicas de otra cuando se estblece un relación de herencia.
        
        Parent/ Padre: una clase que contiene la información que queremos compartir. 
        
        Child/Hijo: es la clase que recibe los beneficios.
        
        -> Padre es la representación mas general de un tipo de dato. 
        -> Los hijos son los sub tipos o del tipo de dato 
        
                   Humano (Padre)
        Hombre (Hijos)   Mujer (Hijo)
        
        
        edad 
        tipo de sangre
        edad
        peso
        altura
        info padres 
        enfermedades
        alergias 
        prod medicos 
        nombre 
        id 
        sexo biologico 
        
        
        fecha de ultimo periodo menstrual
        
        
        fecha de ultima reviison uro
        
        
        ejemplo1: 
        Crear una clase con los atributos de todos. diferentes atributos dependienod de si es hombre o mejor.
         -> Claro 
         -> Memoria 
        
        
        
        
        ejemplo 2: 
        una clase de hombre y una para mujer 
        
        hombre: 
       
        comida

        fecha de ultima reviison uro
        
        mujer: 
        Edad 
        sangre_tipo
        edad
        peso
        altura
        info padres 
        enfermedades
        alergias 
        prod medicos 
        nombre 
        id 
        sexo biologico 
        comida
        
        
        fecha de ultimo periodo menstrual
        
        -> Escalabilidad.
        
        ejemplo 3:
                Paciente 
        edad 
        tipo de sangre
        edad
        peso
        altura
        info padres 
        enfermedades
        alergias 
        prod medicos 
        nombre 
        id 
        comida 
        
        
        
        Hombre                                     Mujer 

        fecha de ultima reviison uro .             fecha de ultimo periodo menstrual
        
        
        REGLAS:
        -> Herencia simple (para java) , otros lenguajes como C++ (herencia multiple) 
        -> El padre NO SABE quienes son sus hijos. 
        -> Los que saben quien es el padre, son los hijos ( la herencia se va a configurar en el hijo)
        -> Herencia va en una en una sola via ( que el hijo toma del padre, el padre jamas toma del hijo)
        -> Una variable del tipo padre puede contener un objeto del tipo del padre y de sus hijos
        ->CRUD PACIENTES 
        
        */
        
        
        Paciente p = new Paciente(16, "0+", 20, 20, "","","","Juan","",123,"");
        Paciente m = new Mujer("julio",false,16, "0+", 20, 20, "","","","Juan","",123,"");
        Paciente h = new Hombre("",16, "0+", 20, 20, "","","","Juan","",123,"");
        
        ArrayList<Paciente> hola = new ArrayList<Paciente>();
        

    }
    
}

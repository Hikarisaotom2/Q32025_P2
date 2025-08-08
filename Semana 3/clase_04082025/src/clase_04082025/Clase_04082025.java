
package clase_04082025;

import java.util.ArrayList;
import java.util.Scanner;

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
        -> Los obejtos del tipo hijo puede considerarse del tipo del padre y su propio tipo
        ->CRUD PACIENTES 
        
        */ 
// .        Persona 
//         Paciente 
//        Hombre . Mujer  Los hijos se consieran del mismo tipo de dato del padre. 

                
        Paciente p = new Paciente(16, "0+", 20, 20, "","","","Juan","",123,""); //objeto del tipo paciente 
        Paciente mujerPaciente = new Mujer("julio",false,16, "0+", 20, 20, "","","","Claudia","",123,""); //objeto del tipo mujer / objeto del tipo persona 
        
        Mujer m = new Mujer("julio",false,16, "0+", 20, 20, "","","","Genesis","",123,""); //objeto del tipo mujer / objeto del tipo persona 
        Hombre h = new Hombre("",16, "0+", 20, 20, "","","","Marlon","",123,""); // objeto del tipo hombre / objeto del tipo persona 
       
        
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes.add(p);
        pacientes.add(h);
        pacientes.add(m);
        pacientes.add(mujerPaciente);
        
        listarPacientes(pacientes);
        
       
       // Object 
       
//       ArrayList<Object> elementos =  new ArrayList<Object>();
//       elementos.add(h);
//       elementos.add(p);
//       elementos.add("");
//       elementos.add(17);
//       elementos.add(true);
       
        /*
        
        CRUD 
        
        */
        
        while (true) {
            int pos = seleccionarPaciente(pacientes);
            modificarPaciente(pacientes.get(pos));
            
//             modificarPaciente(pacientes.get(seleccionarPaciente(pacientes)));
        }
        
        

    }

    public static int seleccionarPaciente(ArrayList<Paciente> pacientes) {
        int pos = -1;
        while (pos < 0 || pos >= pacientes.size()) {
            System.out.println("Ingrese el paciente que desea modificar");
            listarPacientes(pacientes);
            Scanner entrada = new Scanner(System.in);
            pos = entrada.nextInt();
        }

        return pos;
    }
    
    
    public static void modificarPaciente(Paciente paciente){
        //Nota: cada objeto sabe con que tipo de dato se instancio
        
        // Casteo / Casting : Conversión explicita de datos 
        // Concatenacion -> "Hola mundo"+ 5 = Hola Mundo 5 
        // Parseo  -> "Hola, mundo" -> ["Hola", "Mundo"], toma información la formatea y la analiza 
        
       // Paciente = new Hombre()
        if(paciente instanceof Hombre ){
            // aqui nosostros sabemos que lo que hay en la variable paciente es un objeto del tipo hombre....
            // modificar al hombre;
            System.out.println("Es un hombre");
            // (Tipo de Dato al que van a convertir) Variable 
            // Paciente al tipo Hombre
            Hombre personaEditar =(Hombre)paciente;

           int op = 1;
           /*
           
           crear sub menu para editar atributos del hombre....*/
           if(op ==1){ // editar la edad 
                personaEditar.setEdad(0);
           }else{ // tipo de sangre
                personaEditar.setTipoSangre("AB+");
           }

        }else if(paciente instanceof Mujer){
            //modificar a la mujer 
            System.out.println("Es una mujer!");
            ((Mujer) paciente).setEmbarazo(false);
        }else{
            // modiifcar un objeto paciente
            System.out.println("Es un paciente");
        }
       
       
       
        
    }
    
    public  static void listarPacientes(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(i+" "+pacientes.get(i));
        }
    }
    
}

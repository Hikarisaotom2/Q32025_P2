/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_30072025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_30072025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        /*
        
        CRUD.
        
        1. Crear 
            1.1. Crear Clases 
            1.2. Crear estudiantes 
        2. Actualizar 
          2.1 Actualizar clases
          2.2 Actualizar estudiantes
        3. Ver informacion 
          3.1 clases -> 
            -> nombre - sección 
             1 cuenta nombre ( x inasistencas)
          3.2 almnos 
              cuenta nombre ( x inasistencas)
        4) eliminar 
            4.1. eliminar Clases 
            4.2. eliminar estudiantes 
        ( si eliminamos a un estduainte, debe desaparecer de la lista de alumnos)
        5) Matricular : matricular un estudiante en una clase si todavia hay espacios disponibles 
        6) Asistencia: tomar asistencia para todos los alumnos en una clase . 
        
        Clase: 
        nombre, sección, lis de alumnos , cantidad maxima de estudiantes 
        Alumnos: 
        nombre, numero de cuenta (solo lectura), inasistencias, carrera. 
        
        */
        ArrayList<Estudiantes> alumnos = new ArrayList<Estudiantes>();
        ArrayList<Clase> clases = new ArrayList<Clase>();
        
        
        boolean continuar= true;
        do {
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese su opción: ");
            int resp = entrada.nextInt();
            switch (resp) {
                case 1 ->{
                    System.out.println("1) crear clases");
                    System.out.println("2) crear alumnos");
                }
                case 2->{
                    /*
                    ingrese la pos de a clase en la que quiere matricular 
                    0 programio 1
                    1 programcion 2..
                     -> 0 
                    
                    inrese la pos del alumno que quiere matricular en a clase 
                    0 andi 
                    1 juan  
                    2 elvis  
                    -> 2 
                    
                    
                    CASO 1: clase.matricular(alumnos.get(2));  // APROVECHANDO LAS VARIABLES POR REFERENCIA 
                                    
                    ________________________________________________
                    
                      ingrese la pos de a clase en la que quiere matricular 
                    0 programio 1
                    1 programcion 2..
                     -> 0 
                    
                    inrese la pos del alumno que quiere matricular en a clase 
                    0 andi 
                    1 juan 
                    2 elvis 
                    -> 2
                    
                    CASO 2: clase.matricular(new Estudiantes(alumnos.get(2).getNombre.......));
                    
                    ________________RESULTADOS?  ________________
                    -> Actualizar 
                     inrese la pos del alumno que quiere actualizar 
                    0 andi 
                    1 juan 
                    2 elvis 
                    -> 2 
                    alumnos.get(2).setNombre("PEDRO PABLO");
                    
                    
                    -> ver informacion 
                       -> ver informacion de las clases 
                     0 programio 1
                    1 programcion 2..
                     -> 0 
                    
                    
                    
                    
                    */
                    
                }
                    
                default->{
                    continuar= false;
                }   
            }
        } while (continuar);
    }
    
}

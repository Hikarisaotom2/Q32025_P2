/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclasep2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class Ejercicioclasep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Alumno> global = new ArrayList();
        ArrayList<Clase> clases = new ArrayList();
        
        int resp = 0;
        
        do {
            System.out.println("----Registro----");
            System.out.println("");
            System.out.println("1) Crear\n2) Actualizar\n3) Ver informacion\n4) Eliminar\n5) Matricular\n6) Asistencia\n7) Salir");
            System.out.print("Opcion : ");
            resp = entrada.nextInt();
            switch(resp){
                case 1:
                    System.out.println("---Crear----");
                    System.out.println("");
                    int resp1 = 0;
                    do {
                        System.out.println("1) Crear Estudiante\n2) Crear Clase");
                        System.out.print("Opcion : ");
                        resp1 = entrada.nextInt();
                        switch(resp1){
                            case 1:
                                System.out.println("----Creacion de Estudiante----");
//                                Alumno alumno = new Alumno();
//                                System.out.println("");
//                                System.out.print("Ingrese el nombre del estudiante : ");
//                                entrada.nextLine();
//                                String nombreAlumno = entrada.nextLine();
//                                int numerodecuenta = r.nextInt(500)+1;
//                                int inasistencias = 0;
//                                System.out.print("Ingrese la carrera del estudiante : ");
//                                entrada.next();
//                                String carrera = entrada.nextLine();
//                                alumno.setCarrera(carrera);
//                                alumno.setInasistencias(inasistencias);
//                                alumno.setNombre(nombreAlumno);
//                                alumno.setNumero(numerodecuenta);
                                System.out.println("");
                                System.out.print("Ingrese el nombre del estudiante : ");
                                entrada.nextLine();
                                String nombreAlumno = entrada.nextLine();
                                int numerodecuenta = r.nextInt(500)+1;
                                System.out.print("Ingrese la carrera del estudiante : ");
                                entrada.next();
                                String carrera = entrada.nextLine();
                                Alumno alumno = new Alumno(nombreAlumno,numerodecuenta,carrera);
                                global.add(alumno);
                                System.out.println("El alumno se ha adicionado con exito!!!!");
                                break;
                            case 2:
                                System.out.println("----Creacion de Clase----");
                                Clase clase = new Clase();
                                System.out.println("");
                                System.out.print("Ingrese el nombre de la clase : ");
                                entrada.nextLine();
                                String nombrecarrera = entrada.nextLine();
                                int seccion = r.nextInt(100)+1;
                                System.out.print("Ingrese la cantidad maxima de alumnos que tendra la seccion : ");
                                int cantmax = entrada.nextInt();
                                clase.setCantidadMaxima(cantmax);
                                clase.setNombre(nombrecarrera);
                                clase.setSeccion(seccion);
                                clases.add(clase);
                                System.out.println("Clase creada con exito!!!");
                                break;
                            default:
                                System.out.println("Opcion no valida, intente nuevamente");
                                break;
                        }
                    } while (resp1!=1&&resp1!=2);
                    break;
                case 2:
                    System.out.println("----Actualizar----");
                    System.out.println("");
                    int resp3 = 0;
                    do {
                        System.out.println("1) Actualizar clases\n2) Actualizar alumnos");
                        System.out.print("Opcion : ");
                        resp3 = entrada.nextInt();
                        switch(resp3){
                            case 1:
                                System.out.println("----Actualizacion de Clases----");
                                System.out.println("");
                                System.out.println("Seleccione la clase la cual desea modificar : ");
                                System.out.println("");

                                System.out.println("Clase : ");
                                int numerodeclase = entrada.nextInt()-1;
                                System.out.println("");
                                System.out.println("Clase elegida : ");
                                System.out.println(clases.get(numerodeclase));
                                int opc2 = 0;
                                System.out.println("");
                                do {
                                    System.out.println("Eliga el dato de la clase que desee cambiar : ");
                                    System.out.println("1) Nombre\n2) Cantidad maxima de alumnos");
                                    System.out.print("Opcion : ");
                                    opc2 = entrada.nextInt();
                                    switch(opc2){
                                        case 1:
                                            System.out.println("Ingrese el nombre de la clase : ");
                                            entrada.next();
                                            String newname = entrada.nextLine();
                                            clases.get(numerodeclase).setNombre(newname);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la cantidad maxima de alumnos : ");
                                            int nuevacantidad = entrada.nextInt();
                                            clases.get(numerodeclase).setCantidadMaxima(nuevacantidad);
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, intente nuevamente");
                                            System.out.println("");
                                            break;
                                    }
                                    
                                } while (opc2!=1&&opc2!=2);
                                System.out.println("Actualizacion de la clase realizada con exito!!!");
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("----Actualizacion de Alumnos----");
                                System.out.println("");
                                System.out.println("Eliga el alunno del cual desea actualizar la infromacion : ");
                                System.out.println("");
                                 imprimirClases(clases);
                                System.out.println("");
                                System.out.println("Alumno : ");
                                int numerodealumno = entrada.nextInt()-1;
                                System.out.println("");
                                System.out.println("Alumno elegido : ");
                                System.out.println(global.get(numerodealumno));
                                int opc = 0;
                                System.out.println("");
                                do {
                                    System.out.println("Eliga el apartado que usted desea actualizar : ");
                                    System.out.println("1) Nombre\n2) Carrera\n3) Inasistencias");
                                    System.out.print("Opcion : ");
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.print("Ingrese el nombre del estudiante : ");
                                            entrada.nextLine();
                                            String nuevonombre = entrada.nextLine();
                                            global.get(numerodealumno).setNombre(nuevonombre);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la carrera del estudiante : ");
                                            entrada.next();
                                            String nuevacarrera = entrada.nextLine();
                                            global.get(numerodealumno).setCarrera(nuevacarrera);
                                            break;
                                        case 3:
                                            System.out.println("A cuantas inasistencias desea cambiar la cantidad :");
                                            System.out.print("Cantidad : ");
                                            int cantidad = entrada.nextInt();
                                            global.get(numerodealumno).setInasistencias();
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, intente nuevamente");
                                            break;
                                            
                                    }
                                } while (opc!=1&&opc!=2&&opc!=3);
                                System.out.println("");
                                System.out.println("Actualizacion realizadad con exito!!!");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Opcion no valida, intente nuevamente");
                                break;
                        }
                    } while (resp3!=1&&resp3!=2);
                    break;
                case 3:
                    System.out.println("----Ver Informacion----");
                    System.out.println("");
                    int resp2=0;
                    do {
                        System.out.println("1) Clases\n2) Alumnos");
                        System.out.print("Opcion : ");
                        resp2=entrada.nextInt();
                        switch(resp2){
                            case 1:
                                System.out.println("----Informacion de clases----");
                                for (int i = 0; i < clases.size(); i++) {
                                    System.out.println("-> "+clases.get(i).getNombre()+" - "+clases.get(i).getSeccion());
                                    if (clases.get(i).getLista()==null) {
                                        System.out.println("Esta clase aun no tiene estudiantes matriculados");
                                    }else{
                                        imprimirClases(clases);
                                        System.out.println("");
                                        System.out.println("");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("----Informacion de Alumnos----");
                                for (int i = 0; i < global.size(); i++) {
                                    System.out.println((i+1)+". "+global.get(i).getNumero()+" "+global.get(i).getNombre()
                                            +" ( "+ global.get(i).getInasistencias()+" Inasistencias )");
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida, intente nuevamente");
                                break;
                        }
                        
                    } while (resp2!=1&&resp2!=2);
                    break;
                case 4:
                    System.out.println("----Eliminar----");
                    System.out.println("");
                    int resp4 = 0;
                    do {
                        System.out.println("Que es lo que desea eliminar :");
                        System.out.println("1) Remover clase\n2) Remover estudiante");
                        System.out.print("Opcion : ");
                        resp4=entrada.nextInt();
                        switch(resp4){
                            case 1:
                                System.out.println("Seleccione la clase que desea remover : ");
                                System.out.println("");
                                imprimirClases(clases);
                                System.out.println("Clase a remover : ");
                                int claseeliminada = entrada.nextInt()-1;
                                System.out.println("La clase seleccionada para ser removida es : ");
                                System.out.println(clases.get(claseeliminada));
                                clases.remove(claseeliminada);
                                System.out.println("Clase removida con exito!!!");
                                break;
                            case 2:
                                System.out.println("Seleccione el estudiante el cual desea remover : ");
                                System.out.println("");
                                for (int i = 0; i < global.size(); i++) {
                                    System.out.println((i+1)+". "+global.get(i).getNumero()+" - "+global.get(i).getNombre()+" ( "
                                    +global.get(i).getCarrera()+" )");
                                    System.out.println("");
                                }
                                System.out.println("Alumno a remover : ");
                                int alumnoeliminado = entrada.nextInt()-1;
                                System.out.println("El alumno a remover es : ");
                                System.out.println(global.get(alumnoeliminado));
                                global.remove(alumnoeliminado);
                                System.out.println("Alumno removido con exito!!!");
                                break;
                            default:
                                System.out.println("Opcion no valida, intente nuevamente");
                                break;
                        }
                    } while (resp4!=1&&resp4!=2);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("----Matricular----");
                    System.out.println("");
                    if (clases==null||global==null || clases.isEmpty() || global.isEmpty()) {
                        System.out.println("Se requiere de almenos un estudiante y una clase para poder utilizar esta opcion."
                                + "(Revise esto en el apartado de Ver Informacion)");
                    }else{
                        System.out.println("Eliga el estudiante el cual usted desea matricular en alguna clase");
                        System.out.println("");
                        for (int i = 0; i < global.size(); i++) {
                            System.out.println((i+1)+". "+global.get(i).getNumero()+" - "+global.get(i).getNombre());
                            System.out.println("");
                        }
                        System.out.println("Estudiante : ");
                        int estudianteseleccionado = entrada.nextInt()-1;
                        System.out.println("");
                        System.out.println("El estudiante seleccionado para matricula es : ");
                        System.out.println(global.get(estudianteseleccionado));
                        System.out.println("A continuacion tiene que elegir la clase en la que desee matricular al"
                                + " estudiante :");
                        System.out.println("");
                        imprimirClases(clases);
                        System.out.println("Clase : ");
                        int claseseleccionada = entrada.nextInt()-1;
                        System.out.println("La clase seleccionada es : ");
                        System.out.println(clases.get(claseseleccionada));
                        System.out.println("");
                        
                        Alumno seleccionado = global.get(estudianteseleccionado);
                        Clase claseSeleccionada = clases.get(claseseleccionada);
                        claseSeleccionada.AgregarEstudiante(seleccionado);
                        
//                        clases.get(claseseleccionada).AgregarEstudiante(global.get(estudianteseleccionado));
                        System.out.println("Alumno matriculado con exito!!!!");
                    }
                    break;
                case 6:
                    System.out.println("----Asistencia----");
                    System.out.println("A continuacion tiene que elegir la clase en la que tomar asistencia:");
                     System.out.println("");
                    imprimirClases(clases);
                    int claseseleccionada = entrada.nextInt()-1;
                    
                    Clase claseAsistencia = clases.get(claseseleccionada);
                    ArrayList<Alumno> alumnosEnClase = claseAsistencia.getLista();
                    for (int i = 0; i < alumnosEnClase.size(); i++) {
                        System.out.println(alumnosEnClase.get(i));
                        System.out.println("El alumno esta presente? 1. Si, 2. No");
                        int presente = entrada.nextInt();
                        if(presente==2){
                            alumnosEnClase.get(i).setInasistencias();
                        }
                        
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del menu....");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
                    
            }
            
        } while (resp!=7);
    }
    
    
    public static void imprimirClases(ArrayList<Clase> clases){
                                        for (int i = 0; i < clases.size(); i++) {
                                    System.out.println((i+1)+". "+clases.get(i).getSeccion()+" - "+clases.get(i).getNombre()+" ("+
                                            clases.get(i).getCantidadMaxima()+" maximo ) ");
                                    System.out.println("");
                                }
    }
    
}

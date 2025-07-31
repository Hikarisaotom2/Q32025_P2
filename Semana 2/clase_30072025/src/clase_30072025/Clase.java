package clase_30072025;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class Clase {
//    nombre, sección, lis de alumnos , cantidad maxima de estudiantes 
    private ArrayList<Estudiantes> alumnos;
    private String nombre;
    private String seccion;
    private int cantidadMaximaAlumnos;

    public Clase(String nombre, String seccion, int cantidadMaximaAlumnos) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
        this.alumnos = new ArrayList();
    }

    public ArrayList<Estudiantes> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Estudiantes> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCantidadMaximaAlumnos() {
        return cantidadMaximaAlumnos;
    }

    public void setCantidadMaximaAlumnos(int cantidadMaximaAlumnos) {
        this.cantidadMaximaAlumnos = cantidadMaximaAlumnos;
    }
    
    
    //matricular 
    //matricular un estudiante en una clase si todavia hay espacios disponibles 
    public void matricular(Estudiantes nuevoAlumno){
        if(alumnos.size()<this.cantidadMaximaAlumnos){
            alumnos.add(nuevoAlumno);
        }
    }
    

    @Override
    public String toString() {
        /*
        
         -> nombre - sección 
             1 cuenta nombre ( x inasistencas)
                ......
             100 cuenta nombre  ( x inasistencas)
        */
        String estudiantes = ""; 
        for (int i = 0; i < alumnos.size(); i++) {
            estudiantes+=i+" )"+alumnos.get(i)+"\n" ;
            
        }
        
        return   nombre + " - " + seccion +"\n "+estudiantes;
    }
    
    
    
    
            
}

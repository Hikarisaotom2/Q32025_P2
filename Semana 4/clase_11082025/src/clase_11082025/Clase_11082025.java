/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_11082025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_11082025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
    
//  try catch finally 
        try {
            
              Dias diaSemana = Dias.MARTES;
                 diaSemana = Dias.valueOf("LUNES");
                System.out.println(diaSemana);
                System.out.println(diaSemana.getOrden() +" "+ diaSemana.getSimbolo());
        }catch(Exception e){
            /* Controlar el error*/
            System.out.println("Valor invalido");
        }finally{
                /*se llama despues del try o del catch */
                System.out.println("Adios!");
        }
     

    }
    
}

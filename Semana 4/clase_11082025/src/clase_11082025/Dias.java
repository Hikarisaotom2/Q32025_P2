/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_11082025;

/**
 *
 * @author claudiacortes
 */

/*
Los enums y las clases se parecen, PERO NO SON LO MISMO.
*/
public enum Dias {
    LUNES("L", 1), // LUNES = new Dias("L",1);
    MARTES("M",2),
    MIERCOLES("MM",3),
    JUEVES("J",4),
    VIERNES("V",5);
    
    private String simbolo;
    private int orden;
    
    private Dias(String simbolo, int orden){
        this.simbolo = simbolo;
        this.orden  = orden;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public int getOrden() {
        return orden;
    }
    
    
}

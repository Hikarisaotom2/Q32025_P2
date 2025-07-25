/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_22072025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_22072025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        La recursión es un tipo de ciclo. 
        
            Partes de la recursión: 
        
            1) Caso base : Nos ayuda a detener el ciclo recursivo. 
        
            2) Caso Recursivo: Nos ayuda a generar el ciclo. Siempre se llama al metodo dentro de si mismo. 
        
        */
        
        /*
            Queremos imprimir los numeros del 1 al x , x es un valor dado por el usuario. 
        */
        int x = 3; 
        
//        for (int i = 1; i <= x; i++) {
//               
//            System.out.println(i);
//            
//        }
        
//        Stack overflow
        imprimirNumeros(1,x);
        
        /*
         1) Factorial de un numero -> int 
         2) Palindromas  -> booleano  1 
         3) Buscar un numero en una lista -> retornar un booleano  2
         4) sumar los valores en una lista y retornar el valor total. 
        */
        
        /*
        lista = [5.....8]
        numero = 5
        
        retonar : booleano  -> contains 
        retornar: int -> indexof 
        for int i- 0; i<lista.length; i++ {
            if(lista[i] == numero){
                    return i;
             
        }
        return false;
        */
        
//        String p = "Anita lava la tina"

        /*
            1) Acum += p .charAt(p.length()-i);
            2) for int i = 0; i< p.length (); i++
                    for int j = p.length()-1 ; j>=0; j--
                             p.charAt(i) == p.chartAt(j)

            3)  int size = p.length()-1;
                 p = p.replaceAll(" ",""); 

                for (int i =0; i <=size ; i++){
                        if(p.chartAt(i) == p.ChartAt(size-i)){
                        }else{
                            sout( letras no coinciden);
                            return false; 
                        }
                }
                // si estamos fuera del for, la palabra es palindroma 
                return true; 

        */
        String palabra = "Anita lava la tina";
        palabra = palabra.replaceAll(" ", "").toLowerCase();
        int size = palabra.length()-1;
        boolean resp = palindroma(palabra,0);
        if(resp){
            System.out.println("Es palaindroma");
        }else{
            System.out.println("No es palindroma");
        }
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(4);
        lista.add(5);
        int numero = 50;
//        int res= indexOf(0,numero,lista);
//        System.out.println(res);
//        
        System.out.println(indexOf(0,numero,lista));
        System.out.println(busquedaBinaria(0, lista.size()-1, numero, lista));
       
    }
   
    
    public static int busquedaBinaria(int inicio,int fin,  int numero, ArrayList<Integer> lista){
        int medio = (inicio+fin)/2;

        if(inicio>fin){
            return -1;
        }

         if(lista.get(medio) == numero){
            return medio;
        }else if(numero>lista.get(medio)){  // Derecho 
            return busquedaBinaria(medio+1,fin,numero, lista);
        }else{ // izquierdo  numero < lista.get(medio)
            return busquedaBinaria(inicio,medio-1,numero, lista);
        }
    }
    
    public static int indexOf(int i, int numero, ArrayList<Integer> lista){
        int size = lista.size()-1;
        if(i>size){
            return -1;
        }
        
      /* if(lista.get(i)!=numero){ // caso recursivo 
            return indexOf(i+1, numero, lista);
        }else{ //caso base 
            return i;
        }*/
      
        if(lista.get(i)==numero){ //caso base 
            return i;
        }else{ //caso recursivo 
            return indexOf(i+1, numero, lista);
        }
        
    }
    public static boolean palindroma(String palabra, int i){
        int size = palabra.length()-1;
        if(i>size){
            return true;
        }
        if( palabra.charAt(i) != palabra.charAt(size-i)){ //caso base. 
            return false;
        }else{ //caso recursivo.
          return  palindroma(palabra, i+1);
        }
    }
    
    
    
    
    public static void imprimirNumeros(int i, int x) {

        /*
        if(){ // caso base 
        
        }else{ // caso recursivo 
        
        }
         */
        if (i <= x) { // caso recursivo
//            i= i+1;
//            i++;
            System.out.println(i);
            i += 1;
            imprimirNumeros(i, x);
        } 
//        else { // caso base 
//            // parar el ciclo
//            System.out.println("El ciclo termino....");
//        }

/*

Callstack - > pila : un lugar de la memoria donde se guarda informacion de la recursion

1) Cada vez que llamemos un metodo lo vamos a meter en el callstack. 
2) lo que metemos se agrega de abajo hacia arriba 
3) para sacar elementos , lo hacemos de arriba hacia abajo.
4) solamente nos enfocamos en una cosa a la vez. 
5) nos enfocamos en lo que este en el tope del callstack 
6) cuando un metodo termina su ejecucion, sale de la pila 


*/
    }

}

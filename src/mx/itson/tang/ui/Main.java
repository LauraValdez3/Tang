/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 *Inicia el programa y determina el punto de partida de su ejecución
 * @author Laura Valdez
 */
public class Main {
    
    public static void main(String[] args) {
        /**
         * Se declaran cuatro variables enteras para contar los números de teléfono pertenecientes a cada ciudad
         */
        int tijuana=0;
        int hermosillo=0;
        int guaymas=0;
        int desconocido=0;
        
        
        /**
         * Se solicita al usuario que ingrese el texto a evaluar y se almacena en la variable telefono
         */
        System.out.println("Ingresa el texto a evaluar");
        Scanner entrada = new Scanner (System.in);
        String telefono = entrada.nextLine();
        
        /**
         * Se crea una nueva cadena telefonoNuevo que elimina los caracteres especiales como guiones, paréntesis y espacios en blanco del texto ingresado.
         */
        String telefonoNuevo = telefono.replace("-", "").replace("(", "").replace(")", "").replace(" ", "");
        
        /**
         * Se divide la cadena telefonoNuevo en un arreglo de cadenas numeros utilizando la coma (",") como separador.
         */
        String[] numeros = telefonoNuevo.split(",");
        
        /**
         * Se itera a través del arreglo numeros y se verifica el prefijo de área de cada número para determinar a qué ciudad pertenece. Se actualizan las variables de conteo correspondientes.
         */
        for (String s: numeros) {
            if(telefonoNuevo.startsWith("664")){
                tijuana++;
            } else if(telefonoNuevo.startsWith("662")){
                hermosillo++;
            }else if (telefonoNuevo.startsWith("622")){
                guaymas++;
            }else{
                desconocido++;
            }
        }
        
        /**
         * Se imprime la cantidad de números de teléfono encontrados para cada ciudad y la cantidad de números desconocidos.
         */
        System.out.println("Hay "+tijuana+ " numeros de Tijuana" );
        System.out.println("Hay "+hermosillo+ " numeros de Hermosillo");
        System.out.println("Hay "+guaymas+ " numeros de Guaymas");
        System.out.println("Hay "+desconocido+ " numeros desconocidos");
       
        
        //System.out.println(telefonoNuevo);
        
       //String telefonoParentesis = telefono.replace("()", "");
        
        
        

        
        /*String nuevaOracion = oracion.replace("n", "x");
        System.out.println(nuevaOracion);
         
        boolean resultado = oracion.startsWith("a");
        
        if (resultado== true){
            System.out.println("Si inucia con a");
        } else{
                System.out.println("No inicia con a");
                }
        
        if(oracion.startsWith("a")){
            
        System.out.println("Si inucia con a");
        } else{
                System.out.println("No inicia con a");
                }
            
        System.out.println(oracion.startsWith("a") ? "Sí inicia con a " : "No inicia con a");*/
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionesanidadas;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class CondicionesAnidadas {

    public static void main(String[] args) {
        
        float n1;
        Scanner datos1=new Scanner(System.in);
        
        //pedimos datos
        System.out.println("Introduzca tu nota porfa: ");
        n1 = datos1.nextInt();
        
        // si es >= que 9 sobresaliente si es >= 7 notable >=5 aprobado < 5 suspeso
        
        if (n1 >= 9){
            System.out.println("Usted tiene un sobresaliente");
        
        }
        else if (n1 >=7){
            System.out.println("Su calificación es de notable");
        }
        else if (n1 >= 5){
            System.out.println("Su calificación es de aprobado");
        }
        else if (n1 < 5){
            System.out.println("Tiene una calificación suspensa");
        }

        /*OPERADORES LOGICOS:
        &&, || y !
        */
        
        int n2;
        System.out.println("Introduce el segundo numero: ");
        n2 = datos1.nextInt();
        
        //iniciamos condiciones con los operadores logicos
        
        //comprobamos que el valor es valido, tiene que ser distinto de 0 y mayor que 0
        if (n2 >0 && n2 !=0){
            System.out.println("El numero es valido");
        }
        else{
            System.out.println("El numero no es valido");
        }
        // ||
        if (n2 >0 || n2 !=0){
            System.out.println("El numero es valido");
        }
        
        //!
        boolean cansado;
        cansado = false;
        
        if (!cansado){
            System.out.println("Es verdadero");
        }
            
        
    }
}


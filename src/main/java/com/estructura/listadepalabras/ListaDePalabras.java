/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estructura.listadepalabras;

/**
 *
 * @author JEZER ESTRADA
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaDePalabras {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); //crea un objeto Scaner para la entrada de usuario
       Lista lista = new Lista();
       
        
        
       while(true){//bucle infinito para mantener el programa en ejecucion
          // Muestra las opciones del menu
          System.out.println("Por favor si quiere ingresar una palabra seleccione cualquiera de las primeras 3 opciones");
          System.out.println("\nOpciones: ");
          System.out.println("1. Insertar elemento al inicio");
          System.out.println("2. Insertar elemento al final");
          System.out.println("3. Insertar elemento en una posicion especifica");
          System.out.println("4. Buscar un elemento");
          System.out.println("5. Imprimir lista");
          System.out.println("6. salir");
          System.out.println("Seleccione una opcion: ");
          int opcion = scanner.nextInt(); //Lee la opcion seleccionada por el usuario
          scanner.nextLine();
          switch(opcion){//evalua la opcion seleccionada por el usuario
              
              case 1:
                  System.out.print("Ingrese el elemento a insertar al inicio: "); //solicita al usuario que ingrese el elemento
                  String elementoInicio = scanner.nextLine(); //Lee el elemento proporcionado por el usuario
                  lista.insertarAlInicio(elementoInicio); //inserta el elemento al inicio de la lista
                  break;
                  
              case 2:
                  System.out.print("Ingrese el elemento a insertar al final: "); //solicita al usuario que ingrese el elemento
                  String elementoFinal = scanner.nextLine(); //Lee el elemento proporcionado por el usuario
                  lista.insertarAlFinal(elementoFinal); //inserta el elemento al final de la lista
                  break;
                  
              case 3:
                  System.out.print("Ingrese el elemento a insertar: "); //solicita al usuario que ingrese el elemento
                  String elemento = scanner.nextLine(); //Lee el elemento proporcionado por el usuario
                   System.out.print("Ingrese la posicion donde insertar: ");//solicita al usuario que ingrese la posicion
                   int posicion = scanner.nextInt();//Lee la posicion proporcionada por el usuario
                  lista.insertarEnPosicion(elemento, posicion); //Inserta el elemento en la posicion especificada de la lista
                  break;
             
                  
              case 4:
                  System.out.print("Ingrese el elemento a buscar: "); //solicita al usuario que ingrese el elemento
                  String buscarElemento = scanner.nextLine(); //lee ele elemento proporcionado por el usuario
                  if(lista.buscar(buscarElemento)){//verifica si el elemento esta presente en la lista
                      System.out.println("El elemento " + buscarElemento + "esta en la lista.");
                  }else{
                      System.out.println("El elemento " + buscarElemento + "no esta en la lista.");
                  }
                  break;
                  
              case 5:
                  lista.imprimirLista();//imprime la lista actual
                  break;
                  
              case 6:
                  System.out.println("saliendo del programa..."); //muestraun mensaje de salida
                  scanner.close(); //cierra el objeto scanner
                  System.exit(0); //Finaliza el programa
              default:
                  System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                }  
            }
    }
}

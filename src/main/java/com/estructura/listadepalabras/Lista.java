/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estructura.listadepalabras;

/**
 *
 * @author JEZER ESTRADA
 */
        
public class Lista {
      Nodo cabeza; //referencia al primer nodo de la lista
    
    //constructor para inicializar la lista como vacia 
    public Lista(){
        this.cabeza=null; //la lista comienza vacia
    }
    
    //Metodo para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio (String dato){
        Nodo nuevoNodo = new Nodo(dato); //crea un nuevo nodo con el valor proporcionado
        nuevoNodo.siguiente = cabeza; //establece el siguiente del nuevo nodo como la cabeza actual
        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
    }
    
    //Metodo para insertar un nuevo nodo al final de la lista
    public void insertarAlFinal(String dato){
        Nodo nuevoNodo = new Nodo(dato); //crea un nuevo nodo con el valor proporcionado
        if(cabeza == null){ //verifica si la lista esta vacia
            cabeza = nuevoNodo; //si esta vacia, el nuevo nodo se convierte en la cabeza
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) { //avanza hasta el ultimo nodo de la lista
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo; //establece el siguiente del ultimo nodo como el nuevo nodo
        }
    }
 //Metodo para insertar un nuevo nodo en una posicion especifica de la lista
    public void insertarEnPosicion(String dato, int posicion){
        if (posicion < 0){//verifica si la posicion es valida
            System.out.println("La posicion debe ser de numero positivo.");
            return;
        }
        if(posicion == 0){ //inserta al inicio si la posicion es cero
            insertarAlInicio(dato);
            return;
        }
        Nodo nuevoNodo = new Nodo(dato);
        Nodo temp = cabeza;
        for (char i = 0; i < posicion - 1; i++){ //avanza hasta la posicion anterior a la deseada
            if(temp == null){
                System.out.println("La lista no tien suficientes elementos.");
                return;
            }
            temp = temp.siguiente;  
        }
        if(temp == null){
            System.out.println("La lista no tiene suficientes elementos.");
            return;
        }
        nuevoNodo.siguiente = temp.siguiente; //inserta el nievo nodo en la posicion especificada
        temp.siguiente = nuevoNodo;
    }
    
    
    //Metodo para hacer buscar un elemento en la lista
    public boolean buscar(String dato){
        Nodo temp = cabeza;
        while(temp != null){ //recorre la lista
            if(temp.dato == dato){//compara el valor del nodo con el dato buscado
                return true; //retorna true si lo encuentra   
            }
            temp = temp.siguiente;
        }
        return false; //retorna false si no lo encuentra
    }
    
    //Metodo para imprimir los elementos de la lista
    public void imprimirLista(){
        Nodo temp = cabeza;
        System.out.println("Lista: ");
        while (temp != null){//recorre la lista
            System.out.print(temp.dato + " ");//imprime el valor del nodo actual
            temp = temp.siguiente; //Avanza al siguiente nodo
        }
        System.out.println();
    }
    
}
    


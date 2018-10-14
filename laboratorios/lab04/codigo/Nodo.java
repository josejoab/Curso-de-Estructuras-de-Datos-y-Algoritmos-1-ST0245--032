/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4;

/**
 *
 * @author manuelgutierrez
 */
public class Nodo {
    Nodo izquierda;
    Nodo derecha;
    String persona;
    int numero;
    public Nodo(String persona) {
        this.persona = persona;

    }
    public Nodo(int numero){
         this.numero = numero;
    }
}

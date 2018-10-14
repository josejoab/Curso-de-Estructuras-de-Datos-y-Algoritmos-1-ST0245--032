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
public class BinaryTree {
    Nodo raiz;
   BinaryTree(String familia) 
    { 
        raiz = new Nodo(familia); 
    } 
  
    BinaryTree() 
    { 
        raiz = null; 
    } 
  
    public static void main(String[] args) {
        BinaryTree familiaManuel = new BinaryTree(); 
        familiaManuel.raiz = new Nodo("Manuel");
        
        familiaManuel.raiz.derecha = new Nodo("Jairo");
        familiaManuel.raiz.izquierda = new Nodo("Gloria");
        
        familiaManuel.raiz.derecha.izquierda = new Nodo("Gabriela");
        familiaManuel.raiz.derecha.derecha = new Nodo("Jairo");
        
        familiaManuel.raiz.izquierda.derecha = new Nodo("Felix");
        familiaManuel.raiz.izquierda.izquierda = new Nodo("Inés");
        
        familiaManuel.raiz.izquierda.derecha.derecha = new Nodo("Bonifacio");
        familiaManuel.raiz.izquierda.derecha.izquierda = new Nodo("Tereza");
        
        familiaManuel.raiz.izquierda.izquierda.izquierda = new Nodo("Victoria");
        familiaManuel.raiz.izquierda.izquierda.derecha = new Nodo(" ");
        
        familiaManuel.raiz.derecha.derecha.derecha = new Nodo(" ");
        familiaManuel.raiz.derecha.derecha.izquierda = new Nodo ("Maria");
        
        familiaManuel.raiz.derecha.izquierda.derecha = new Nodo(" ");
        familiaManuel.raiz.derecha.izquierda.izquierda = new Nodo("Rubiela");
        
        /**
         *           Manuel
         *        /           \
         *     Gloria         Jairo
         *     /     \        /    \
         *   Inés    Felix  Gabriela   Jairo
         *    /   \   /   \
         * Victoria TerezaBonifacio
         */ 
    }
}

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
    public BinaryTree(){
        raiz = null; 
    } 
  
    public Nodo getNode(){
        return raiz;
    }

    public void insertar(int numero){
        raiz = insertarAux(raiz, numero);
    }

    public Nodo insertarAux(Nodo raiz, int numero) {
        if (raiz == null){
            raiz = new Nodo(numero);
            return raiz;
        }
        if (numero < raiz.numero){
            raiz.izquierda = insertarAux(raiz.izquierda, numero);
        } else if (numero > raiz.numero) {
            raiz.derecha = insertarAux(raiz.derecha, numero);
        }
        return raiz;
    }

    public void imprimirPosOrden(Nodo raiz) {
        if(raiz != null){
            imprimirPosOrden(raiz.izquierda);
            imprimirPosOrden(raiz.derecha);
            System.out.println(raiz.numero);
        }
    }
    
    public static void calcularAbuela(Nodo nodo){
        String abuela1="",abuela2="";
        if(nodo!=null){
           if(nodo.izquierda.izquierda!=null){
               abuela1=nodo.izquierda.izquierda.persona;
            }
            else System.out.println("no se conoce la abuela materna");
            
            if(nodo.derecha.izquierda!=null){
                abuela2=nodo.derecha.izquierda.persona;
            }
            else System.out.println("no se conoce la abuela paterna");
        }
        System.out.println("la abuela materna es "+abuela1+" la abuela paterna es "+abuela2);
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
        
        BinaryTree arbol = new BinaryTree();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(24);
        arbol.insertar(5);
        arbol.insertar(28);
        arbol.insertar(45);
        arbol.insertar(98);
        arbol.insertar(52);
        arbol.insertar(60);
        arbol.imprimirPosOrden(arbol.getNode());
    }
}

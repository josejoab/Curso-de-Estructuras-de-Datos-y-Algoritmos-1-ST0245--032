/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio3;
/**
 * Importamos librerias para poder usar la LinkedList y ArrayList.
 */
import java.util.*;
import java.lang.Math;

/**
 *
 * @author manuelgutierrez
 */
public class Laboratorio3{
/**
 * Metodo que permite insertar un elemento al final de la lista si y solo si no se encuentra 
 * en ella.
 * @param lista
 * @param data 
 */
    public static void smartInsert(List<Integer> lista, int data) {
        if (lista.contains(data)) {

        } else {
            lista.add(data);
        }
    }
/**
 * Metodo que permite verificar cual es el mejor pivote de un arreglo, 
 * este metodo recibe como parametro una LinkedList o un ArrayList, al final
 * entregara el valor y la posición en la cual la viga quedará mejor balanceada.
 * @param lista 
 */
    public static void mejorPivote(List<Integer> lista) {
        int sumaDer = 0;
        int sumaIzq = 0;
        int iterador = lista.size() / 2;
        int pivote = 0;
        boolean notPivote = true;
        
        for (int i = 0; i < iterador; i++) {
            sumaIzq += (int) lista.get(i);
        }
        for (int i = iterador + 1; i < lista.size(); i++) {
            sumaDer += (int) lista.get(i);
        }
        if (sumaDer == sumaIzq) {
            System.out.println("Pivote correcto: " + lista.get(iterador)+" posicion: "+iterador);
            notPivote = false;
        }
        else {
            pivote = (int) lista.get(iterador);
            int diferencia = Math.abs(sumaDer - sumaIzq);
            int diferenciaAux = 0;
            while (notPivote) {
                if (sumaDer > sumaIzq) {
                    iterador += 1;
                    sumaDer = 0;
                    sumaIzq = 0;
                    for (int i = iterador+1; i < lista.size(); i++) {
                        sumaDer += (int) lista.get(i);
                    }
                    for (int i = 0; i < iterador; i++) {
                        sumaIzq += (int) lista.get(i);
                    }
                    diferenciaAux = Math.abs(sumaDer - sumaIzq);
                    if (diferencia > diferenciaAux) {
                        diferencia = diferenciaAux;
                        pivote = (int) lista.get(iterador);
                        
                    }
                    else{
                        notPivote = false;
                    }
                }
                else{
                    sumaDer = 0;
                    sumaIzq = 0;
                    iterador -= 1;
                    for (int i = iterador+1; i < lista.size(); i++) {
                        sumaDer += (int) lista.get(i);
                    }
                    for (int i = 0; i < iterador; i++) {
                        sumaIzq += (int) lista.get(i);
                    }
                    diferenciaAux = Math.abs(sumaDer - sumaIzq);
                    if (diferencia>diferenciaAux) {
                        diferencia = diferenciaAux;
                        pivote = (int) lista.get(iterador);
                    }
                    else{
                        notPivote = false;
                    }
                }
                if (iterador == lista.size() || iterador == 0) {
                    notPivote = false;
                    pivote = (int) lista.get(iterador);
                }
            }
            System.out.println("Pivote correcto: " + pivote+" posicion: "+iterador);
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(Arrays.asList(new Integer[]{1, 3, 5, 7}));

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new Integer[]{100,1,4,6,7,50,8,1,3,2,34,12,1}));

        ArrayList prueba = new ArrayList();

        smartInsert(linkedList, 100);
        mejorPivote(arrayList);

    }
}

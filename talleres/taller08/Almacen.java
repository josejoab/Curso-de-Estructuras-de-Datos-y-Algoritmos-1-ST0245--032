/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Talleres;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author manuelgutierrez
 */
public class Almacen{
    private int codigo;
    private String descripcion;
    private static Stack <Almacen> bodega = new Stack<Almacen>();
    private static Stack <Almacen> bodegaauxiliar = new Stack<Almacen>();
    public Almacen(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    /**
     * El ultimo digito del atributo codigo, será el numero de la solicitud a cual está asignado.
     * @return pila
     * Nota: No ofenderse con la descripción de cada nevera, es solo un juego.
     */
     public static Stack <Almacen> llenarAlmacen(){
         Almacen n1 = new Almacen(1121,"Guahl, nuestra primer nevera <3");
         Almacen n2 = new Almacen(1122,"Zony, nevera op");
         Almacen n3 = new Almacen(1123,"Sanksun,Nevera mala de Joab");
         Almacen n4 = new Almacen(1124,"Chalenyer,Nevera chimbita pero costosa");
         Almacen n5 = new Almacen(1125,"Apol, Nevera con juegos pal hijo");
         bodega.push(n1);
         bodega.push(n2);
         bodega.push(n3);
         bodega.push(n4);
         bodega.push(n5);
         return bodega;
     }
    public static void atender(String[]solicitud){
        int i=0;
        while(!bodega.isEmpty()){
                System.out.println("Enviamos solicitud: "+solicitud[i]+" Nevera: "+bodega.peek().descripcion);
                bodega.pop();
                i++;
            }
    }
    public static void main(String[] args) {
        llenarAlmacen();
        String []solicitud = {"Maria, la verdulera","Juan, el profesor.","Raul, el militar","Saul, el costurero","Juana, la banana"};
        atender(solicitud);
    }
}

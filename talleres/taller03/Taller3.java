/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller3;

/**
 *
 * @author manuelgutierrez
 */
public class Taller3 {
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
        if(n==1){
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
        } else {
            torresDeHannoiAux(n-1, origen, destino, intermedio);
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
            torresDeHannoiAux(n-1, intermedio, origen, destino);
        }
    }
    public static void combinationsAux(String prefix, String s){
        if(s.length() < 1){
            System.out.println(prefix);
        }
        else{
            combinationsAux(prefix+s.charAt(0),s.substring(1));
            combinationsAux(prefix,s.substring(1));
        }
    }
    public static void main(String[] args) {
        combinationsAux("","abc");
    }
}

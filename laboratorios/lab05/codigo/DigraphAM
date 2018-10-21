/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

import java.util.ArrayList;

public class DigraphAM extends Graph
{
   int[][] matriz;
   
   public DigraphAM(int size)
   {
       super(size);matriz = new int[size][size];
   }
   
   @Override
   public int getWeight(int source, int destination)
   {
       return matriz[source][destination];
   }
   
   public void addArc(int source, int destination, int weight)
   {
       matriz[source][destination] = weight;
   }
   public ArrayList<Integer> getSuccessors(int vertex)
   {
       ArrayList<Integer> succesors = new ArrayList();
       for(int i = 0; i < matriz[vertex].length; i++){
         if(matriz[vertex][i]!=0){
            succesors.add(i);
         }  
        }
        return succesors;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author manuelgutierrez
 */
public class DigraphAL extends Graph{
   LinkedList<Integer> adjListArray[];
   public DigraphAL(int size){
       super(size);
       adjListArray = new LinkedList[size]; 
       for(int i = 0; i < size ; i++){ 
                adjListArray[i] = new LinkedList<>(); 
       }
   }

   @Override
   public void addArc(int source, int destination, int weight){
     adjListArray[source].add(destination);
     adjListArray[destination].add(weight);
   }
   
   @Override
   public int getWeight(int source, int destination){
    return adjListArray[source].get(destination);
   }
   public ArrayList<Integer> getSuccessors(int vertex)
   {
       ArrayList<Integer> succesors = new ArrayList();
       for(int i = 0; i < adjListArray[vertex].size(); i++){
         if(adjListArray[vertex].get(i)!=0){
            succesors.add(i);
         }  
        }
        return succesors;
   }
}

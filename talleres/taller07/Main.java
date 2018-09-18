/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

/**
 *
 * @author magutierrm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListJKM lista = new LinkedListJKM();
        
        for (int i = 0; i <= 10; i++) {
            lista.insert(i, i);
        }
        
        System.out.println("size "+lista.size());
//        
//       for (int i = 0; i < lista.size(); i++) {
//            System.out.println("nodo "+i+ " "+lista.get(i)); 
//        }
       
      
        Node nuevo = new Node(7);
        lista.insert(7,4);
        lista.remove(0);

        
        
         for (int i = 0; i < lista.size(); i++) {
            System.out.println("nodo "+i+ " "+lista.get(i));
            
        }
    }
    
}

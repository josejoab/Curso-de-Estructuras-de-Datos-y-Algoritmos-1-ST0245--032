
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelgutierrez
 */
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      //este es el numero de relaciones y nodos
      System.out.println("numero de nodos");
      int numNodos = scanner.nextInt();
      System.out.println("numero de relaciones");
      int numRelaciones = scanner.nextInt();
      GrafoBicolor grafo = new GrafoBicolor(numNodos);
      for(int i = 0; i < numRelaciones; i++){
          System.out.println("nodo1");
          int nodo1 = scanner.nextInt();
          System.out.println("nodo2");
          int nodo2 = scanner.nextInt();
         grafo.establecerRelacion(nodo1, nodo2);
      }
      
      System.out.println(grafo.esBicolorable());
        
    }
}

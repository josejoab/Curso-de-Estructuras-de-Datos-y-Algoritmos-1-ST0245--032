
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuelgutierrez,Kevin Herrera, Jose Joab
 */
public class UnaTablaDeHash {
    
   /*
   * Utilizamos array por simplicidad sin embargo el uso de este no permite manejar coliciones
   * de manera eficiente, por lo cual esta primera versión de hash no implementa colisiones, esta
   * característica se implementará posteriormente.
   */
    
   private ArrayList<LinkedList<Pair<String,Integer>>> tabla;
   private ArrayList<LinkedList<Pair<String,String>>> paises;

   /**
   * Este método define el array utilizado con 10 posiciones de manera que tenemos un límite de 10 elementos
   * 
   */
  
   public UnaTablaDeHash(){
      tabla = new ArrayList<>();
      paises = new ArrayList<>();
   }

   /**
   * @param k es la llave del elemento que servirá como referencia al buscar
   * Este método se utiliza para darle una posicion dentro de la tabla, donde el %10 asegura que solo
   * se utilicen digitos de 0 a 10.
   */
   
   private int funcionHash(String k, ArrayList hash){
       int suma = 0;
       for(int i = 0; i < k.length(); i++){
         suma += ((int) k.charAt(i)) * i * (int) Math.pow(2,31-i);
       }
       return suma % hash.size();
   }

   /**
   * @param k es la llave del elemento que servirá como referencia al buscar
   * Este método se utiliza para obtener el elmento con la clave k, se enlaza con funcionHash
   */
   
   public int get(String k){
       int laFuncionHashDeK =  funcionHash(k, tabla);
       LinkedList<Pair<String,Integer>> temp = tabla.get(laFuncionHashDeK);
       for(Pair<String,Integer> pareja: temp){
            if(k.equalsIgnoreCase(pareja.getKey())){
                return pareja.getValue();
            }
        }
       return -1;
   }

   /**
   * @param k es la llave del elemento que servirá como referencia al buscar posteriormente
   * @param v es el valor asociado a la llave k
   * Este método se utiliza para agregar un nuevo elemento
   */
   
   public void put(String k, int v){  
         Pair<String,Integer> pareja= new Pair(k,v);
         tabla.get(funcionHash(k,tabla)).add(pareja);
   }
   
   public String getEmpresa(String nombreE){
     int laFuncionHashDeK =  funcionHash(nombreE, paises);
       LinkedList<Pair<String,String>> temp = paises.get(laFuncionHashDeK);
       for(Pair<String,String> pareja: temp){
            if(nombreE.equalsIgnoreCase(pareja.getKey())){
                return pareja.getValue();
            }
       }
       return "no se encuentra en la lista";
   }
   
   
   // pais = al pais de donde es la empresa
   // paieses es el arreglo de paises donde se almacena el hash
   // nombre = al nombre de la empresa
   
   public void putEmpresa(String pais, String nombre){
     Pair<String,String> pareja= new Pair(nombre,pais);
         paises.get(funcionHash(pais,paises)).add(pareja);
   }
}



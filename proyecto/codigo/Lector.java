package Proyecto2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.geometry.Point3D;

/**
 *
 * @author Manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 */
 
public class Lector {
    //atributos
 
    //metodos
    
   /**
    * Metodo para leer un archivo de abejas y almacenarlas en un arreglo Abejas
    *
    * @param  numeroDeAbejas  El numero de abejas a leer
    * @return un arreglo de Abejas donde cada elemento es una abeja con sus respectivas coordenadas
    */
    public ArrayList<Abeja>leerArchivo(int numeroDeAbejas){
          numeroDeAbejas = 10;
          Convertor convertor = new Convertor();
          final String nombreDelArchivo = "ConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";
          ArrayList <Abeja> arregloDeAbejas = new ArrayList();
          try {            
            BufferedReader br = new BufferedReader(new FileReader(nombreDelArchivo));
            String lineaActual = br.readLine();
            int index = 0;
            lineaActual = br.readLine(); // Descarta la primera linea
            while (lineaActual != null){ // Mientras no llegue al fin del archivo
                String [] cadenaParticionada = lineaActual.split(",");
                Abeja abeja = new Abeja(Math.abs(convertor.gradToX(Double.parseDouble(cadenaParticionada[0]))),
                                            Math.abs(convertor.gradToY(Double.parseDouble(cadenaParticionada[1]))),
                                            Math.abs(convertor.gradToZ(Double.parseDouble(cadenaParticionada[2])))
                                            ,100);
                arregloDeAbejas.add(index++, abeja);
                lineaActual = br.readLine();
            }
          }
          catch(IOException ioe) {
              System.out.println("Error leyendo el archivo de entrada");
          }
          return arregloDeAbejas;
    }
    /**
     * Metodo para encontrar la abeja con mayor X && menor X
     * @param arregloDeAbejas
     * @return
     * @throws InterruptedException 
     */
    public int detectarX(ArrayList<Abeja> arregloDeAbejas) throws InterruptedException{
        int mayor = arregloDeAbejas.get(0).getX();
        int mayorAux;
        int menor = arregloDeAbejas.get(0).getX();
        int menorAux;
        for(int i = 1; i < arregloDeAbejas.size(); i++){
            mayorAux = arregloDeAbejas.get(i).getX();
            menorAux = arregloDeAbejas.get(i).getX();
            if(mayorAux > mayor){
                mayor = mayorAux;
            }
            if(menorAux < menor){
                menor = menorAux;
            }
        }
        return mayor-menor;
    }
    
     public int detectarZ(ArrayList<Abeja> arregloDeAbejas) throws InterruptedException{
        int mayor = arregloDeAbejas.get(0).getZ();
        int mayorAux;
        int menor = arregloDeAbejas.get(0).getZ();
        int menorAux;
        for(int i = 1; i < arregloDeAbejas.size(); i++){
            mayorAux = arregloDeAbejas.get(i).getZ();
            menorAux = arregloDeAbejas.get(i).getZ();
            if(mayorAux > mayor){
                mayor = mayorAux;
            }
            if(menorAux < menor){
                menor = menorAux;
            }
        }
        return mayor-menor;
    }
     
    /**
     * Metodo para encontrar la abeja con menor Y && menor Y
     * @param arregloDeAbejas
     * @return
     * @throws InterruptedException 
     */
    public int detectarY(ArrayList<Abeja> arregloDeAbejas) throws InterruptedException{
        int mayor = arregloDeAbejas.get(0).getY();
        int mayorAux;
        int menor = arregloDeAbejas.get(0).getY();
        int menorAux;
        for(int i = 1; i < arregloDeAbejas.size(); i++){
            mayorAux = arregloDeAbejas.get(i).getY();
            menorAux = arregloDeAbejas.get(i).getY();
            if(mayorAux > mayor){
                mayor = mayorAux;
            }
            if(menorAux < menor){
                menor = menorAux;
            }
        }
        return mayor-menor;
   }   
}

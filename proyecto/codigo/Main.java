
package Proyecto2;

import java.util.ArrayList;

/**
 *
 * @author Manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {        
        Lector lector = new Lector();
        Convertor convertor = new Convertor();
        // Recibir el numero de abejas como parametro
        final int numeroDeAbejas = args.length == 0 ? 10 : Integer.parseInt(args[0]);
        // Leer el archivo con las coordenadas de las abejas
        ArrayList<Abeja> arregloDeAbejas = lector.leerArchivo(numeroDeAbejas);
        //Creamos el mapa y le añadimos las abejas.
        MapaBello mapa = new MapaBello(arregloDeAbejas);
        mapa.dividirX(70);
        mapa.dividirY(70);
        mapa.dividirZ(70);
        mapa.obtenerAbejas();
        mapa.agrupar();
        mapa.encontrarSolas();
        mapa.guardarColisiones(mapa.abejasColisionadas, numeroDeAbejas);
    }
}

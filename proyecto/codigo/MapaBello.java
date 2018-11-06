import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Representación del mapa de bello como una clase.
 * @author Manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 */

public class MapaBello{
    
    /**
     * Atributos de la clase MapaBello.
     */
    
    int alto;
    int ancho;
    int profundidad;
    int altoBoxes;
    int anchoBoxes;
    int profunBoxes;
    int numeroCuadrosP;
    
    HashMap<Integer,ArrayList<Abeja>> mapa = new HashMap<Integer,ArrayList<Abeja>>();  //HashMap donde guardamos las abejas
    ArrayList<Abeja> arregloDeAbejas; // Arreglo de abejas esparcidas por el mapa.
    
    ArrayList<Abeja> abejasColisionadas = new ArrayList<>(); //Abejas con riesgo de colisión

    
    public MapaBello(ArrayList<Abeja> arregloDeAbejas) throws InterruptedException {
        Lector lector = new Lector();
        this.arregloDeAbejas = arregloDeAbejas;
        this.alto = lector.detectarY(arregloDeAbejas);
        this.ancho = lector.detectarX(arregloDeAbejas);
        this.profundidad = lector.detectarZ(arregloDeAbejas);
        this.altoBoxes = alto;
        this.anchoBoxes = ancho;
        this.profunBoxes = profundidad;
    }
    
    public int getAlto(){
        return alto;
    }
    
    public int getAncho(){
        return ancho;
    }
    
    public int getProfundidad(){
        return profundidad;
    }
    /**
     * Creamos el hash map de int a ArrayList de abejas.
     */
    public void obtenerAbejas(){
        for (int i = 0; i < arregloDeAbejas.size(); i++){
            int id = ubicarAbeja(arregloDeAbejas.get(i).getX(), arregloDeAbejas.get(i).getY(),
                    arregloDeAbejas.get(i).getZ());
            if(mapa.get(id) == null){
                mapa.put(id, new ArrayList <Abeja>());
            }
            mapa.get(id).add(arregloDeAbejas.get(i));
        }
    }
    /**
     * Las agregamos y las agrupamos en un conjunto del hashmap.
     */
    public void agrupar(){
        for(HashMap.Entry<Integer, ArrayList<Abeja>> i: mapa.entrySet()){
             if(i.getValue().size() > 1){
                for(int j = 0; j < i.getValue().size(); j++){
                    abejasColisionadas.add(i.getValue().get(j));
                }
             }
        }
    }
    /**
     * Verificamos si una abeja esta sola para encontrar en los cuadros adyacentes su respectiva colisión
     */
    public void encontrarSolas(){
        
        int cf = (int)((ancho/anchoBoxes)*(alto/altoBoxes));
        int c  = (int)(ancho/anchoBoxes);
        
        for(HashMap.Entry<Integer, ArrayList<Abeja>> i: mapa.entrySet()){
            if(i.getValue().size() == 1 ){
                Abeja abejita = i.getValue().get(0);;
                int id = (ubicarAbeja(abejita.getX(), abejita.getY(), abejita.getZ()));
                if(!buscar(id-1,abejita)){
                    if(!buscar(id-c, abejita)){ 
                        if(!buscar((id-c)+1, abejita)){
                            if(!buscar((id-1)-1, abejita)){
                                if(!buscar(id+1, abejita)){
                                    if(!buscar(id+c,abejita)){
                                        if(!buscar((id+c)-1,abejita)){
                                            if(!buscar((id+c)+1,abejita)){
                                                if(!buscar((id-c)-1,abejita)){
                                                    if(!buscar(id-cf,abejita)){
                                                        if(!buscar(id+cf,abejita)){
                                                            if(!buscar((id+cf)-1,abejita)){
                                                                if(!buscar((id-cf)-1,abejita)){
                                                                    if(!buscar((id+cf)-c,abejita)){
                                                                        if(!buscar((id-cf)-c,abejita)){
                                                                           if(!buscar(((id-cf)-c)-1,abejita)){
                                                                               if(!buscar(((id+cf)-c)-1,abejita)){
                                                                                   if(!buscar(((id+cf)-c)+1,abejita)){
                                                                                      if(!buscar(((id-cf)-c)+1,abejita)){
                                                                                          if(!buscar((id+cf)+1,abejita)){
                                                                                              if(!buscar((id-cf)+1,abejita)){
                                                                                                  if(!buscar((id+cf)+c,abejita)){
                                                                                                      if(!buscar((id-cf)+c,abejita)){
                                                                                                          if(!buscar(((id+cf)+c)-1,abejita)){
                                                                                                              if(!buscar(((id-cf)+c)-1,abejita)){
                                                                                                                  if(!buscar(((id-cf)+c)+1,abejita)){
                                                                                                                      if(!buscar(((id+cf)+c)+1,abejita)){
                                                                                                                         
                                                                                                                      }
                                                                                                                  }
                                                                                                              }
                                                                                                          }
                                                                                                      }
                                                                                                  }
                                                                                              }
                                                                                          }
                                                                                      } 
                                                                                   }
                      
                                                                               }
                                                                           }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
            }
        }
    }
    
    
    public boolean buscar(int id, Abeja a){
        if(mapa.get(id) != null){
          for(int i = 0; i < mapa.get(id).size(); i++){
              if(Math.abs(mapa.get(id).get(i).getX() - a.getX()) <= a.getRangoColision() &&
                 Math.abs(mapa.get(id).get(i).getY() - a.getY()) <= a.getRangoColision() &&
                 Math.abs(mapa.get(id).get(i).getZ() - a.getZ()) <= a.getRangoColision()){
                  abejasColisionadas.add(a);
                  return true;
              }
          }
       }
        
        return false;
    }
    /**
     * Formula que nos ubica la abeja en el hash map dandole un ID.
     * @param x
     * @param y
     * @param z
     * @return 
     */
    public int ubicarAbeja(int x, int y,int z){
        return ((int)(Math.floor(x/anchoBoxes)) +
                (int)(Math.floor(y/altoBoxes) * (ancho/anchoBoxes))+
                (int)(Math.floor(z/profunBoxes) *
                     ((ancho/anchoBoxes) * (alto/altoBoxes))));
    }
    /**
     * Divide el mapa en cuadros pequeños para X
     * @param x 
     */
    public void dividirX(int x){
        boolean salir = false;
        while(anchoBoxes > x && salir == false){  
            int menorAux= Math.abs(this.anchoBoxes-x);
            int menorAux2 = menorAux;
            int menor = 0;
            int j = 1;
            for(int i = 2; i <= 9; i++) {
                menor = Math.abs((this.anchoBoxes/i)-x);
                if(menor < menorAux){
                    menorAux = menor;
                    j = i;
                }
            }
            if (menorAux == menorAux2){
                salir = true;
            }
            this.anchoBoxes =(int) (this.anchoBoxes/j);
        }
        this.numeroCuadrosP = (((ancho/anchoBoxes)*(alto/altoBoxes))*(profundidad/profunBoxes));
    }
    /**
     * Divide el mapa en cuadros pequeños para Y
     * @param y 
     */
    public void dividirY(int y){
        boolean salir = false;
        while(altoBoxes > y && salir == false){
            int menorAux= Math.abs(this.altoBoxes-y);
            int menorAux2 = menorAux;
            int menor = 0;
            int j = 1;
            for(int i=2; i <= 9; i++) {
                menor = Math.abs((this.altoBoxes/i)-y);
                if(menor < menorAux){
                    menorAux = menor;
                    j = i;
                }
            }
            if(menorAux2==menorAux){
                salir = true;
            }
            this.altoBoxes = (int)(this.altoBoxes/j);
        }
        this.numeroCuadrosP=(((ancho/anchoBoxes)*(alto/altoBoxes))*(profundidad/profunBoxes));
    }
    /**
     * Divide el mapa con cuadros pequeños para Z
     * @param z 
     */
    public void dividirZ(int z){
        boolean salir = false;
        while(profunBoxes > z && salir == false){
            int menorAux= Math.abs(this.profunBoxes-z);
            int menorAux2 = menorAux;
            int menor = 0;
            int j = 1;
            for(int i=2; i <= 9; i++) {
                menor = Math.abs((this.profunBoxes/i)-z);
                if(menor < menorAux){
                    menorAux = menor;
                    j = i;
                }
            }
            if(menorAux2==menorAux){
                salir = true;
            }         
            this.profunBoxes=(int)(this.profunBoxes/j);

        }
        this.numeroCuadrosP=(((ancho/anchoBoxes)*(alto/altoBoxes))*(profundidad/profunBoxes));
    }
    /**
     * Guarda las abejas colisionadas.
     * @param abejasConRiesgoDeColision
     * @param numeroDeAbejas 
     */
    
    public void guardarColisiones(ArrayList<Abeja> abejasConRiesgoDeColision, int numeroDeAbejas){
          final String nombreDelArchivo = "respuestaConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";   
          try {
             PrintWriter escritor = new PrintWriter(nombreDelArchivo, "UTF-8");
             for (Abeja abeja : abejasConRiesgoDeColision){
                escritor.println(abeja.getX()+","+abeja.getY()+","+abeja.getZ());
             }
             escritor.close();
          }
          catch(IOException ioe) {
              System.out.println("Error escribiendo el archivo de salida");
          }  
    }
    
}

}

/**
 * En este clase convertimos los grados a coordenadas cartesianas.
 * @author Manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 */

public class Convertor {
    /**
     * Recibe la latitud y la convierte a x.
     * @param x
     * @return 
     */
    public int gradToX(double x){
        return (int)(x*111111);
    }
     /**
     * Recibe la longitud y la convierte a y.
     * @param y
     * @return 
     */
    public int gradToY(double y){
        return (int)(y*111111);
    }
    /**
     * Recibe la altitud y la convierte a z
     * @param z
     * @return 
     */
    public int gradToZ(double z){
        return (int)(z);
    }
    
}

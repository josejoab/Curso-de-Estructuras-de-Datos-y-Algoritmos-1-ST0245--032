import java.util.ArrayList;

/**
 *
 * @author manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 * 
 */

public class Abeja {
    
    /**
     * La clase abeja tiene cuatro atributos, sus coordenadas en x,y,z y
     * su rango de colisión predeterminado.
     */
    
    private int x;
    private int y;
    private int z;
    private int rangoColision;
    ArrayList<Abeja> abejas = new ArrayList();
    
    /**
     * 
     * @param x latitud convertida a coordenadas cartesianas 
     * @param y longitud convertidad a coordenadas cartesianas
     * @param z altitud convertidad a coordenadas cartesianas
     * @param RG rango de colisión
     */
    
    public Abeja(int x, int y, int z, int RG) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.rangoColision = RG;
    }
    /**
     * Metodo getter para x.
     * @return x
     */
    public int getX() {
        return x;
    }
    /**
     * Metodo getter para y
     * @return y
     */
    public int getY() {
        return y;
    }
    /**
     * Metodo getter para z
     * @return z
     */
    public int getZ() {
        return z;
    }
    /**
     * Metodo getter para rangoColision
     * @return rangoColision
     */
    public int getRangoColision() {
        return rangoColision;
    }
}

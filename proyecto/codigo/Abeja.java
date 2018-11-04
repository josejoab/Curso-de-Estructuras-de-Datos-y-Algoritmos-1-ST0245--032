package Proyecto2;

import java.util.ArrayList;

/**
 *
 * @author manuel Gutierrez
 * @author Kevin Herrera
 * @author Joab Romero
 * 
 */

public class Abeja {
    
    //Atributos
    
    private int x;
    private int y;
    private int z;
    private int rangoColision;
    ArrayList<Abeja> abejas = new ArrayList();
    
    //metodos
    
    public Abeja(int x, int y, int z, int RG) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.rangoColision = RG;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getRangoColision() {
        return rangoColision;
    }
}

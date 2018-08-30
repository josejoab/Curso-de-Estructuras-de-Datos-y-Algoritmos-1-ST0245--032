import java.util.Arrays;

/**
 * La clase MiArrayList tiene la intención de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio. 
 * Para más información de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 * 
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class MiArrayList<CualquierCosa> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[] ; 
    
    /**
    * El metodo constructor se utiliza para incializar
    * variables a valores neutros como 0 o null.
    * El contructor no lleva parámetros en este caso.
    */
    public MiArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }     
    /**
    * Tiene la intención de retornar la longitud del objeto
    * @return longitud del objeto
    *
    * El size esta influenciado por las funciones add y del
    */
    public int size() {
        return size;
        
    }   
    /** 
    * @param e el elemento a guardar
    * Agrega un elemento e a la última posición de la lista
    *
    */
    public void add(CualquierCosa e) {
        if(size < elements.length){
        elements[size] = e;
        size++;
         }
       else {
         Object[] elements1  = new Object[size()];
         for(int i=0; i< elements.length;i++){
             elements1[i] = elements[i];
            }
            Object [] elements = new Object[size()*2];
         for(int i = 0; i < elements1.length; i++){
             elements[i] = elements1[i];
        }
        size ++;
        elements[size] = e;
    }
      
    }    
    
    
    /** 
    * @param i es un íncide donde se encuentra el elemento posicionado
    * Retorna el elemento que se encuentra en la posición i de la lista.
    *
    */
    public CualquierCosa get(int i) {
        
        if (i>=0 && i<size){
           return (CualquierCosa) elements[i];
        }
        else {
           return null;
    }
    }

    /**
    * @param index es la posicion en la cual se va agregar el elemento
    * @param e el elemento a guardar
    * Agrega un elemento e en la posición index de la lista
    *
    */
    public void add(int index, CualquierCosa e) {
        if(index > size){
          add(e);
        }
        else if(size == elements.length){  //C_1
           Object[] elements1  = new Object[size()]; //C_2
           for(int i=0; i< elements.length;i++){ // n 
             elements1[i] = elements[i]; //n-1
           }
           Object [] elements = new Object[size()*2]; //C_3 + C_4
           for(int i = 0; i < elements1.length; i++){ // n
              elements[i] = elements1[i]; // n-1
           }
           size ++; //C_5
           correrArreglo( index);
           elements[index]=e;
            }
        else if(index >= 0 && index < size){
          correrArreglo(index);
          elements[index]=e;
        }
    } 

    /**
    * @param index es la posicion en la cual se va agregar el elemento
    *
    * ELimina el elemento  en la posición index de la lista
    *
    */
    public void del(int index){
     elements[index] = null;
     BorrarArreglo(index);
    }
    
    private void correrArreglo( int index){
        for(int i = size;i> index;i--){
            elements[i]= elements[i-1];
            }
            
        }
    private void BorrarArreglo(int index){
     for(int i = index; i <= size; i++){
         elements[i] = elements[i+1];
        }
      elements[size] = null;
    }
}

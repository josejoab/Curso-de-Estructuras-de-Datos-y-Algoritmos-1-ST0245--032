
import java.util.*;

/**
 * La clase Taller8 tiene la intención de
 * enfatizar en el uso de pilas y colas ya 
 * implementadas en java
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html"> Ver más acerca de colas<a/>
 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html"> Ver más acerca de pilas <a/> 
 * @author Mauricio Toro, Andrés Páez 
 */
public class Taller8 {
    
    /**
    * @param stack es una pila ya implementada que se crea en el test
    * Este método se encarga de poner la pila stack en orden inverso
    * Nota: recuerde que la funcion pop() no solo expulsa la última 
    * posición de una pila si no que tambien devuelve su valor.
    * @return una pila que haga el inverso de stack
    */
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack<Integer> stack2 = new Stack();
        while(stack.size()>0){
            stack2.push(stack.pop());
        }
        return stack2;
    }
    
    
    /**
    * @param queue es una cola ya implementada que se crea en el test
    * Este método se encarga de atender a personas.
    * Nota: Se debe imprimir en consola a quién atiende y sacarlo de la cola
    * existe una función "pull" que hace el trabajo más fácil
    * 
    */
    public static void cola (Queue<String> queue){
        //...
    }
    
    
    /**
    * @param string es una cadena de texto que viene de este modo 3 4 5 * + o de esta manera 2 3 * 5 +
    * todo viene separado por espacios por lo que la funcion split.("") vendría muy bien para separarlos
    * Se intenta hacer el calculo por medio del metodo polaco posfijo
    * @return un entero resultado de la operación
    */ 
    public static int polaca(String string){
       ArrayList<String> partes = new ArrayList(); 
       String[] partesA = string.split(" ");
       for(int i = 0; i < partesA.length; i++){
         partes.add(partesA[i]);
        }
       int i = 0;
       while(partes.size() != 1){
        if(partes.get(i).equals("+")){
           String a = ""+(Integer.parseInt(partes.get(0)) + Integer.parseInt(partes.get(1)));
           partes.remove(0);
           partes.add(0,a);
           partes.remove(1);
           partes.remove("+");
           i = 0;
        }
        else if(partes.get(i).equals("-")){
           String a = ""+(Integer.parseInt(partes.get(0)) - Integer.parseInt(partes.get(1)));
           partes.remove(0);
           partes.add(0,a);
           partes.remove(1);
           partes.remove("-");
           i = 0;
        }
        else if(partes.get(i).equals("*")){
           int a = (Integer.parseInt(partes.get(0)) * Integer.parseInt(partes.get(1)));
           String b = ""+a;
           System.out.println("hola" + b);
           partes.remove(0);
           partes.add(0,b);
           partes.remove(1);
           partes.remove("*");
           i = 0;
        }
        else if(partes.get(i).equals("/")){
           String a = ""+(Integer.parseInt(partes.get(0)) / Integer.parseInt(partes.get(1)));
           partes.remove(0);
           partes.add(0,a);
           partes.remove(1);
           partes.remove("/");
           i = 0;
        }
        else i++;
        }
        return Integer.parseInt(partes.get(i));
    }

}

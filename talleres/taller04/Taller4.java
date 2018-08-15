/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Talleres;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author manuelgutierrez
 */
public class Taller4 {
    /**
	* @param array es un arreglo de numeros enteros
	* @param n la longitud del array anterior 
	*
	*en este método se busca hacer la suma de los numeros en un
	*arreglo de forma recursiva.
	*
	* @return la suma
	*/

     
    public static void main(String[] args) throws InterruptedException{
      
        long inicio,fin;
        int actual;
        int [] arr;
        boolean actual2;
       Taller4 re= new Taller4();
       for(int i=0;i<40;i=i+2){ 
           arr=re.ran((i)*50);
           inicio=System.currentTimeMillis();
           actual=re.sumAux(arr);
           fin=System.currentTimeMillis();
           System.out.println("Suma: "+actual+" Tiempo: "+(fin-inicio));
       
        }
        for(int j=0;j<40;j=j+2){ 
           arr=re.ran((j));
           int numero = (int) (Math.random() *10) + 1;
           inicio=System.currentTimeMillis();
           actual2=re.sumaGrupoAux(arr,numero);
           fin=System.currentTimeMillis();
           System.out.println("Tam arreglo "+j+" Tiempo: "+(fin-inicio)+" devuelve: "+actual2);
       
        }
       
       
       
    }
    public  int[] ran(int n){
        Random r = new Random(System.currentTimeMillis());
        int []array=new int[n];
        for(int i=0;i < n;++i){
            array[i]=i;
        }
        return array;
        
    }
    public  int sumAux(int nums[]) throws InterruptedException
    {
        return sum(nums,0);
    }
    public int sum(int nums[], int i) throws InterruptedException
    {
       if(i==nums.length){
           return 0;
        }
        TimeUnit.MILLISECONDS.sleep(1);
        return nums[i]+sum(nums,i+1);
    }
    public boolean sumaGrupoAux(int nums[],int numero)throws InterruptedException{
        return SumaGrupo(0,nums,numero);
    }
    public static boolean SumaGrupo(int start, int[] nums, int target) throws InterruptedException{
        if(start >= nums.length){ //Parada
            return target == 0;
        }
        TimeUnit.MILLISECONDS.sleep(1);
        if(SumaGrupo(start+1,nums,target-nums[start])){//Resta y entra al if, siempre.
            return true;
        }
        TimeUnit.MILLISECONDS.sleep(1);
        if(SumaGrupo(start+1,nums,target)){ //Iterador.
            return true;
        }
        else{
            return false;
        }
    }
}


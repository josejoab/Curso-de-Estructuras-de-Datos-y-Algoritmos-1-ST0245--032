/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import Talleres.Taller4;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author manuelgutierrez
 */
public class PuntoUno {
    public static int [] insertionSort(int[] nums) throws InterruptedException{
        int menor;
        for(int i = 0; i < nums.length; i++){
            TimeUnit.MILLISECONDS.sleep(1);
            for(int j = 1; j < nums.length-i; j++){
            TimeUnit.MILLISECONDS.sleep(1);
                if(nums[j-1] > nums[j]){
                   menor = nums[j-1];
                   nums[j-1] = nums[j];
                   nums[j] = menor;
                }
            }
        }
     return nums;
    }
    public static void mergesort(int A[],int izq, int der) throws InterruptedException{
        if (izq<der){
                TimeUnit.MILLISECONDS.sleep(1);
                int m=(izq+der)/2;
                mergesort(A,izq, m);
                mergesort(A,m+1, der);
                merge(A,izq, m, der);
        }
    }
    public static void merge(int A[],int izq, int m, int der) throws InterruptedException{
    int i, j, k;
    int [] B = new int[A.length]; 
    for (i=izq; i<=der; i++) 
              B[i]=A[i];
              TimeUnit.MILLISECONDS.sleep(1);
              i=izq; j=m+1; k=izq;
              while (i<=m && j<=der) 
              if (B[i]<=B[j])
                      A[k++]=B[i++];
              else
                      A[k++]=B[j++];
              while (i<=m) 
                            A[k++]=B[i++]; 
    }
    public  static int[] ran(int n){
        Random r = new Random(System.currentTimeMillis());
        int []array=new int[n];
        for(int i=0;i < n;++i){
            array[i]=i;
        }
        return array;
        
    }
        
    public static void main(String[] args) throws InterruptedException{
        long inicio,fin;
        int actual;
        int [] arr;
        boolean actual2;
       
        for(int j=5; j<225;j=j+20){ 
           arr=ran((j));
           int numero = (int) (Math.random() *10) + 1;
           inicio=System.currentTimeMillis();
           mergesort(arr, 0, arr.length-1);
           fin=System.currentTimeMillis();
           System.out.println("Tamaño del  arreglo "+j+" Tiempo: "+(fin-inicio));
        }
    }
}


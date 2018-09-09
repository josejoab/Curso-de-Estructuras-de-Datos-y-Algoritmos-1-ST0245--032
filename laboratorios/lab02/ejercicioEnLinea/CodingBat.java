/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author manuelgutierrez
 */
public class CodingBat {
    public int countEvens(int[] nums) {
        int contador = 0;
        for(int i = 0; i < nums.length; i++){
          if(nums[i] % 2 == 0){
            contador++;
          }
        }
        return contador;
}
    public int bigDiff(int[] nums) {
      int mayor = 0;
      int menor = 0;
      for(int i = 0; i < nums.length; i++){
        mayor = nums[i];
        menor = nums[i];
        for(int j = 0; j < nums.length; j++){
          if(mayor <= nums[j]){
            mayor = nums[j];
          }
          if(menor >= nums[j]){
            menor = nums[j];
          }
        }
      }
      return mayor-menor;
    }
    public int sum13(int[] nums) {
    int contador = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 13 ){
        contador += nums[i];
      }
      if(nums[i] == 13){
        i++;
      }
    }
    return contador;
  }
    public boolean has22(int[] nums) {
      for(int i = 0; i < nums.length-1; i++){
        if(nums[i] == 2 && nums[i+1] == 2){
          return true;
        }
      }
      return false;
    }
    public boolean lucky13(int[] nums) {
      for(int i = 0; i < nums.length; i++){
        if(nums[i] == 1 || nums[i] == 3){
          return false;
        }
      }
      return true;
    }
    public boolean canBalance(int[] nums) {
        int prm = 0;
        int seg = 0;

        for(int i = 0; i < nums.length; i++)
            seg += nums[i];

        for(int i = 0; i <= nums.length - 2; i++) {
            prm += nums[i];
            seg -= nums[i];
            
            if(prm == seg)
                return true;
        }
        return false;
    }
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0;

        while(i < nums.length) {
            int val = nums[i];
            i++;
            int length = 1;
            while(i < nums.length && nums[i] == val) {
                i++;
                length++;
            }

            if(length > 1)
                count++;
        }

        return count;
    }
    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;

        while(j < nums.length && nums[j] != 5)
            j++;

        while(i < nums.length) {
            if(nums[i] == 4) {
                int auxiliar = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = auxiliar;

                while((j < nums.length && nums[j] != 5) || j == i+1)
                    j++;
            }
            i++;
        }

        return nums;
    }
    public int[] seriesUp(int n) {
        int[] arreglo = new int[n*(n+1)/2];
        int auxiliar = 0;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                arreglo[auxiliar + j] = j + 1;
            }
            auxiliar += i;
        }

        return arreglo;
    }
    public int[] fix34(int[] nums) {
        int i = 0;

        while(i < nums.length && nums[i] != 3)
            i++;

        int j = i + 1;

        while(j < nums.length && nums[j] != 4)
            j++;

        while(i < nums.length) {
            if(nums[i] == 3) {
                int auxiliar = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = auxiliar;

                while(j < nums.length && nums[j] != 4)
                    j++;
            }
            i++;
        }

        return nums;
    }
}
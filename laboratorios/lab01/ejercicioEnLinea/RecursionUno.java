/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author manuelgutierrez
 */
public class RecursionUno {
    public int count7(int n) {
      if(n==0){
        return 0;
      }
      if(n%10 == 7){
        return 1+count7(n/10);
      }
      return count7(n/10);
    }
    public int count8(int n) {
        if(n==0){
          return 0;
        }
        if(n%10==8){
          if(n%100==88){
            return 2+count8(n/10);
          }
          return 1+count8(n/10);
        }

        return count8(n/10);
      }
    public int powerN(int base, int n) {
      if(n==0){
        return 1;
      }
      return base*powerN(base, n-1);
    }
    public int countX(String str) {
      if (str.length() == 0){
        return 0;
      }
      if(str.charAt(0) == 'x'){
        return 1+countX(str.substring(1));
      }
      return countX(str.substring(1));
    }
    public int countHi(String str) {
      if(str.length() < 2){
        return 0;
      }
      if(str.substring(0,2).equalsIgnoreCase("hi")){
        return 1+countHi(str.substring(1));
      }
      return countHi(str.substring(1));
    }
    public boolean array6(int[] nums, int index) {
      if(index == nums.length){
        return false;
      }
      if(nums[index] == 6){
        return true;
      }
      return array6(nums,index+1);
    }
    public int array11(int[] nums, int index) {
      if(index == nums.length){
        return 0;
      }
      if(nums[index] == 11){
        return 1+array11(nums,index+1);
      }
      return array11(nums,index+1);
    }
    public String allStar(String str) {
      if(str.length() <= 1){
        return str;
      }
      return str.charAt(0)+"*"+allStar(str.substring(1));
    }
    public String pairStar(String str) {
      if (str.length() <= 1){
        return str;
      }
      if(str.charAt(0) == str.charAt(1)){
        return pairStar(str.charAt(0)+"*"+str.substring(1));
      }
      return str.charAt(0)+pairStar(str.substring(1));
    }
    public String endX(String str) {
        if(str.length() <= 1){
          return str;
        }
        if(str.charAt(0) == 'x'){
          return endX(str.substring(1))+str.charAt(0);
        }
        return str.charAt(0)+endX(str.substring(1));
      }
    public int countAbc(String str) {
      if(str.length() <= 2){
        return 0;
      }
      if(str.charAt(0) == 'a'){
        if(str.charAt(1) == 'b' && str.charAt(2) == 'c' || str.charAt(1) == 'b' && str.charAt(2) == 'a'){
          return 1+countAbc(str.substring(2));
        }  
      }
      return countAbc(str.substring(1));
    }
    public int count11(String str) {
      if(str.length() <= 1){
        return 0;
      }
      if(str.charAt(0) == '1' && str.charAt(1) == '1'){
        return 1+count11(str.substring(2));
      }
      return count11(str.substring(1));
    }

}

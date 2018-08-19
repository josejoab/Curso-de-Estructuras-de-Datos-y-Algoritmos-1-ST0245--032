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
public class Fibonacci {
    int n = 100;
    public static int fibonacci(int n) {
        if(n <= 1){
          return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
      }
}
    

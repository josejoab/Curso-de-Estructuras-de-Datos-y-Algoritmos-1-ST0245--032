public class Taller5
{
 public static void main(String[] args){
  for(int i = 10000000; i <= 20000000; i+=1000000){
     int[] a = new int[i];
        for (int j = 0; j < i; j++ ){
          a[j] = j;
        }
        long start = System.currentTimeMillis();
        System.out.println(suma(a));  
        //suma(a);
        long fin = System.currentTimeMillis();       
        System.out.println(fin-start);
    }    
    }  
  
  public static int suma(int[] a){
  int suma = 0; // c_1
  for(int i = 0; i < a.length; i++) // c2 + sum c3, i=0 to n
    suma += a[i];  //sum c4, i=0 to n-1
  return suma; //c5
 }
 
  static void burbuja(int arreglo[])
    {
       for(int i = 0; i < arreglo.length - 1; i++) //C_1 + C_2 * (n+1)
        {
           for(int j = 0; j < arreglo.length - 1; j++) // n*(C_3 + C_4 * (n+1))
            {
               if (arreglo[j] < arreglo[j + 1]) // C_5
                {
                    int tmp = arreglo[j+1]; // C_6
                    arreglo[j+1] = arreglo[j]; //C_7
                    arreglo[j] = tmp; //C_8
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++) // C_9 + C_10*(n+1)
        {
            System.out.print(arreglo[i]+"\n");
        }
    }
}

}

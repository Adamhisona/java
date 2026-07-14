
package array;

import java.util.Scanner;
public class Array {

    
    public static void main(String[] args) {
        Scanner inp =  new Scanner (System.in);
        int ind;
        System.out.print("enter number of inputs: ");
        ind = inp.nextInt();
        
      int num[] = new int[ind];
       
        for (int i = 0; i < num.length; i++) {
            System.out.printf("enter  value for num [%d] : " ,i);
            num[i]  = inp.nextInt();
        }
        // index arrayname/  for each 
        for (int a : num) {
           
            System.out.printf("the values of num is: %d \n",a);
            
            
        }
        }
    }
    


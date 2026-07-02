
package mathclassfunctional;


public class MathClassFunctional {

       public static void main(String[] args) {
        
           double num1= 32;
           double num2= 67;
           // get the larger Math.max
           System.out.println("the highest value is: " + Math.max(num1,num2));
           // get the smaller Math.min
           System.out.println("the smaller value is: " + Math.min(num1,num2));
           //to get the squareroot Math.sqrt
           System.out.println("the square root of "+ num2 +" is :"+Math.sqrt(num2));
           double sqrtnum= Math.sqrt(num2);
           System.out.println("the squareroot value is: "+ sqrtnum);
           //get the power of num1 and num2 
           System.out.println("The powered of num1 and num2 is ;" + Math.pow(num1, num2) );
    }
    
}

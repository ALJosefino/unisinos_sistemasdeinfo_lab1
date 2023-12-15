
package gb004;

public class Gb004 {

    public static void main(String[] args) {
        
         int[] numeros = new int[5]; 

                numeros[0] = 3; 

                numeros[numeros[0]] = 5; 

                numeros[numeros[3] - 3] = 4; 

                numeros[2] = 7;
        
                System.out.println("" + numeros[0]);
                System.out.println("" + numeros[1]);
                System.out.println("" + numeros[2]);
                System.out.println("" + numeros[3]);
                System.out.println("" + numeros[4]);
        
    }
    
}

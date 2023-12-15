public class NumberChecker { 

    
    public static void main(String[] args) { 

        int[] numbers = {55, 10, 42, 1, 11}; 

        int count = 0; 



        for (int number : numbers) { 

            if (number % 5 == 0) { 

                ++count; 

            } 

        } 

        if (count > 2) { 

            System.out.println("Mais de dois números são divisíveis por 5."); 

        } else  if (count >= 2){ 

            System.out.println("No máximo dois números são divisíveis por 5."); 

        } else  

             System.out.println("Nenhum é divisivel por 5."); 

    } 

} 
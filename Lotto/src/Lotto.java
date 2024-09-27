import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) throws Exception {
       
        int i = 0;
        int[] lottonumerot = new int[7];
        ArrayList<Integer> arvotutNumerot = new ArrayList<>(); 

        Random arvonta = new Random();

        System.out.println("Loton oikea rivi on: " );
        
        while (arvotutNumerot.size() < 7){
            for (i = 0; i < lottonumerot.length; i++){           
            
                lottonumerot[i] = arvonta.nextInt(39) + 1; 

                if (!arvotutNumerot.contains(lottonumerot[i])){
                    arvotutNumerot.add(lottonumerot[i]);
                }        
                
                else if (arvotutNumerot.contains(lottonumerot[i])){
                    int numero = 0;
                    do {
                        numero = arvonta.nextInt(39) + 1;
                    } while (arvotutNumerot.contains(numero)); 
                    lottonumerot[i] = numero;
                    arvotutNumerot.add(numero);
                }            

                arvotutNumerot.get(i);

            }          
        } 
        Collections.sort(arvotutNumerot);
        System.out.println(arvotutNumerot);
        System.out.println();     
    }
}
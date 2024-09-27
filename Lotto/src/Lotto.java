import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) throws Exception {
        Random arvonta = new Random();
        int i = 0;
        ///Taulukko, jonka arvoiksi tulee arvonnan numerot 
        int[] lottonumerot = new int[7];
        
        ///Lista, johon kerätään arvotut numerot ja joista muodostuu "oikea rivi"  
        ArrayList<Integer> oikeatNumerot = new ArrayList<>(); 
        
        System.out.println("Loton oikea rivi on: " );
        
        ///Lottonumeroiden arvonta
        while (oikeatNumerot.size() < lottonumerot.length){
            for (i = 0; i < lottonumerot.length; i++){           
            
                lottonumerot[i] = arvonta.nextInt(39) + 1; 
                
                ///Jos numeroa ei ole aiemmin arvottu:
                if (!oikeatNumerot.contains(lottonumerot[i])){
                    oikeatNumerot.add(lottonumerot[i]);
                } 
                ///Jos numero on jo arvottu, arvotaan uusi numero:       
                else if (oikeatNumerot.contains(lottonumerot[i])){
                    int numero = 0;
                    do {
                        numero = arvonta.nextInt(39) + 1;
                    } while (oikeatNumerot.contains(numero)); 
                    lottonumerot[i] = numero;
                    oikeatNumerot.add(numero);
                }            
            }          
        } 
        ///Järjestetään numerot järjestykseen
        Collections.sort(oikeatNumerot);
        
        ///Tulostetaan oikean rivin numerot
        for (int nro : oikeatNumerot){
            System.out.print(nro + ", ");
        }
        System.out.print("Onnea voittajille!");
    }
}
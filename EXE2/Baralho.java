//Classe Baralho
package exe2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author MaarcosGF
 * 
 */
public class Baralho {
   public static void main(String[] args) {
        Cartas cartas = new Cartas();
        String[] nipes = cartas.nipes;
        String[] folhas = cartas.folhas;
        
      System.out.println("ESCOLHA DETERMINADA - carta escolhida sera"  + folhas[7] + " de " + nipes[2]);
      Random r = new Random();
            System.out.println("ESCOLHA ALEATORIA 01 ( Índice = "+ r.nextInt(10) + " )"); 
            int i = r.nextInt(folhas.length);
            String face = folhas[i];
            System.out.println("ESCOLHA ALEATORIA 02 ( " + face + " de "+ nipes[0] + " )");
            int j = r.nextInt(nipes.length);
            String nipe = nipes[j];
            System.out.println("ESCOLHA ALEATORIA 03 ( " + face + " de "+ nipe + " )");
    }
}

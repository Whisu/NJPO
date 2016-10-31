package czytaniepliku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Whisu
 */
public class OdczytPliku {

    public static void odczyt(String nazwa) throws IOException {
        BufferedReader plikWe = null;
        int slowa = 0;
        int linie = 0;

        try {
            plikWe = new BufferedReader(new FileReader(nazwa));
            String linia = plikWe.readLine();
            while (linia != null) {
                if (linia.charAt(1) != '\u0000') {
                    slowa++;
                }
                for (int licz = 0; licz != linia.length() - 1; licz++) {
                    if (linia.charAt(licz) == '\u0020' || linia.charAt(licz) == '\u0009' ) {
                        slowa++;
                        

                    }
                }
                linie++;
                linia = plikWe.readLine();
                
            }

        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        } finally {
            if (plikWe != null) {
                System.out.println("W pliku są " + linie + " linie.");
                System.out.println("W tekscie są " + slowa + " słowa.");
                plikWe.close();
            }
        }
    }
}

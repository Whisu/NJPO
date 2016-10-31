package kasyno;

import java.util.Random;

/**
 *
 * @author Whisu
 */
public class Krupier {

    public int kartyK(int wynik) {

        Random generator = new Random();

        int karta = generator.nextInt(10) + 1;
        if (karta == 1) {
            if (wynik < 11) {
                karta = 11;
            } else {
                karta = 1;
            }

        }
        return karta;
    }
}
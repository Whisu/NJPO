package kasyno;

import java.util.Random;

/**
 *
 * @author Whisu
 */
public class JBandyta {

    public int stanKonta;
    public int kontoKasyna;
    int i;
    int j;
    boolean wygrana = false;
    int licznik = 0;

    public void rozgrywka(int stanKonta, int KontoKasyna) {
        this.stanKonta = stanKonta;
        this.kontoKasyna = KontoKasyna;
        KontoGracza gracz = new KontoGracza();
        gracz.stanKonta(stanKonta);
        gracz.zaklad(stanKonta);

        int[][] tab = new int[3][3];
        Random r = new Random();
        for (i = 0; i != tab.length; i++) {

            for (j = 0; j != tab[i].length; j++) {
                int losowanie = r.nextInt(6) + 1;
                tab[i][j] = losowanie;
            }
        }
//=================================== wyswietlanie 
        for (i = 0; i != tab.length; i++) {
            for (j = 0; j != tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
//=================================== sprawdzenie poziomo
        for (i = 0; i != tab.length; i++) {
            for (j = 1; j != tab[i].length; j++) {
                if (tab[i][0] == tab[i][j]) {
                    licznik++;
                }
                if (licznik == 2) {
                    wygrana = true;
                }

            }
            licznik = 0;
        }
//==================================== sprawdzenie 1 przekatnej \

        licznik = 0;
        for (i = 1; i != tab.length; i++) {
            if (tab[0][0] == tab[i][i]) {
                licznik++;
            }

        }
        if (licznik == 2) {
            wygrana = true;
        }
//======================================= sprawdzenie 2 przekatnej /
        j = tab.length - 1;
        licznik = 0;
        for (i = 0; i != tab.length; i++) {
            if (tab[0][tab.length - 1] == tab[i][j]) {
                licznik++;
            }
            j--;
        }
        if (licznik == 3) {
            wygrana = true;
        }
//======================================== wygrana/przegrana
        if (wygrana) {
            System.out.println("Wygrałeś!\n");
            gracz.dodaj();
            this.stanKonta = gracz.stanKonta;
            this.kontoKasyna -=gracz.zaklad;

        } else {
            System.out.println("Przegrałeś!\n");
            gracz.odejmij();
            this.stanKonta = gracz.stanKonta;
            this.kontoKasyna +=gracz.zaklad;
        }
    }

    int kasa() {

        return stanKonta;
    }
    int kasaKasyna() {

        return kontoKasyna;
    }
}

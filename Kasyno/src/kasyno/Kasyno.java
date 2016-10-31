package kasyno;

import java.util.*;

/**
 *
 * @author Whisu
 */
public class Kasyno {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Witam w kasynie. Ile masz dostepnej gotówki? Wpisz tutaj: ");
        int kasa = r.nextInt();
        System.out.println(" W jaka gre chcesz zagrać ?");
        KontoGracza kontoG = new KontoGracza();
        BankK kontoK = BankK.inst();
        kontoG.stanKonta(kasa);
        System.out.println("1) Gra w jednorękiego bandyte.");
        System.out.println("2) Gra w blackjacka. ");
        System.out.println("3) Stan konta gracza.");
        System.out.println("4) Stan konta kasyna.");
        System.out.println("5) Wyjscie. \n");

        int wybor = r.nextInt();

        while (wybor == 1 || wybor == 2 || wybor == 3 || wybor == 4) {
            if (kontoG.stanKonta == 0) {
                System.out.println("Nie masz pieniedzy wyjdz z kasyna !\n\n");
                wybor = 5;
            }
             if (kontoK.stanKonta <= 0) {
                System.out.println("Rozbiłeś bank, kasyno nie ma juz pieniedzy!!\n\n");
                wybor = 5;
            }
            switch (wybor) {
                case 1:

                    System.out.println("Wybrałes gre w jednorękiego bandyte!");
                    JBandyta nowy1 = new JBandyta();
                    nowy1.rozgrywka(kontoG.stanKonta, kontoK.stanKonta);
                    kontoG.stanKonta = nowy1.kasa();
                    kontoK.aktKonta(nowy1.kontoKasyna);

                    break;
                case 2:

                    System.out.println("Wybrales gre w blackjacka!");
                    Blackjack nowy2 = new Blackjack();
                    nowy2.rozgrywka(kontoG.stanKonta, kontoK.stanKonta);
                    kontoG.stanKonta = nowy2.kasa();
                    kontoK.aktKonta(nowy2.kontoKasyna);

                    break;
                case 3:

                    System.out.println("Stan konta to: " + kontoG.stanKonta + "zl\n");

                    break;
                case 4:
                    System.out.println("Stan konta kasyna to: " + kontoK.stanKonta + "zl\n");

            }
            System.out.println(" W jaka gre chcesz zagrać ?");
            System.out.println("1) Gra w jednorękiego bandyte.");
            System.out.println("2) Gra w blackjacka. ");
            System.out.println("3) Stan konta gracza.");
            System.out.println("4) Stan konta kasyna.");
            System.out.println("5) Wyjscie. \n");
            wybor = r.nextInt();
        }
        System.out.println("Dzieki za odwiedzenie naszego kasyna! Twoja wygrana to " + kontoG.stanKonta + "zl");

    }

}

package kasyno;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Whisu
 */
public class Blackjack {

    public int stanKonta;
    public int kontoKasyna;
    

    void rozgrywka(int stanKonta,int KontoKasyna) {
        int wynik = 0; // wynik gracza
        int wynik2 = 0; // wynik krupiera
        int karta; // jakas jest teraz karta
        int wybory = 0;
        this.kontoKasyna = KontoKasyna;
        KontoGracza gracz = new KontoGracza();
        String reakcjaK = " ";
        String lKarta = " ";
        Scanner r = new Scanner(System.in);
        Scanner as = new Scanner(System.in);
        Random generator = new Random();;
        Krupier krupier = new Krupier();
        gracz.stanKonta(stanKonta);
        gracz.zaklad(stanKonta);
//=================================== interakcja 
        System.out.println("[Info] Chesz dobrac karte ? Jesli tak nacisnij spacje. Jesli nie nacisnij cokolwiek innego.");
        String dzialanie = " ";
        while (dzialanie.equals(" ")) {
//=================================== losowanie 
            karta = generator.nextInt(10) + 1;
//=================================== as             
            if (karta == 1) {

                System.out.println("Wylosowna karta to as. Chcesz dobrac 1 punkt czy 11. Wybranie 1 spowoduje dodanie do wyniku 1, natomiast 2 spowoduje dodanie 11 do twojego wyniku");
                wybory = as.nextInt();
                switch (wybory) {
                    case 1:
                        karta = 1;
                        break;
                    case 2:
                        karta = 11;
                        break;
                }
            }
//=================================== figury 
            if (karta == 10) {
                int llkarta = generator.nextInt(3) + 1;
                switch (llkarta) {
                    case 1:
                        lKarta = "Jopek";
                        break;
                    case 2:
                        lKarta = "Dama";
                        break;
                    case 3:
                        lKarta = "Krol";
                        break;
                    default:
                        break;
                }
//=================================== interakcja, Przypadke Figury i zwyklej karty 
                System.out.println("Wylosowana karta to " + lKarta + " .Do twojego wyniku zostanie dodana wartosc 10");
            }
            if (karta > 1 && karta < 10) {
                System.out.println("Wylosowana karta to " + karta + ". Do twojego wyniku zostanie dodana wartosc " + karta);
            }
            wynik += karta;
//=================================== krupier pkt            
            if (wynik2 < 17) {
                wynik2 += krupier.kartyK(wynik2);
            } else {
                reakcjaK = "PASS";
            }
//=================================== wyswietlanie wyniku              
            System.out.println("Twoj aktualny wynik to: " + wynik + " Wynik Krupiera to : " + wynik2 + " " + reakcjaK);
            if (wynik < 22) {
                dzialanie = r.nextLine();
                if (!dzialanie.equals(" ")) {
                    while (wynik2 < 17) {
                        wynik2 += krupier.kartyK(wynik2);
                    }
                    System.out.println("Twoj aktualny wynik to: " + wynik + " Wynik Krupiera to : " + wynik2 + " " + reakcjaK);
//=================================== wygrana/przegrana                     
                    if (wynik2 < 22 && wynik > wynik2) {
                        System.out.println("Wygrałeś!\n");
                        gracz.dodaj();
                        this.stanKonta = gracz.stanKonta;
                        this.kontoKasyna -=gracz.zaklad;

                    } else if (wynik == wynik2) {
                        System.out.println("Remis\n");
                        this.stanKonta = gracz.stanKonta;
                    } else if (wynik2 > wynik && wynik2 < 22) {
                        System.out.println("Przegrales!\n");
                        gracz.odejmij();
                        this.stanKonta = gracz.stanKonta;
                        this.kontoKasyna +=gracz.zaklad;

                        dzialanie = "1";
                    } else {
                        System.out.println("Wygrałeś!\n");
                        gracz.dodaj();
                        this.stanKonta = gracz.stanKonta;
                        this.kontoKasyna -=gracz.zaklad;
                        

                    }
                }
            } else {
                System.out.println("Przegrales!\n");
                gracz.odejmij();
                this.stanKonta = gracz.stanKonta;
                this.kontoKasyna +=gracz.zaklad;

                dzialanie = "1";
            }

        }

    }

    int kasa() {

        return stanKonta;
    }
     int kasaKasyna() {

        return kontoKasyna;
    }
}

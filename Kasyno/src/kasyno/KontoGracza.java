
package kasyno;

import java.util.Scanner;

/**
 *
 * @author Whisu
 */
public class KontoGracza{
    public int stanKonta;
    public int zaklad;
    
    void stanKonta(int stanKonta){
        this.stanKonta=stanKonta;
        
      
    
}
    void dodaj(){
        stanKonta+=zaklad;
       
    }
    void odejmij(){
        stanKonta-=zaklad;
    }
    int stanKonta(){
        return stanKonta;
    }
    void stankonta(){
        System.out.println(stanKonta);
    }
    void zaklad(int stanKonta){
        
        Scanner r = new Scanner(System.in);
        System.out.print("Ile pieniedzy mozesz postawic? Wpisz tutaj: ");
        zaklad = r.nextInt();
        while (zaklad>stanKonta){
            System.out.print("Nie masz tyle pieniedzy. Masz "+stanKonta+" zl. Sprobuj z inna wartoscia: ");
            zaklad = r.nextInt();
        }
    }
    int zaklad(){
        return zaklad;
    }
}

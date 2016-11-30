package website;



import java.io.FileNotFoundException;
import java.io.PrintWriter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Whisu
 */
public class ZapisDoPliku {
    
    public void zapisDoPliku(String[] tablica, String src) throws FileNotFoundException{
        try (PrintWriter zapis = new PrintWriter(src)) {
            for (int i=1;i!=tablica.length-1;i++){
            zapis.println(tablica[i]);}
        }
        
        
    }
    
    
}

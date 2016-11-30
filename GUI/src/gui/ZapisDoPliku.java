/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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

    public void zapisDoPliku(String[] pesel) throws FileNotFoundException{
        try (PrintWriter zapis = new PrintWriter("pesel.txt")) {
            for (int i =0;i!=pesel.length-1;i++)
            zapis.println(pesel[i]);
            zapis.close();
        
        
        
    }
    
    
}
}
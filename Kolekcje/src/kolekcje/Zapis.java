/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Whisu
 */
public class Zapis {
    
    JFileChooser fileChooser = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    public void pickMe(String zdanie) throws Exception{
    if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
        java.io.File file = fileChooser.getSelectedFile();
        
        try (PrintWriter zapis = new PrintWriter(file)) {
            zapis.println(zdanie);
            zapis.close();
        
        }
        
    }
    
    
}
}


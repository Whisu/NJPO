/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Whisu
 */
public class otwieranie {
    JFileChooser fileChooser = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    public void pickMe() throws Exception{
    if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
        java.io.File file = fileChooser.getSelectedFile();
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            sb.append(input.nextLine());
            sb.append("\n");
            
        }
        input.close();
    }
    else sb.append("Nie zaznaczyłes zadnego pliku!");
    
    }
    
}

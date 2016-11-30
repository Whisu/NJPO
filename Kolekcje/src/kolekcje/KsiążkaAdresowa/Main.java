/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje.KsiążkaAdresowa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Whisu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Person> ksiazkAdresowa = new ArrayList<Person>();
              
       ksiazkAdresowa.add(new Person("Janusz","Walnik",512541221));
       ksiazkAdresowa.add(new Person("Kamil", "Npasdod", 214436566));
       ksiazkAdresowa.add(new Person("Włodek", "Adsadfds", 214426566));
       ksiazkAdresowa.add(new Person("Marcin", "Zasdsaff", 214423466));
        Collections.sort(ksiazkAdresowa);
              for(Person person: ksiazkAdresowa)
                  System.out.println(person);
    }
    
}

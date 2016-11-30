/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje.PorownanieCzasu;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Whisu
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<>();
        LinkedList<Integer> testLinked = new LinkedList<>();
        for(int licznik=0;licznik!=101;licznik++){
        testArray.add(0);
        testLinked.add(0);
        }
      //Dodanie na poczatek  
   long startAddFArray=System.nanoTime();
   testArray.add(0,1);
   long stopAddFArray=System.nanoTime();
   long startAddFLinked=System.nanoTime();
   testLinked.addFirst(1);
   long stopAddFLinked=System.nanoTime();
    //Dodanie na koniec
   long startAddLArray=System.nanoTime();
   testArray.add(100,1);
   long stopAddLArray=System.nanoTime();
   long startAddLLinked=System.nanoTime();
   testLinked.addLast(1);
   long stopAddLLinked=System.nanoTime();
   //Dodanie do srodka
   long startAddMArray=System.nanoTime();
   testArray.add(50,1);
   long stopAddMArray=System.nanoTime();
   long startAddMLinked=System.nanoTime();
   testLinked.add(50,1);
   long stopAddMLinked=System.nanoTime();
   
   //Usuniecie poczatek  
    long startRemFArray=System.nanoTime();
   testArray.remove(0);
   long stopRemFArray=System.nanoTime();
   long startRemFLinked=System.nanoTime();
   testLinked.removeFirst();
   long stopRemFLinked=System.nanoTime();
    //Usuniecie koniec
   long startRemLArray=System.nanoTime();
   testArray.remove(100);
   long stopRemLArray=System.nanoTime();
   long startRemLLinked=System.nanoTime();
   testLinked.removeLast();
   long stopRemLLinked=System.nanoTime();
   //Usuniecie srodka
   long startRemMArray=System.nanoTime();
   testArray.remove(50);
   long stopRemMArray=System.nanoTime();
   long startRemMLinked=System.nanoTime();
   testLinked.remove(50);
   long stopRemMLinked=System.nanoTime();
   
   //Get poczatek  
    long startGetFArray=System.nanoTime();
   testArray.get(0);
   long stopGetFArray=System.nanoTime();
   long startGetFLinked=System.nanoTime();
   testLinked.getFirst();
   long stopGetFLinked=System.nanoTime();
    //Get koniec
   long startGetLArray=System.nanoTime();
   testArray.get(100);
   long stopGetLArray=System.nanoTime();
   long startGetLLinked=System.nanoTime();
   testLinked.getLast();
   long stopGetLLinked=System.nanoTime();
   //Get srodka
   long startGetMArray=System.nanoTime();
   testArray.get(50);
   long stopGetMArray=System.nanoTime();
   long startGetMLinked=System.nanoTime();
   testLinked.get(50);
   long stopGetMLinked=System.nanoTime();
  
   
   System.out.println("\n"+"Czas wykonania dodania na poczatek ArrayList (w nanosekundach): "+(stopAddFArray-startAddFArray));
   System.out.println("Czas wykonania dodania na poczatek LinkedList (w nanosekundach): "+(stopAddFLinked-startAddFLinked));
   
   System.out.println("\n"+"Czas wykonania dodania na koncu ArrayList (w nanosekundach): "+(stopAddLLinked-startAddLArray));
   System.out.println("Czas wykonania dodania na koncu LinkedList (w nanosekundach): "+(stopAddLLinked-startAddLLinked));
   
   System.out.println("\n"+"Czas wykonania dodania w srodku ArrayList (w nanosekundach): "+(stopAddMArray-startAddMArray));
   System.out.println("Czas wykonania dodania w srodku LinkedList (w nanosekundach): "+(stopAddMLinked-startAddMLinked));
   
   System.out.println("\n"+"Czas wykonania usuniecia  poczatku ArrayList (w nanosekundach): "+(stopRemFArray-startRemFArray));
   System.out.println("Czas wykonania usuniecie poczatku LinkedList (w nanosekundach): "+(stopRemFLinked-startRemFLinked));
   
   System.out.println("\n"+"Czas wykonania usuniecia na koncu ArrayList (w nanosekundach): "+(stopRemLArray-startRemLArray));
   System.out.println("Czas wykonania usuniecia na koncu LinkedList (w nanosekundach): "+(stopRemLLinked-startRemLLinked));
   
   System.out.println("\n"+"Czas wykonania usunieciau w srodku ArrayList (w nanosekundach): "+(stopRemMArray-startRemMArray));
   System.out.println("Czas wykonania usuniecia w srodku LinkedList (w nanosekundach): "+(stopRemMLinked-startRemMLinked));
   
   System.out.println("\n"+"Czas wykonania wyswietlenie poczatku ArrayList (w nanosekundach): "+(stopGetFArray-startGetFArray));
   System.out.println("Czas wykonania wyswietlenie poczatku LinkedList (w nanosekundach): "+(stopGetFLinked-startGetFLinked));
   
   System.out.println("\n"+"Czas wykonania wyswietlenie konca ArrayList (w nanosekundach): "+(stopGetLArray-startGetLArray));
   System.out.println("Czas wykonania wyswietlenie konca LinkedList (w nanosekundach): "+(stopGetLLinked-startGetLLinked));
   
   System.out.println("\n"+"Czas wykonania wyswietlenie srodka ArrayList (w nanosekundach): "+(stopGetMArray-startGetMArray));
   System.out.println("Czas wykonania wyswietlenie srodka LinkedList (w nanosekundach): "+(stopGetMLinked-startGetMLinked));
   
    }
    
 
    
}

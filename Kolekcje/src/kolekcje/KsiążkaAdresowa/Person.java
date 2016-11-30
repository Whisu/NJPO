/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje.KsiążkaAdresowa;

/**
 *
 * @author Whisu
 */
public class Person implements Comparable<Person> {
    
    private String Imie;

    public Person(String Imie, String Nazwisko, int nrTelefonu) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.nrTelefonu = nrTelefonu;
    }

    
    /**
     * Get the value of Imie
     *
     * @return the value of Imie
     */
    public String getImie() {
        return Imie;
    }

    /**
     * Set the value of Imie
     *
     * @param Imie new value of Imie
     */
    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    private String Nazwisko;

    /**
     * Get the value of Nazwisko
     *
     * @return the value of Nazwisko
     */
    public String getNazwisko() {
        return Nazwisko;
    }

    /**
     * Set the value of Nazwisko
     *
     * @param Nazwisko new value of Nazwisko
     */
    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    private int nrTelefonu;

    /**
     * Get the value of nrTelefonu
     *
     * @return the value of nrTelefonu
     */
    public int getNrTelefonu() {
        return nrTelefonu;
    }

    /**
     * Set the value of nrTelefonu
     *
     * @param nrTelefonu new value of nrTelefonu
     */
    public void setNrTelefonu(int nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public String toString() {
        return "Person: " + Nazwisko + " " + Imie + "    Numer telefonu: " + nrTelefonu + '}';
    }

    @Override
    public int compareTo(Person o) {
           int porownaneNazwiska = Nazwisko.compareTo(o.Nazwisko);
 
        if(porownaneNazwiska == 0) {
            return Imie.compareTo(o.Imie);
        }
        else {
            return porownaneNazwiska;
        }
    }

}

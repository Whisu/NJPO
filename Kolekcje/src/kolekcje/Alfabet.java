/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Whisu
 */
public class Alfabet {
    
    public int a;

    public static final String PROP_A = "a";
    
    private int ą;

    public static final String PROP_Ą = "ą";
    
    private int b;

    public static final String PROP_B = "b";
    
    private int c;

    public static final String PROP_C = "c";

    private int ć;

    public static final String PROP_Ć = "ć";

    private int d;

    public static final String PROP_D = "d";

    private int e;

    public static final String PROP_E = "e";

    private int ę;

    public static final String PROP_Ę = "ę";

    private int f;

    public static final String PROP_F = "f";

    private int g;

    public static final String PROP_G = "g";

    private int h;

    public static final String PROP_H = "h";

    private int i;

    public static final String PROP_I = "i";

    private int j;

    public static final String PROP_J = "j";

    private int k;

    public static final String PROP_K = "k";

    private int l;

    public static final String PROP_L = "l";

    private int ł;

    public static final String PROP_Ł = "ł";

    private int m;

    public static final String PROP_M = "m";

    private int n;

    public static final String PROP_N = "n";

    private int ń;

    public static final String PROP_Ń = "ń";

    private int o;

    public static final String PROP_O = "o";

    private int ó;

    public static final String PROP_Ó = "ó";

    private int p;

    public static final String PROP_P = "p";

    private int q;

    public static final String PROP_Q = "q";

    private int r;

    public static final String PROP_R = "r";

    private int s;

    public static final String PROP_S = "s";

    private int ś;

    public static final String PROP_Ś = "ś";

    private int t;

    public static final String PROP_T = "t";

    private int u;

    public static final String PROP_U = "u";

    private int v;

    public static final String PROP_V = "v";

    private int w;

    public static final String PROP_W = "w";

    private int x;

    public static final String PROP_X = "x";

    private int y;

    public static final String PROP_Y = "y";

    private int z;

    public static final String PROP_Z = "z";

    private int ź;

    public static final String PROP_Ź = "ź";

    private int ż;

    public static final String PROP_Ż = "ż";

    private int zero;

    public static final String PROP_ZERO = "zero";

    private int jeden;

    public static final String PROP_JEDEN = "jeden";

    private int dwa;

    public static final String PROP_DWA = "dwa";

    private int trzy;

    public static final String PROP_TRZY = "trzy";

    private int cztery;

    public static final String PROP_CZTERY = "cztery";

    private int piec;

    public static final String PROP_PIEC = "piec";

    private int szesc;

    public static final String PROP_SZESC = "szesc";

    private int siedem;

    public static final String PROP_SIEDEM = "siedem";

    private int osiem;

    public static final String PROP_OSIEM = "osiem";

    private int dziewiec;

    public static final String PROP_DZIEWIEC = "dziewiec";

    private int spacje;

    public static final String PROP_SPACJE = "spacje";

    /**
     * Get the value of spacje
     *
     * @return the value of spacje
     */
    public int getSpacje() {
        return spacje;
    }

    /**
     * Set the value of spacje
     *
     * @param spacje new value of spacje
     */
    public void setSpacje(int spacje) {
        int oldSpacje = this.spacje;
        this.spacje = spacje;
        propertyChangeSupport.firePropertyChange(PROP_SPACJE, oldSpacje, spacje);
    }

    
    public int getDziewiec() {
        return dziewiec;
    }

   
    public void setDziewiec(int dziewiec) {
        int oldDziewiec = this.dziewiec;
        this.dziewiec = dziewiec;
        propertyChangeSupport.firePropertyChange(PROP_DZIEWIEC, oldDziewiec, dziewiec);
    }

   
    public int getOsiem() {
        return osiem;
    }

   
    public void setOsiem(int osiem) {
        int oldOsiem = this.osiem;
        this.osiem = osiem;
        propertyChangeSupport.firePropertyChange(PROP_OSIEM, oldOsiem, osiem);
    }

    
    public int getSiedem() {
        return siedem;
    }

   
    public void setSiedem(int siedem) {
        int oldSiedem = this.siedem;
        this.siedem = siedem;
        propertyChangeSupport.firePropertyChange(PROP_SIEDEM, oldSiedem, siedem);
    }

    
    public int getSzesc() {
        return szesc;
    }

  
    public void setSzesc(int szesc) {
        int oldSzesc = this.szesc;
        this.szesc = szesc;
        propertyChangeSupport.firePropertyChange(PROP_SZESC, oldSzesc, szesc);
    }

    
    public int getPiec() {
        return piec;
    }

    
    public void setPiec(int piec) {
        int oldPiec = this.piec;
        this.piec = piec;
        propertyChangeSupport.firePropertyChange(PROP_PIEC, oldPiec, piec);
    }

    
    public int getCztery() {
        return cztery;
    }

    
    public void setCztery(int cztery) {
        int oldCztery = this.cztery;
        this.cztery = cztery;
        propertyChangeSupport.firePropertyChange(PROP_CZTERY, oldCztery, cztery);
    }

   
    public int getTrzy() {
        return trzy;
    }

   
    public void setTrzy(int trzy) {
        int oldTrzy = this.trzy;
        this.trzy = trzy;
        propertyChangeSupport.firePropertyChange(PROP_TRZY, oldTrzy, trzy);
    }

    
    public int getDwa() {
        return dwa;
    }

    
    public void setDwa(int dwa) {
        int oldDwa = this.dwa;
        this.dwa = dwa;
        propertyChangeSupport.firePropertyChange(PROP_DWA, oldDwa, dwa);
    }

    
    public int getJeden() {
        return jeden;
    }

    
    public void setJeden(int jeden) {
        int oldJeden = this.jeden;
        this.jeden = jeden;
        propertyChangeSupport.firePropertyChange(PROP_JEDEN, oldJeden, jeden);
    }

   
    public int getZero() {
        return zero;
    }

    
    public void setZero(int zero) {
        int oldZero = this.zero;
        this.zero = zero;
        propertyChangeSupport.firePropertyChange(PROP_ZERO, oldZero, zero);
    }

    
    public int getŻ() {
        return ż;
    }

    
    public void setŻ(int ż) {
        int oldŻ = this.ż;
        this.ż = ż;
        propertyChangeSupport.firePropertyChange(PROP_Ż, oldŻ, ż);
    }

   
    public int getŹ() {
        return ź;
    }

    
    public void setŹ(int ź) {
        int oldŹ = this.ź;
        this.ź = ź;
        propertyChangeSupport.firePropertyChange(PROP_Ź, oldŹ, ź);
    }

   
    public int getZ() {
        return z;
    }

    
    public void setZ(int z) {
        int oldZ = this.z;
        this.z = z;
        propertyChangeSupport.firePropertyChange(PROP_Z, oldZ, z);
    }

    
    public int getY() {
        return y;
    }

   
 
    public void setY(int y) {
        int oldY = this.y;
        this.y = y;
        propertyChangeSupport.firePropertyChange(PROP_Y, oldY, y);
    }

   
    public int getX() {
        return x;
    }

   
    public void setX(int x) {
        int oldX = this.x;
        this.x = x;
        propertyChangeSupport.firePropertyChange(PROP_X, oldX, x);
    }

    
    public int getW() {
        return w;
    }

    
    public void setW(int w) {
        int oldW = this.w;
        this.w = w;
        propertyChangeSupport.firePropertyChange(PROP_W, oldW, w);
    }

    
    public int getV() {
        return v;
    }

   
    public void setV(int v) {
        int oldV = this.v;
        this.v = v;
        propertyChangeSupport.firePropertyChange(PROP_V, oldV, v);
    }

 
    public int getU() {
        return u;
    }

  
  
    public void setU(int u) {
        int oldU = this.u;
        this.u = u;
        propertyChangeSupport.firePropertyChange(PROP_U, oldU, u);
    }

   
    public int getT() {
        return t;
    }

    
    public void setT(int t) {
        int oldT = this.t;
        this.t = t;
        propertyChangeSupport.firePropertyChange(PROP_T, oldT, t);
    }

   
    public int getŚ() {
        return ś;
    }

   
    public void setŚ(int ś) {
        int oldŚ = this.ś;
        this.ś = ś;
        propertyChangeSupport.firePropertyChange(PROP_Ś, oldŚ, ś);
    }

   
    public int getS() {
        return s;
    }

    
    public void setS(int s) {
        int oldS = this.s;
        this.s = s;
        propertyChangeSupport.firePropertyChange(PROP_S, oldS, s);
    }

   
    public int getR() {
        return r;
    }

    
    public void setR(int r) {
        int oldR = this.r;
        this.r = r;
        propertyChangeSupport.firePropertyChange(PROP_R, oldR, r);
    }

   
    public int getQ() {
        return q;
    }

    
    public void setQ(int q) {
        int oldQ = this.q;
        this.q = q;
        propertyChangeSupport.firePropertyChange(PROP_Q, oldQ, q);
    }

    public int getP() {
        return p;
    }

     void setP(int p) {
        int oldP = this.p;
        this.p = p;
        propertyChangeSupport.firePropertyChange(PROP_P, oldP, p);
    }

   
    public int getÓ() {
        return ó;
    }

   
    public void setÓ(int ó) {
        int oldÓ = this.ó;
        this.ó = ó;
        propertyChangeSupport.firePropertyChange(PROP_Ó, oldÓ, ó);
    }

    
    
    public int getO() {
        return o;
    }

   
    public void setO(int o) {
        int oldO = this.o;
        this.o = o;
        propertyChangeSupport.firePropertyChange(PROP_O, oldO, o);
    }

  
    public int getŃ() {
        return ń;
    }

    
    public void setŃ(int ń) {
        int oldŃ = this.ń;
        this.ń = ń;
        propertyChangeSupport.firePropertyChange(PROP_Ń, oldŃ, ń);
    }

    
    public int getN() {
        return n;
    }

    
    public void setN(int n) {
        int oldN = this.n;
        this.n = n;
        propertyChangeSupport.firePropertyChange(PROP_N, oldN, n);
    }

    
    public int getM() {
        return m;
    }

    
    public void setM(int m) {
        int oldM = this.m;
        this.m = m;
        propertyChangeSupport.firePropertyChange(PROP_M, oldM, m);
    }

   
    public int getŁ() {
        return ł;
    }

    
    public void setŁ(int ł) {
        int oldŁ = this.ł;
        this.ł = ł;
        propertyChangeSupport.firePropertyChange(PROP_Ł, oldŁ, ł);
    }

   
    public int getL() {
        return l;
    }

    
    public void setL(int l) {
        int oldL = this.l;
        this.l = l;
        propertyChangeSupport.firePropertyChange(PROP_L, oldL, l);
    }

   
    public int getK() {
        return k;
    }

    
    public void setK(int k) {
        int oldK = this.k;
        this.k = k;
        propertyChangeSupport.firePropertyChange(PROP_K, oldK, k);
    }

   
    public int getJ() {
        return j;
    }

    
    public void setJ(int j) {
        int oldJ = this.j;
        this.j = j;
        propertyChangeSupport.firePropertyChange(PROP_J, oldJ, j);
    }

  
    public int getI() {
        return i;
    }

   
    public void setI(int i) {
        int oldI = this.i;
        this.i = i;
        propertyChangeSupport.firePropertyChange(PROP_I, oldI, i);
    }

    
    public int getH() {
        return h;
    }

   
    public void setH(int h) {
        int oldH = this.h;
        this.h = h;
        propertyChangeSupport.firePropertyChange(PROP_H, oldH, h);
    }

    
    public int getG() {
        return g;
    }

   
    public void setG(int g) {
        int oldG = this.g;
        this.g = g;
        propertyChangeSupport.firePropertyChange(PROP_G, oldG, g);
    }

  
    public int getF() {
        return f;
    }

    
    public void setF(int f) {
        int oldF = this.f;
        this.f = f;
        propertyChangeSupport.firePropertyChange(PROP_F, oldF, f);
    }

    
    public int getĘ() {
        return ę;
    }

    
    public void setĘ(int ę) {
        int oldĘ = this.ę;
        this.ę = ę;
        propertyChangeSupport.firePropertyChange(PROP_Ę, oldĘ, ę);
    }

   
    public int getE() {
        return e;
    }

   
    public void setE(int e) {
        int oldE = this.e;
        this.e = e;
        propertyChangeSupport.firePropertyChange(PROP_E, oldE, e);
    }

    
    public int getD() {
        return d;
    }

    
    public void setD(int d) {
        int oldD = this.d;
        this.d = d;
        propertyChangeSupport.firePropertyChange(PROP_D, oldD, d);
    }

    public int getĆ() {
        return ć;
    }

    
    public void setĆ(int ć) {
        int oldĆ = this.ć;
        this.ć = ć;
        propertyChangeSupport.firePropertyChange(PROP_Ć, oldĆ, ć);
    }

    
    public int getC() {
        return c;
    }

    
    public void setC(int c) {
        int oldC = this.c;
        this.c = c;
        propertyChangeSupport.firePropertyChange(PROP_C, oldC, c);
    }


   
    public int getB() {
        return b;
    }

  
    public void setB(int b) {
        int oldB = this.b;
        this.b = b;
        propertyChangeSupport.firePropertyChange(PROP_B, oldB, b);
    }


  
    public int getĄ() {
        return ą;
    }

   
    public void setĄ(int ą) {
        int oldĄ = this.ą;
        this.ą = ą;
        propertyChangeSupport.firePropertyChange(PROP_Ą, oldĄ, ą);
    }

   
    public int getA() {
        return a;
    }

    
    public void setA(int a) {
        int oldA = this.a;
        this.a = a;
        propertyChangeSupport.firePropertyChange(PROP_A, oldA, a);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Alfabet{" + "a=" + a + '}';
    }

}

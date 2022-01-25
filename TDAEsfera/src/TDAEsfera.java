/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 ** @author RAGUEX
 */
public class TDAEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        TDAEsferita esfero = new TDAEsferita (3);
        System.out.println("radio :"+esfero.getradio());
        System.out.println("diametro :"+esfero.getdiametro());
        System.out.println("circunferencia :"+esfero.getcircunferencia());
        System.out.println("area :"+esfero.getarea());
        System.out.println("volumen :"+esfero.getvolumen());
    }
    
}
 
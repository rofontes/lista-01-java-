/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q03;

/**
 *
 * @author mathe
 */
public class ConversorMoedas {

    private double real;
    private double dolar;
    private double euro;
    private double iene;

    public ConversorMoedas() {
        setDolar(5.14);
        setEuro(5.07);
        setIene(0.036);
        setReal(1);
    }

    public double converterMoeda(int op, double reais) {
        double valor = 0.0;
        switch (op) {
            case 0:
                valor = reais / getDolar();
                return valor;
            case 1:
                valor = reais / getEuro();
                return valor;
            case 2:
                valor = reais / getIene();
                return valor;
            default:
                System.out.println("Opcão invalida");
        }
        return valor;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getIene() {
        return iene;
    }

    public void setIene(double iene) {
        this.iene = iene;
    }

}

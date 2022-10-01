/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q06;

/**
 *
 * @author mathe
 */
class Calcular {

    private int anos;
    private double taxa;
    private double valor;

    public Calcular(int anos, double taxa, double valor) {
        this.anos = anos;
        this.taxa = taxa;
        this.valor = valor;
    }

    public Calcular() {
    }

    public double calcularVFinal() {
        double vFinal = getValor();
        for (int i = 0; i < (getAnos() * 12); i++) {
            vFinal = vFinal + getValor() + (vFinal * (getTaxa() / 100));
        }
        return vFinal;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}

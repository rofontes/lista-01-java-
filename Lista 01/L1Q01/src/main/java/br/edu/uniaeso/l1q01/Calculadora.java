/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q01;

/**
 *
 * @author mathe
 */
public class Calculadora {

    private double n1, n2;
    private String op;

    public Calculadora() {
    }

    public double calcular() {
        double result = 0;
        switch (op) {
            case "+":
                result = getN1() + getN2();
                break;
            case "-":
                result = getN1() - getN2();
                break;
            case "/":
                result = getN1() / getN2();
                break;
            case "*":
                result = getN1() * getN2();
                break;
            default:

        }
        return result;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

}

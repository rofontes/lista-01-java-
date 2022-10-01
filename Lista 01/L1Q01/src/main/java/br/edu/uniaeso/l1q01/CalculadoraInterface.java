/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author mathe
 */
public class CalculadoraInterface extends JFrame {

    private JTextField result;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bEquals, bPlus, bMinus, bMult, bDiv, bDot;
    private CalculatorHandler cH;

   
    public CalculadoraInterface() {
        super("Calculadora");
        configureResult();
        setcH(new CalculatorHandler(getResult()));
        configureB0();
        configureB1();
        configureB2();
        configureB3();
        configureB4();
        configureB5();
        configureB6();
        configureB7();
        configureB8();
        configureB9();
        configureBDot();
        configureBDiv();
        configureBMult();
        configureBMinus();
        configureBPlus();
        configureBEquals();
        
        setLayout(null);
        setSize(420, 550);
        setVisible(true);
    }

    private void configureResult() {
        setResult(new JTextField("0"));
        getResult().setBounds(50, 25, 300, 50);
        getResult().setEditable(false);
        getResult().setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(getResult());
    }

    private void configureB0() {
        setB0(new JButton());
        getB0().setBounds(100, 250, 50, 50);
        getB0().setText("0");
        getB0().addActionListener(getcH());
        getContentPane().add(getB0());
    }

    private void configureB1() {
        setB1(new JButton());
        getB1().setBounds(100, 100, 50, 50);
        getB1().setText("1");
        getB1().addActionListener(getcH());
        getContentPane().add(getB1());
    }

    private void configureB2() {
        setB2(new JButton());
        getB2().setBounds(150, 100, 50, 50);
        getB2().setText("2");
        getB2().addActionListener(getcH());
        getContentPane().add(getB2());
    }

    private void configureB3() {
        setB3(new JButton());
        getB3().setBounds(200, 100, 50, 50);
        getB3().setText("3");
        getB3().addActionListener(getcH());
        getContentPane().add(getB3());
    }

    private void configureB4() {
        setB4(new JButton());
        getB4().setBounds(100, 150, 50, 50);
        getB4().setText("4");
        getB4().addActionListener(getcH());
        getContentPane().add(getB4());
    }

    private void configureB5() {
        setB5(new JButton());
        getB5().setBounds(150, 150, 50, 50);
        getB5().setText("5");
        getB5().addActionListener(getcH());
        getContentPane().add(getB5());
    }

    private void configureB6() {
        setB6(new JButton());
        getB6().setBounds(200, 150, 50, 50);
        getB6().setText("6");
        getB6().addActionListener(getcH());
        getContentPane().add(getB6());
    }

    private void configureB7() {
        setB7(new JButton());
        getB7().setBounds(100, 200, 50, 50);
        getB7().setText("7");
        getB7().addActionListener(getcH());
        getContentPane().add(getB7());
    }

    private void configureB8() {
        setB8(new JButton());
        getB8().setBounds(150, 200, 50, 50);
        getB8().setText("8");
        getB8().addActionListener(getcH());
        getContentPane().add(getB8());
    }

    private void configureB9() {
        setB9(new JButton());
        getB9().setBounds(200, 200, 50, 50);
        getB9().setText("9");
        getB9().addActionListener(getcH());
        getContentPane().add(getB9());
    }

    private void configureBDot() {
        setbDot(new JButton());
        getbDot().setBounds(150, 250, 50, 50);
        getbDot().setText(".");
        getbDot().addActionListener(getcH());
        getContentPane().add(getbDot());
    }

    private void configureBEquals() {
        setbEquals(new JButton());
        getbEquals().setBounds(200, 250, 50, 50);
        getbEquals().setText("=");
        getbEquals().addActionListener(getcH());
        getContentPane().add(getbEquals());
    }

    private void configureBDiv() {
        setbDiv(new JButton());
        getbDiv().setBounds(250, 100, 50, 50);
        getbDiv().setText("/");
        getbDiv().addActionListener(getcH());
        getContentPane().add(getbDiv());
    }

    private void configureBMult() {
        setbMult(new JButton());
        getbMult().setBounds(250, 150, 50, 50);
        getbMult().setText("*");
        getbMult().addActionListener(getcH());
        getContentPane().add(getbMult());
    }

    private void configureBMinus() {
        setbMinus(new JButton());
        getbMinus().setBounds(250, 200, 50, 50);
        getbMinus().setText("-");
        getbMinus().addActionListener(getcH());
        getContentPane().add(getbMinus());
    }

    private void configureBPlus() {
        setbPlus(new JButton());
        getbPlus().setBounds(250, 250, 50, 50);
        getbPlus().setText("+");
        getbPlus().addActionListener(getcH());
        getContentPane().add(getbPlus());
    }

    public JTextField getResult() {
        return result;
    }

    public void setResult(JTextField result) {
        this.result = result;
    }

    public JButton getB0() {
        return b0;
    }

    public void setB0(JButton b0) {
        this.b0 = b0;
    }

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public JButton getB2() {
        return b2;
    }

    public void setB2(JButton b2) {
        this.b2 = b2;
    }

    public JButton getB3() {
        return b3;
    }

    public void setB3(JButton b3) {
        this.b3 = b3;
    }

    public JButton getB4() {
        return b4;
    }

    public void setB4(JButton b4) {
        this.b4 = b4;
    }

    public JButton getB5() {
        return b5;
    }

    public void setB5(JButton b5) {
        this.b5 = b5;
    }

    public JButton getB6() {
        return b6;
    }

    public void setB6(JButton b6) {
        this.b6 = b6;
    }

    public JButton getB7() {
        return b7;
    }

    public void setB7(JButton b7) {
        this.b7 = b7;
    }

    public JButton getB8() {
        return b8;
    }

    public void setB8(JButton b8) {
        this.b8 = b8;
    }

    public JButton getB9() {
        return b9;
    }

    public void setB9(JButton b9) {
        this.b9 = b9;
    }

    public JButton getbEquals() {
        return bEquals;
    }

    public void setbEquals(JButton bEquals) {
        this.bEquals = bEquals;
    }

    public JButton getbPlus() {
        return bPlus;
    }

    public void setbPlus(JButton bPlus) {
        this.bPlus = bPlus;
    }

    public JButton getbMinus() {
        return bMinus;
    }

    public void setbMinus(JButton bMinus) {
        this.bMinus = bMinus;
    }

    public JButton getbMult() {
        return bMult;
    }

    public void setbMult(JButton bMult) {
        this.bMult = bMult;
    }

    public JButton getbDiv() {
        return bDiv;
    }

    public void setbDiv(JButton bDiv) {
        this.bDiv = bDiv;
    }

    public JButton getbDot() {
        return bDot;
    }

    public void setbDot(JButton bDot) {
        this.bDot = bDot;
    }
 public CalculatorHandler getcH() {
        return cH;
    }

    public void setcH(CalculatorHandler cH) {
        this.cH = cH;
    }
}

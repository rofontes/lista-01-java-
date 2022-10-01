/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q06;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
class PoupexGui extends JFrame {

    private JTextField jurosField, anosField, depositoField;
    private JButton bOk;
    private JLabel lJuros, lAnos, lDeposito, lFinal;
    private PoupexHandler ph;

    public PoupexGui() {
        super("Poupex");
        setLayout(null);
        setSize(300, 200);
        configureLJuros();
        configureJurosField();
        configureAnosField();
        configureDepositoField();
        configureLAnos();
        configureLDeposito();
        configureLFinal();
        setPh(new PoupexHandler(getJurosField(),getAnosField(),
                getDepositoField(),getlFinal()));
        configureBOk();
        setVisible(true);
    }

    private void configureJurosField() {
        setJurosField(new JTextField());
        getJurosField().setBounds(150, 10, 100, 20);
        getContentPane().add(getJurosField());

    }

    private void configureAnosField() {
        setAnosField(new JTextField());
        getAnosField().setBounds(150, 40, 100, 20);
        getContentPane().add(getAnosField());
    }

    private void configureDepositoField() {
        setDepositoField(new JTextField());
        getDepositoField().setBounds(150, 70, 100, 20);
        getContentPane().add(getDepositoField());
    }

    private void configureLJuros() {
        setlJuros(new JLabel("Juros ao mês %:"));
        getlJuros().setBounds(10, 10, 140, 20);
        getContentPane().add(getlJuros());
    }

    private void configureLAnos() {
        setlAnos(new JLabel("Num. de anos:"));
        getlAnos().setBounds(10, 40, 140, 20);
        getContentPane().add(getlAnos());
    }

    private void configureLDeposito() {
        setlDeposito(new JLabel("Depósito mensal R$:"));
        getlDeposito().setBounds(10, 70, 140, 20);
        getContentPane().add(getlDeposito());
    }

    private void configureLFinal() {
        setlFinal(new JLabel("Total poupado R$:"));
        getlFinal().setBounds(10, 100, 200, 20);
        getContentPane().add(getlFinal());
    }

    private void configureBOk() {
        setbOk(new JButton("OK"));
        getbOk().setBounds(150, 130, 100, 20);
        getbOk().addActionListener(getPh());
        getContentPane().add(getbOk());
    }

    public JTextField getJurosField() {
        return jurosField;
    }

    public void setJurosField(JTextField jurosField) {
        this.jurosField = jurosField;
    }

    public JTextField getAnosField() {
        return anosField;
    }

    public void setAnosField(JTextField anosField) {
        this.anosField = anosField;
    }

    public JTextField getDepositoField() {
        return depositoField;
    }

    public void setDepositoField(JTextField depositoField) {
        this.depositoField = depositoField;
    }

    public JButton getbOk() {
        return bOk;
    }

    public void setbOk(JButton bOk) {
        this.bOk = bOk;
    }

    public JLabel getlJuros() {
        return lJuros;
    }

    public PoupexHandler getPh() {
        return ph;
    }

    public void setPh(PoupexHandler ph) {
        this.ph = ph;
    }

    public void setlJuros(JLabel lJuros) {
        this.lJuros = lJuros;
    }

    public JLabel getlAnos() {
        return lAnos;
    }

    public void setlAnos(JLabel lAnos) {
        this.lAnos = lAnos;
    }

    public JLabel getlDeposito() {
        return lDeposito;
    }

    public void setlDeposito(JLabel lDeposito) {
        this.lDeposito = lDeposito;
    }

    public JLabel getlFinal() {
        return lFinal;
    }

    public void setlFinal(JLabel lFinal) {
        this.lFinal = lFinal;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class PoupexHandler implements ActionListener{
    private JTextField jurosField, anosField, depositoField;
    private JLabel LFinal;
    private Calcular calcular;

    public PoupexHandler(JTextField jurosField, JTextField anosField, JTextField depositoField, JLabel LFinal) {
        this.jurosField = jurosField;
        this.anosField = anosField;
        this.depositoField = depositoField;
        this.LFinal = LFinal;
        setCalcular(new Calcular());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton)(e.getSource())).getText() == "OK") {
            getCalcular().setAnos(Integer.parseInt(getAnosField().getText()));
            getCalcular().setTaxa(Double.parseDouble(getJurosField().getText()));
            getCalcular().setValor(Double.parseDouble(getDepositoField().getText()));
            Double vFinal = getCalcular().calcularVFinal();
            getLFinal().setText("Total poupado R$:"+ vFinal.toString());
        }
    }

    public Calcular getCalcular() {
        return calcular;
    }

    public void setCalcular(Calcular calcular) {
        this.calcular = calcular;
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

    public JLabel getLFinal() {
        return LFinal;
    }

    public void setLFinal(JLabel LFinal) {
        this.LFinal = LFinal;
    }
    
}

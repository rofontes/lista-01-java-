/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author mathe
 */
class MontanteHandler implements ActionListener{
    private Montante montante;
    private JLabel Label;
    private JTextField vField,tField,mField;

    public MontanteHandler(JLabel Label, JTextField vField, 
            JTextField tField, JTextField mField) {
        this.Label = Label;
        this.vField = vField;
        this.tField = tField;
        this.mField = mField;
        setMontante(new Montante());
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton)(e.getSource())).getText();
        if (buttonText == "Calcular") {
            getMontante().setTaxa(Double.parseDouble(gettField().getText()));
            getMontante().setTempo(Integer.parseInt(getmField().getText()));
            getMontante().setValor(Double.parseDouble(getvField().getText()));
            Double total = getMontante().calcularMontante();
            getLabel().setText("R$:"+total.toString());
        }
        
    }

    public Montante getMontante() {
        return montante;
    }

    public void setMontante(Montante montante) {
        this.montante = montante;
    }

    public JLabel getLabel() {
        return Label;
    }

    public void setLabel(JLabel Label) {
        this.Label = Label;
    }

    public JTextField getvField() {
        return vField;
    }

    public void setvField(JTextField vField) {
        this.vField = vField;
    }

    public JTextField gettField() {
        return tField;
    }

    public void settField(JTextField tField) {
        this.tField = tField;
    }

    public JTextField getmField() {
        return mField;
    }

    public void setmField(JTextField mField) {
        this.mField = mField;
    }

 

}

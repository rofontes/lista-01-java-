/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q03;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
class ConversorGUI extends JFrame{
    private JTextField textfield;
    private JComboBox <String> comboBox;
    private JLabel label;
    private JButton converter;
    private ConversorHandler cH;
    public ConversorGUI(){
    super("CONVERSOR");
        setLayout(null);
        setSize(250,200);
        configureTextField();
        configureLabel();
        configureCombo();
        setcH(new ConversorHandler(getLabel(),getTextfield(),getComboBox()));
        configureConverter();
        setVisible(true);
    }
    private void configureTextField(){
        setTextfield(new JTextField());
        getTextfield().setText("0");
        getTextfield().setBounds(10, 100, 100, 20);
        getContentPane().add(getTextfield());
    }
    private void configureLabel(){
        setLabel(new JLabel());
        getLabel().setText("R$:0.00");
        getLabel().setBounds(10, 18, 80, 10);
        getContentPane().add(getLabel());
    }
    private void configureCombo(){
        setComboBox(new JComboBox<String>());
        getComboBox().addItem("Dolar");
        getComboBox().addItem("Euro");
        getComboBox().addItem("Iene");
        getComboBox().setBounds(100, 10, 100, 20);
        getContentPane().add(getComboBox());
    }
    private void configureConverter(){
        setConverter(new JButton());
        getConverter().setText("converter");
        getConverter().setBounds(110, 100, 100, 20);
        getConverter().addActionListener(getcH());
        getContentPane().add(getConverter());
        
        
    }
    public JTextField getTextfield() {
        return textfield;
    }

    public void setTextfield(JTextField textfield) {
        this.textfield = textfield;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox<String> comboBox) {
        this.comboBox = comboBox;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getConverter() {
        return converter;
    }

    public void setConverter(JButton converter) {
        this.converter = converter;
    }

    public ConversorHandler getcH() {
        return cH;
    }

    public void setcH(ConversorHandler cH) {
        this.cH = cH;
    }

    
}


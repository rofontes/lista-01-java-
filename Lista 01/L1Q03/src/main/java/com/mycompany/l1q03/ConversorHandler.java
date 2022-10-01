/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q03;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;

/**
 *
 * @author mathe
 */
public class ConversorHandler implements ActionListener{
    private ConversorMoedas cM;
    private JButton jb;
    private JLabel label;
    private JTextField textField;
    private JComboBox <String> combo;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = getTextField().getText();
        if (((JButton)(e.getSource())).getText() == "converter") {
            Double valor = cM.converterMoeda(getCombo().getSelectedIndex(),
                    Double.parseDouble(getTextField().getText()));
            switch (getCombo().getSelectedIndex()) {
                case 0:
                    getLabel().setText("$:"+valor.toString());
                    break;
                    case 1:
                    getLabel().setText("€:"+valor.toString());
                    break;
                    case 2:
                    getLabel().setText("¥:"+valor.toString());
                    break;
                default:
                    getLabel().setText("ERROR");
            }
            
        }
    }

    public ConversorHandler(JLabel label, JTextField textField,
            JComboBox<String> combo) {
        this.label = label;
        this.textField = textField;
        setcM(new ConversorMoedas());
        this.combo = combo;
    }

    public ConversorMoedas getcM() {
        return cM;
    }

    public void setcM(ConversorMoedas cM) {
        this.cM = cM;
    }

    public JButton getJb() {
        return jb;
    }

    public void setJb(JButton jb) {
        this.jb = jb;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JComboBox<String> getCombo() {
        return combo;
    }

    public void setCombo(JComboBox<String> combo) {
        this.combo = combo;
    }
    
}

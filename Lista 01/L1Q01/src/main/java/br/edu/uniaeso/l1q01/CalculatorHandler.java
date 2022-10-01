/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso.l1q01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class CalculatorHandler implements ActionListener {

    private JTextField display;
    private JButton button;
    private Calculadora cal;

    public CalculatorHandler(JTextField display) {
        this.display = display;
        setCal(new Calculadora());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = getDisplay().getText();
        String buttonText = ((JButton) (e.getSource())).getText();
        if ((buttonText == "0") || (buttonText == "1") || (buttonText == "2")
                || (buttonText == "3") || (buttonText == "4")
                || (buttonText == "5") || (buttonText == "6") || (buttonText == "7")
                || (buttonText == "8") || (buttonText == "9")) {
            getDisplay().setText(displayText + buttonText);
        } else if (buttonText == ".") {
            if (displayText.indexOf(".") == -1) {
                getDisplay().setText(displayText + buttonText);
            }
        } else if ((buttonText == "+") || (buttonText == "-")
                || (buttonText == "/") || (buttonText == "*")) {
            getCal().setOp(buttonText);
            getCal().setN1(Double.parseDouble(displayText));
            getDisplay().setText("0");
        } else if (buttonText == "=") {
         getCal().setN2(Double.parseDouble(displayText));
         getDisplay().setText(Double.toString(getCal().calcular()));
        }
    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }

}

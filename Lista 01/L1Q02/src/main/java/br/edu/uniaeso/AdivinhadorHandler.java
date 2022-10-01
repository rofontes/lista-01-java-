/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class AdivinhadorHandler implements ActionListener {

    private Adivinhador Advinhador;
    private JButton button;
    private JTextField textField;
    private JLabel label;

    public AdivinhadorHandler(JLabel label, JTextField textField) {
        this.label = label;
        setAdvinhador(new Adivinhador());
        this.textField = textField;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = getTextField().getText();
        String textButton = (((JButton) e.getSource()).getText());

        if (textButton == "enviar") {
            getAdvinhador().setNum(Integer.parseInt(text));
            getLabel().setText(getAdvinhador().situacao());
            switch (getAdvinhador().getSitcor()) {
                case 1:
                    getLabel().setBackground(Color.green);
                    getTextField().setEditable(false);
                    break;
                case 2:
                    getLabel().setBackground(Color.red);

                    break;
                case 3:
                    getLabel().setBackground(Color.blue);
                    break;
                default:

            }
        } else if (textButton == "reiniciar") {
            setAdvinhador(new Adivinhador());
            getLabel().setText("Eu tenho um número entre 1 e 1000,"
                + "você pode adivinhá-lo? Entre com seu chute.");
            getLabel().setBackground(Color.GRAY);
            getTextField().setEditable(true);
            getTextField().setText("0");
            //apresentando o valor apenas para teste
            System.out.println(getAdvinhador().getGerador().getNum());
        }
    }

    public Adivinhador getAdvinhador() {
        return Advinhador;
    }

    public void setAdvinhador(Adivinhador Advinhador) {
        this.Advinhador = Advinhador;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

}

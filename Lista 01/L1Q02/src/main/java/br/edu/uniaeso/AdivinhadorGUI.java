/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso;



import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class AdivinhadorGUI extends JFrame {

    private JLabel label;
    private JTextField textField;
    private JButton jBSend, jBRestart;
    private AdivinhadorHandler ah;

    public AdivinhadorGUI() {
        super("Advinhe o número!");
        setLayout(null);
        setSize(500, 200);
        configureLabel();
        configureTextField();
        setAh(new AdivinhadorHandler(getLabel(),getTextField()));
        configureJBSend();
        configureJBRestart();
        setVisible(true);
    }

    private void configureLabel() {
        setLabel(new JLabel());
        getLabel().setSize(20, 20);
        getLabel().setText("Eu tenho um número entre 1 e 1000,"
                + "você pode adivinhá-lo? Entre com seu chute.");
        getLabel().setBounds(10, 10, 500, 20);
        getLabel().setOpaque(true);
        getLabel().setBackground(Color.GRAY);
        getContentPane().add(getLabel());
    }

    private void configureJBSend() {
        setjBSend(new JButton());
        getjBSend().setText("enviar");
        getjBSend().setBounds(10, 100, 100, 50);
        getjBSend().addActionListener(getAh());
        getContentPane().add(getjBSend());
    }

    private void configureJBRestart() {
        setjBRestart(new JButton());
        getjBRestart().setText("reiniciar");
        getjBRestart().setBounds(110, 100, 100, 50);
        getjBRestart().addActionListener(getAh());
        getContentPane().add(getjBRestart());
        
    }
    
    private void configureTextField(){
        setTextField(new JTextField());
        getTextField().setText("0");
        getTextField().setBounds(10, 50, 150, 30);
        //getTextField().addActionListener(getAh());
        getContentPane().add(getTextField());
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

    public JButton getjBSend() {
        return jBSend;
    }

    public void setjBSend(JButton jBSend) {
        this.jBSend = jBSend;
    }

    public JButton getjBRestart() {
        return jBRestart;
    }

    public void setjBRestart(JButton jBRestart) {
        this.jBRestart = jBRestart;
    }

    public AdivinhadorHandler getAh() {
        return ah;
    }

    public void setAh(AdivinhadorHandler ah) {
        this.ah = ah;
    }

}

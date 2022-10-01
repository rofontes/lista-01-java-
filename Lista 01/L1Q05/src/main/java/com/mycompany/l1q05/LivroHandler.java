/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class LivroHandler implements ActionListener {

    private Livro livro;
    private Livro[] livros;
    private JList jList;
    private JButton button;
    private JTextField tituloField,nPagField;
    private int pos = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton)(e.getSource())).getText();
        if (buttonText == "Adicionar") {
            System.out.println("Adicionar");
            getLivro().setTitulo(getTituloField().getText());
            getLivro().setnPag(Integer.parseInt(getnPagField().getText()));
            livros[pos] = getLivro();
            pos++;
            
            
        }else if(buttonText == "Listar"){
            System.out.println("listar");
            if (getjList().isVisible()== false) {
                getjList().setVisible(true);
            }else{
            getjList().setVisible(false);
            }
        
        }
    }

    public LivroHandler(JList jList, Livro[] livros,JTextField tituloField,
            JTextField nPagField) {
        this.jList = jList;
        this.livros = livros;
        this.tituloField = tituloField;
        this.nPagField = nPagField;
        setLivro(new Livro());
    }

    public Livro getLivro() {
        return livro;
    }

    public JTextField getTituloField() {
        return tituloField;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void setTituloField(JTextField tituloField) {
        this.tituloField = tituloField;
    }

    public JTextField getnPagField() {
        return nPagField;
    }

    public void setnPagField(JTextField nPagField) {
        this.nPagField = nPagField;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public JList<Livro> getjList() {
        return jList;
    }

    public void setjList(JList<Livro> jList) {
        this.jList = jList;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

}

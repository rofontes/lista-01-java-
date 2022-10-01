/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class LivroGUI extends JFrame {

    private JLabel lTitulo, lnPag;
    private JButton bAdd, bListar;
    private JTextField tituloField, nPagField;
    private JList lista;
    private Livro[] livros;
    private LivroHandler lH;

    public LivroGUI() {
        super("Gerenciador de Livros");
        setLayout(null);
        setSize(300, 300);
        this.livros = new Livro[200];
        livros = new Livro[200];
        configureLista();
        configureTituloField();
        configureNPagField();
        setlH(new LivroHandler(getLista(), getLivros(),
                getTituloField(), getnPagField()));
        configurelTitulo();
        configureLNPag();
        
        configureBAdd();
        configureBListar();

        setVisible(true);
    }

    private void configurelTitulo() {
        setlTitulo(new JLabel("Titulo:"));
        getlTitulo().setBounds(10, 10, 100, 20);
        getContentPane().add(getlTitulo());
    }

    private void configureTituloField() {
        setTituloField(new JTextField());
        getTituloField().setBounds(110, 10, 100, 20);
        getContentPane().add(getTituloField());
    }

    private void configureLNPag() {
        setLnPag(new JLabel("Páginas:"));
        getLnPag().setBounds(10, 40, 100, 20);
        getContentPane().add(getLnPag());
    }

    private void configureNPagField() {
        setnPagField(new JTextField());
        getnPagField().setBounds(110, 40, 100, 20);
        getContentPane().add(getnPagField());
    }

    private void configureBAdd() {
        setbAdd(new JButton("Adicionar"));
        getbAdd().setBounds(10, 70, 100, 20);
        getbAdd().addActionListener(getlH());
        getContentPane().add(getbAdd());
    }

    private void configureBListar() {
        setbListar(new JButton("Listar"));
        getbListar().setBounds(110, 70, 100, 20);
        getbListar().addActionListener(getlH());
        getContentPane().add(getbListar());
    }

    private void configureLista() {
        setLista(new JList(getLivros()));
        getLista().setBounds(10, 100, 200, 150);
        getLista().setVisible(false);
        getContentPane().add(getLista());
    }

    public JLabel getlTitulo() {
        return lTitulo;
    }

    public void setlTitulo(JLabel lTitulo) {
        this.lTitulo = lTitulo;
    }

    public JLabel getLnPag() {
        return lnPag;
    }

    public void setLnPag(JLabel lnPag) {
        this.lnPag = lnPag;
    }

    public JButton getbAdd() {
        return bAdd;
    }

    public void setbAdd(JButton bAdd) {
        this.bAdd = bAdd;
    }

    public JButton getbListar() {
        return bListar;
    }

    public void setbListar(JButton bListar) {
        this.bListar = bListar;
    }

    public JTextField getTituloField() {
        return tituloField;
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

    public JList getLista() {
        return lista;
    }

    public void setLista(JList lista) {
        this.lista = lista;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public LivroHandler getlH() {
        return lH;
    }

    public void setlH(LivroHandler lH) {
        this.lH = lH;
    }

}

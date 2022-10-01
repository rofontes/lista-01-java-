/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q05;

/**
 *
 * @author mathe
 */
public class Livro {
    private String titulo;
    private int nPag;

    public Livro(String titulo, int nPag) {
        this.titulo = titulo;
        this.nPag = nPag;
    }

    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    @Override
    public String toString() {
        return "Titulo: "+ getTitulo() +" NPag: " + getnPag();
    }
    
}

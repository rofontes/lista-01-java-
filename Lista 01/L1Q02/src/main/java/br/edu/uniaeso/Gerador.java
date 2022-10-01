/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso;

import java.util.Random;

/**
 *
 * @author mathe
 */
public class Gerador {
    private int num;

    public Gerador() {
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        Random r = new Random();
        this.num = r.nextInt(1000 - 1) + 1;
    }
}

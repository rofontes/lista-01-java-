/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.uniaeso;

import javax.swing.JFrame;

public class L1Q02 {

    public static void main(String[] args) {

        AdivinhadorGUI agui = new AdivinhadorGUI();
        agui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //apresentando o valor apenas para testes
        System.out.println(agui.getAh().getAdvinhador().getGerador().getNum());
    }
}

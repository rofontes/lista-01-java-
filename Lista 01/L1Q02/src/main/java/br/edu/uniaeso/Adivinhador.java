/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.uniaeso;

/**
 *
 * @author mathe
 */
public class Adivinhador {

    private Gerador gerador;
    private int num = 0, ultimatentativa = 0, sitcor = 0;

    public Adivinhador() {
        setGerador(new Gerador());
        getGerador().setNum();
    }

    public String situacao() {
        int now = 0, before = 0;
        now = getNum() - getGerador().getNum();
        before = getUltimatentativa() - getGerador().getNum();
        if (getNum() == getGerador().getNum()) {
            setUltimatentativa(getNum());
            setSitcor(1);
            return "Correto!";

        } else if (Math.abs(now) < Math.abs(before)) {
            setUltimatentativa(getNum());
            setSitcor(2);
            return "Mais perto!";
        } else if (Math.abs(now) > Math.abs(before)) {
            setUltimatentativa(getNum());
            setSitcor(3);
            return "Mais longe!";
        }
        return null;
    }

    public Gerador getGerador() {
        return gerador;
    }

    public void setGerador(Gerador gerador) {
        this.gerador = gerador;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getUltimatentativa() {
        return ultimatentativa;
    }

    public void setUltimatentativa(int ultimatentativa) {
        this.ultimatentativa = ultimatentativa;
    }

    public int getSitcor() {
        return sitcor;
    }

    public void setSitcor(int sitcor) {
        this.sitcor = sitcor;
    }

}

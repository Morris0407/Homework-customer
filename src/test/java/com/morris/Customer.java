package com.morris;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Customer {
    String 客戶編號;
    int 消費金額;
    int 折讓;
    int 金額;

    public Customer(String 客戶編號, int 消費金額, int 折讓, int 金額) {
        this.客戶編號 = 客戶編號;
        this.折讓 = 折讓;
        this.消費金額 = 消費金額;
        this.金額 = 金額;


    }

    public void print() {
        System.out.println(客戶編號+ "\t" + 消費金額 + "\t"+折讓 + "\t" + 金額 );


    }
}

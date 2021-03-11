package com.morris;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Customer {
    String id;
    int spent;
    int discount;


    public Customer(String id, int spent, int discount) {
        this.id = id;
        this.discount = discount;
        this.spent = spent;



    }

    public void print() {
        System.out.println(id+ "\t" + spent + " \t"+ discount  +"\t" +"  "+ (spent-discount));


    }
}

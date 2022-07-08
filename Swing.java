package com.supriya;
import javax.swing.*;
public class Swing {
    Swing(double res,String Type) {
String R=res+"";
        JFrame f = new JFrame("Welcome to SBI BANK");
        JLabel l0 = new JLabel("**********************************");
        JLabel l1 = new JLabel("HITACHI MONEY SPOT ATM");
        JLabel l = new JLabel("***********************************");
        l0.setBounds(20, 10, 200, 100);
        l1.setBounds(20, 30, 200, 100);
        l.setBounds(20, 50, 200, 100);
        JLabel l2 = new JLabel("DHULAPPALY MANADAL SECUNDRABAD");
        l2.setBounds(20, 70, 300, 100);
        JLabel l3, l4, l5, t1, t2;
        l3 = new JLabel("TRANSACTION TYPE:");
        l3.setBounds(20, 100, 200, 100);
        t1 = new JLabel(Type);
        t1.setBounds(30, 120, 200, 100);
        l4 = new JLabel("AMOUNT:");
        l4.setBounds(20, 140, 200, 100);
        t2 = new JLabel(R);
        t2.setBounds(30, 160, 200, 100);
        l5 = new JLabel("THANKS FOR CHOOSING HITACHI ATM");
        l5.setBounds(30, 130, 200, 100);
        f.add(l0);
        f.add(l1);
        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(l5);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}

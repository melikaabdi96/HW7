package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * This class makes a frame for a calculator
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class CalculatorGUI {
    JFrame calcFrame;
    private boolean shiftKey;

    public CalculatorGUI() {
        this.shiftKey = true;
        calcFrame = new JFrame();
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(700, 500);
        calcFrame.setLocation(200, 200);
        calcFrame.setLayout(null);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw();
        calcFrame.setVisible(true);
    }

    //draw claculator
    public void draw() {
        drawkeyboard();
        drawScreen();
    }

    //draw screen of calculator
    public void drawScreen() {
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jTextArea.setFont(new Font("Arial", 14, 14));

        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setSize(500, 70);
        jScrollPane.setLocation(160, 5);

        calcFrame.add(jScrollPane);
    }

    //draw keyboard of calculator
    public void drawkeyboard() {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(5, 50, 670, 400);
        jTabbedPane.add("Standard", jPanel1);
        jTabbedPane.add("Scientific", jPanel2);

        calcFrame.add(jTabbedPane);

        jPanel1.setLayout(new GridLayout(4, 4));







        for (int i = 9; i >= 0; i--) {
            if (i == 6) {
                JButton divition = new JButton("/");
                jPanel1.add(divition);
            } else if (i == 3) {
                JButton multiplication = new JButton("*");
                jPanel1.add(multiplication);
            } else if (i == 0) {
                JButton remainder = new JButton("%");
                jPanel1.add(remainder);

                JButton summation = new JButton("+");
                jPanel1.add(summation);
            }
            JButton button = new JButton("" + i);
            jPanel1.add(button);
        }


        JButton substraction = new JButton("-");
        jPanel1.add(substraction);


        JButton calculation = new JButton("=");
        jPanel1.add(calculation);


        jPanel2.setLayout(new GridLayout(6, 4));

        for (int i = 9; i >= 0; i--) {
            if (i == 6) {
                JButton divition = new JButton("/");
                jPanel2.add(divition);
            } else if (i == 3) {
                JButton multiplication = new JButton("*");
                jPanel2.add(multiplication);
            } else if (i == 0) {
                JButton remainder = new JButton("%");
                jPanel2.add(remainder);

                JButton summation = new JButton("+");
                jPanel2.add(summation);
            }
            JButton button = new JButton("" + i);
            jPanel2.add(button);
        }

        JButton substraction2 = new JButton("-");
        jPanel2.add(substraction2);

        JButton calculation2 = new JButton("=");
        jPanel2.add(calculation2);

        JButton exp = new JButton("exp");
        jPanel2.add(exp);

        JButton log = new JButton("log");
        jPanel2.add(log);

        JButton pi = new JButton("pi");
        jPanel2.add(pi);

        JButton p = new JButton("()");
        jPanel2.add(p);

        JButton neper = new JButton("e");
        jPanel2.add(neper);

        JButton sincos = new JButton("sin/cos");
        jPanel2.add(sincos);

        JButton tancot = new JButton("tan/cot");
        jPanel2.add(tancot);

        JButton shift = new JButton("shift");

        shift.addActionListener(e -> {
            if (shiftKey) {
                sincos.setText("sin");
                tancot.setText("tan");
                shiftKey = false;
            } else {
                sincos.setText("cos");
                tancot.setText("cot");
                shiftKey = true;
            }
        });
        jPanel2.add(shift);
    }
}

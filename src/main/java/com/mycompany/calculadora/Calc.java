/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author joaoa
 */
public class Calc extends JFrame{
    public Calc() throws Exception {
        super("Calculadora");
        
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(350, 350);
        setLocation(400, 200);
        
        setLayout(new BorderLayout());
        
        JPanel digitPanel = new JPanel();
        digitPanel.setLayout(new BorderLayout());
        
        TextPanel textPanel =  new TextPanel();
        
        add(BorderLayout.NORTH, textPanel);
        
        digitPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
        
        digitPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));
        
        add(BorderLayout.CENTER, digitPanel);   
        
        
        setVisible(true);
    }
    
    public static void main (String[] args) throws Exception{
        new Calc();
    }
}

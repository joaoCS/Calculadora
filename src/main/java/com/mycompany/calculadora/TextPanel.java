/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author joaoa
 */
public class TextPanel extends JPanel{
    
    private JTextField txtNumber;
    
    public TextPanel(){
        setLayout(new FlowLayout());
        
        txtNumber = new JTextField(15);
        txtNumber.setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.setEnabled(false);
        
        add(txtNumber);       
    }
     
    public JTextField getTxtNumber(){
        return this.txtNumber;
    }    
}

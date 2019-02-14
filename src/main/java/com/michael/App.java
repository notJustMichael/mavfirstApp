package com.michael;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String name,love, sent;
        name = JOptionPane.showInputDialog("Please enter your name");
        love = JOptionPane.showInputDialog("Please enter what you love");
        sent = "Your name is "+name+" and you love "+love;
        JOptionPane.showMessageDialog(null, sent);
    }
}

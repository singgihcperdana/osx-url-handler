/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osx.simple;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author singgihperdana
 */
public class Main {

    public static void main(String[] args) {
        JFrame dialog = new JFrame("");
        dialog.setTitle("osx-url-handler");
        dialog.add(new JLabel("URL Param: " + (args.length > 0 ? args[0] : "")));
        dialog.setSize(300, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}

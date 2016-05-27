/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Scanner;

/**
 *
 * @author Bilal
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Who helped you?");
        String helperName = scan.next();
        System.out.println("Did you walk them through the steps? enter y/n");
        String response = scan.next();
        String closing = "";
        if (response.equalsIgnoreCase("y")) {
            closing = (" I walked the user through the steps to reset their password. User was able to change their password and login. Closing ticket.");
        } else {
            closing = ("The user said they knew how to reset their password. I advised the user to call back if they have any issues.");
        }
        String finalTicket = ("User called asking for a password reset. I verified their 'A' Number and asked " + helperName + " to do a password reset via SpecOps." + closing);
        writeToClipboard(finalTicket);
        System.out.println("The ticket info has been copied to your clipboard.");
    }

    public static void writeToClipboard(String s) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = new StringSelection(s);
        clipboard.setContents(transferable, null);
    }

}

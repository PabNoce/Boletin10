/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin101;

import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Boletin101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secret, nInt, guess, cont;
        String again;
        do {
            do {
                String secreto = JOptionPane.showInputDialog("Ingrese el numero a adivinar: ");
                secret = Integer.parseInt(secreto);
            } while (secret <= 0 || secret > 50);
            do {
                String intentos = JOptionPane.showInputDialog("Ingrese el numero de intentos: ");
                nInt = Integer.parseInt(intentos);
            } while (nInt <= 0);
            cont = 0;
            do {
                String guessString = JOptionPane.showInputDialog("Ingrese el numero corecto: ");
                guess = Integer.parseInt(guessString);
                cont++;
                if (guess < secret && cont != nInt) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado es menor ");
                }
                if (guess > secret && cont != nInt) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado es mayor ");
                }
                if (guess == secret) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado es correcto!");
                }

            } while (guess != secret && cont < nInt);
            if (cont == nInt && guess != secret) {
                JOptionPane.showMessageDialog(null, "Numero de intentos excedidos");
            }
             again= JOptionPane.showInputDialog("Desea jugar de nuevo? (s/n): ");

        } while (again.equals("s"));
    }

}

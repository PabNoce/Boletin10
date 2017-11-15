/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin102;

import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Boletin102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secret, nInt, guess, cont, dif;
        String again, intentos, guessString;
        do {
            secret = (int) (Math.random() * (51 - 1)) + 1;
            do {
                intentos = JOptionPane.showInputDialog("Ingrese el numero de intentos: ");

                nInt = Integer.parseInt(intentos);

            } while (nInt <= 0);
            cont = 0;
            do {
                if (cont == nInt) {
                    JOptionPane.showMessageDialog(null, "Numero de intentos excedidos");
                    guess = 0;
                } else {
                    do {
                        guessString = JOptionPane.showInputDialog("Ingrese el numero corecto: ");

                        guess = Integer.parseInt(guessString);

                    } while (guess <= 0 || guess > 50);
                    cont++;
                    if (guess == secret) {
                        JOptionPane.showMessageDialog(null, "El numero ingresado es correcto!");
                    } else {
                        dif = Math.abs(secret - guess);
                        if (20 < dif) {
                            JOptionPane.showMessageDialog(null, "Moy lonxe");
                        }
                        if (20 >= dif && 10 <= dif) {
                            JOptionPane.showMessageDialog(null, "Lonxe");
                        }
                        if (10 > dif && 5 < dif) {
                            JOptionPane.showMessageDialog(null, "Preto");
                        }
                        if (dif < 5) {
                            JOptionPane.showMessageDialog(null, "Moi preto");
                        }
                    }

                }

            } while (guess != secret && cont < nInt);
            do {
                again = JOptionPane.showInputDialog("Desea jugar de nuevo? (s/n): ");
            } while (!again.equals("s") && !again.equals("n"));
        } while (again.equals("s"));
    }

}

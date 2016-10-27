/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);

        int valor = 0;
        String nom = null;
        String lloc = null;
        int naixement = 0;
        boolean home = false;
        boolean omplit = false;
        double dines = 0.0;

        do {

            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("---------DJ DE MUSICA ELECRTRONICA--------");
            System.out.println("1 ---> SORTIR ");
            System.out.println("2 ---> INTRODUEIX DJ");
            System.out.println("3 ---> BORRAR DJ");
            System.out.println("4 ---> MODIFICAR DJ");
            System.out.println("5 ---> LLISTA DJ");
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("");
            System.out.print("Introdueix una opcio : ");
            valor = entNum.nextInt();

            switch (valor) {
                case 1:
                    System.out.print("Sortin.......");
                    break;
                case 2:
                    if (!omplit) {
                        System.out.print("Introdueix el nom: ");
                        nom = entText.next();
                        System.out.print("Introdueix el lloc de on es: ");
                        lloc = entText.next();
                        System.out.print("Introdueix l'any de naixement: ");
                        naixement = entNum.nextInt();
                        char eshome;
                        
                        do {
                            System.out.print("Introdueix el sexe: (Masculí o Femení)");
                            eshome = entText.nextLine().toUpperCase().charAt(0);
                        } while (eshome != 'M' && eshome !='F');
                        if (eshome == 'M') {
                            home = true;
                        } else {
                            home = false;}
                        
                        System.out.print("Introdueix qual a facturat duran lany: ");
                        dines = entNum.nextDouble();
                        omplit = true;
                    } else {
                        System.out.println("Dades introduides... ");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("opcio incorrecta");
            }

        } while (valor != 1);
    }
}

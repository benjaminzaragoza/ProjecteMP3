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

    private static final int MAX_DJS = 2;
    private static Dj[] array = new Dj[MAX_DJS];

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);

        int valor;
        Dj p = null; //apuntar pj segons la casella
        char sn;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Dj();
            array[i].setOmplit(false);
        }

//        if(i!=array.length){
//            System.out.println("Podem escriure un nou pilot");
//        }
//        else{
//            System.out.println("No hiha lloc per afeguir mes pilots");
//        }
        char eliminar = ' ';
        String nom = null;
        String lloc = null;
        int naixement = 0;
        boolean home = false;
        boolean omplit = false;
        double diners;
        diners = 0.0;
        char eshome = ' ';
        char opcio = ' '; // opcio escollida si S o N ..SI O NO 

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
            System.out.println("\n");
            System.out.print("Introdueix una opcio : ");
            valor = entNum.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("\n");
                    System.out.print("Sortin.......");
                    break;
                case 2:
                    int i;
                    for (i = 0; i < array.length && array[i].isOmplit(); i++);

                    System.out.println("\n");
                    if (i != array.length) {

                        p = array[i]; // aixo es igual que array[i]

                        System.out.print("Introdueix el nom: ");
                        p.setNom(entText.nextLine());

                        System.out.print("Introdueix el lloc de on es: ");
                        p.setLloc(entText.nextLine());

                        System.out.print("Introdueix l'any de naixement: ");
                        p.setNaixement(entNum.nextInt());

                        do {
                            System.out.print("Introdueix el sexe: (Masculí o Femení): ");
                            eshome = entText.nextLine().toUpperCase().charAt(0);
                        } while (eshome != 'M' && eshome != 'F');
                        p.setHome((eshome == 'M'));

                        System.out.print("Introdueix qual a facturat duran lany: ");
                        p.setDiners(entNum.nextDouble());
                        System.out.println("\n");
                        System.out.println("Dades introduides ...");
                        System.out.println("\n");
                        p.setOmplit(true);
                    } else {
                        System.out.println("Dades introduides... ");
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    sn = 'n';
                    for (i = 0; i < array.length; i++) {
                        p = array[i];

                        if (p.isOmplit()) {
                            System.out.println(p);
                            do {
                                System.out.println("vols borrar el dj? (s/n)");
                                sn = entText.nextLine().toLowerCase().charAt(0);
                            } while (sn != 's' && sn != 'n');
                        }
                        if (sn == 's') {
                            break;
                        }

                    }
                    System.out.println("\n");
                    if (i < array.length) {
                        p.setOmplit(false);
                        System.out.println("dj borrat correctament");
                    } else {
                        System.out.println("No hem borrat res");
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    if (omplit) {
                        do {
                            System.out.print("Voleu veure el dj?(Sí/No) ");
                            opcio = entText.nextLine().toUpperCase().charAt(0);
                            System.out.println("\n");
                            switch (opcio) {
                                case 'S':
                                    System.out.println(nom);
                                    System.out.println(lloc);
                                    System.out.println(naixement);
                                    System.out.println(eshome);
                                    System.out.println(diners);
                                    System.out.println("\n");
                                    break;
                                case 'N':
                                    System.out.println("\n");
                                    break;
                                default:
                                    System.out.println("Opcio incorrecta");
                                    System.out.println("\n");
                            }
                        } while (opcio != 'S' && opcio != 'N');

                        System.out.print("Vols modificar el dj? (S/N) ");
                        opcio = entText.nextLine().toUpperCase().charAt(0);
                        System.out.println("\n");

                        switch (opcio) {
                            case 'S':
                                System.out.println("El seu nom es" + nom);
                                System.out.println("\n");
                                System.out.print("Vols canviar el nom? (S/N) ");
                                opcio = entText.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                switch (opcio) {
                                    case 'S':
                                        System.out.println("Quin nom posem? ");
                                        nom = entText.nextLine();
                                        System.out.println("\n");
                                        break;
                                    case 'N':
                                        System.out.println("no canviem res... ");
                                        System.out.println("\n");
                                        break;
                                }

                                System.out.println("Resideix a " + lloc);
                                System.out.println("\n");
                                System.out.print("Vols canviar el lloc?(S/N) ");
                                opcio = entText.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                switch (opcio) {
                                    case 'S':
                                        System.out.println("Quin lloc posem?");
                                        lloc = entText.nextLine();
                                        System.out.println("\n");
                                        break;
                                    case 'N':
                                        System.out.println("No canviem res...");
                                        System.out.println("\n");
                                        break;
                                }
                                System.out.println("Va naixer l'any " + naixement);
                                System.out.println("\n");
                                System.out.print("Vols canviar el any de naixement?(S/N) ");
                                opcio = entText.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                switch (opcio) {
                                    case 'S':
                                        System.out.print("Quin  any de naixement  posem? ");
                                        naixement = entNum.nextInt();
                                        System.out.println("\n");
                                        break;
                                    case 'N':
                                        System.out.println("no canviem res...");
                                        System.out.println("\n");
                                        break;
                                }
                                System.out.println("El seu sexe es " + eshome);
                                System.out.println("\n");
                                do {
                                    System.out.print("Vols canviar el sexe?(S/N)");
                                    opcio = entText.nextLine().toUpperCase().charAt(0);
                                } while (eshome != 'M' && eshome != 'F');
                                home = (eshome == 'M');
                                System.out.println("\n");
                                switch (opcio) {
                                    case 'S':
                                        do {
                                            System.out.println("Quin  sexe posem : Masculí o Femení");
                                            eshome = entText.nextLine().toUpperCase().charAt(0);
                                        } while (eshome != 'M' && eshome != 'F');
                                        home = (eshome == 'M');
                                        System.out.println("\n");
                                        break;
                                    case 'N':
                                        System.out.println("No canviem res...");
                                        System.out.println("\n");
                                        break;
                                }
                                System.out.println("A facturat durant l'any.. " + diners);
                                System.out.println("\n");
                                System.out.print("Vols canviar el diners facturats?(S/N) ");
                                opcio = entText.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                switch (opcio) {
                                    case 'S':
                                        System.out.println("Quants diners posem? ");
                                        diners = entNum.nextDouble();
                                        System.out.println("\n");
                                        break;
                                    case 'N':
                                        System.out.println("No canviem res...");
                                        System.out.println("\n");
                                        break;
                                }
                                break;
                            case 'N':
                                System.out.println("No canviem res...");
                                System.out.println("\n");
                                break;

                            default:
                                System.out.println("Opcio incorrecta....");
                        }

                    } else {
                        System.out.println("No hi ha s'han introduit dades.....");
                    }
                    break;
                case 5:
                    System.out.println("\n");
                    if (omplit) {
                        System.out.println("-----> El seu nom es " + nom);
                        System.out.println("-----> Va naixer a " + lloc);
                        System.out.println("-----> El seu any de naixement es " + naixement);
                        if (eshome == 'F') {
                            System.out.println("-----> El seu sexe es Femeni");
                        } else {
                            System.out.println("-----> El seu sexe es Masculi");
                        }
                        System.out.println("-----> A facturat " + diners);
                        System.out.println("\n");
                    } else {
                        System.out.println("No hi ha s'han introduit dades ");
                    }
                    break;
                default:
                    System.out.println("opcio incorrecta");
            }

        } while (valor != 1);
    }
}

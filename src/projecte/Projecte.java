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
    private static int valor;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        // TODO code application logic here
        inicialitzarVariables();
        do {
            demanarDj();
            tractarDj();
        } while (!opcioFinal());

    }

    public static void inicialitzarVariables() {
        Dj p = null; //apuntar pj segons la casella
        char sn;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Dj();
            array[i].setOmplit(false);
        }
    }

    public static void demanarDj() {

        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);

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
    }

    public static void tractarDj() {

        switch (valor) {
            case 1:                                 //1. Sortir
                System.out.println("\n");
                System.out.print("Sortin.......");
                break;
            case 2:                                 //2. Introduïr dj
                introduirDj();
                break;
            case 3:                                 //3. Borrar pilot
                borrarDj();
                break;
            case 4:                                 //4. Modificar pilot
                modificarDj();
                break;
            case 5:                                 //5. Llistar pilots
                llistarDj();
                break;
            default:
                System.out.println("opcio incorrecta");
        }

    }

    public static boolean opcioFinal() {
        return valor == 1;
    }

    public static void introduirDj() {
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);
        int i;
        char eshome = ' ';
        Dj p = null;

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
    }

    public static void borrarDj() {

        Dj p = null;
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);
        char sn = 'n';
        int i;

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
            System.out.println("dj borrat correctament...");
        } else {
            System.out.println("No tenim res que borrar,perfavor introduieixi dades");
        }
    }

    public static void modificarDj() {
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);
        char sn = 'n';
        int cont = 1, i;
        char eshome = ' ';

        System.out.println("\n");
        for (i = 0; i < array.length && sn != 'S' && sn != 'F'; i++) {
            if (array[i].isOmplit()) {

                System.out.format("\nDj %d:\n", cont++);
                System.out.println(array[i].toString());

                do {
                    System.out.print("Vols modificar el dj? (S/N) ");
                    sn = entText.nextLine().toUpperCase().charAt(0);
                    System.out.println("\n");
                } while (sn != 'S' && sn != 'N');

                switch (sn) {
                    case 'S':
                        System.out.println("\nNom: " + array[i].getNom());
                        do {
                            System.out.println("\nVols modificar el nom?(S/N):");
                            sn = entText.nextLine().toUpperCase().charAt(0);
                        } while (sn != 'S' && sn != 'N');
                        switch (sn) {
                            case 'S':
                                System.out.println("Quin nom posem? ");
                                array[i].setNom(entText.nextLine());
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
                                System.out.println("\n");
                                break;
                            case 'N':
                                System.out.println("no canviem res... ");
                                System.out.println("\n");
                                break;
                        }
                        System.out.println("\n lloc: " + array[i].getLloc());
                        System.out.println("\n");
                        do {
                            System.out.println("\nVols modificar el lloc?(S/N):");
                            sn = entText.nextLine().toUpperCase().charAt(0);
                        } while (sn != 'S' && sn != 'N');
                        System.out.println("\n");
                        switch (sn) {
                            case 'S':
                                System.out.println("Quin lloc posem?");
                                array[i].setLloc(entText.nextLine());
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
                                System.out.println("\n");
                                break;
                            case 'N':
                                System.out.println("No canviem res...");
                                System.out.println("\n");
                                break;
                        }
                        System.out.println("\n Naixement: " + array[i].getNaixement());
                        System.out.println("\n");
                        System.out.print("Vols canviar el any de naixement?(S/N) ");
                        sn = entNum.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
                                System.out.println("\n");
                        switch (sn) {
                            case 'S':
                                System.out.print("Quin  any de naixement  posem? ");
                                array[i].setNaixement(entNum.nextInt());
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
                                System.out.println("\n");
                                break;
                            case 'N':
                                System.out.println("no canviem res...");
                                System.out.println("\n");
                                break;
                        }
                        if (array[i].isHome()) {
                            System.out.println("\nÉs masculi");
                        } else {
                            System.out.println("\nÉs femeni");
                        }
                        System.out.println("\n");
                        do {
                            System.out.print("Vols canviar el sexe?(S/N)");
                            sn = entText.nextLine().toUpperCase().charAt(0);
                        } while (sn != 'S' && sn != 'N');
                        System.out.println("\n");
                        switch (sn) {
                            case 'S':
                                char esHome;
                                do {
                                    System.out.println("Quin  sexe posem : Masculí o Femení");
                                    esHome = entText.nextLine().toUpperCase().charAt(0);
                                    System.out.println("\n");
                                    System.out.println("Dades introduides... ");
                                    System.out.println("\n");
                                } while (esHome != 'M' && eshome != 'F');
                                array[i].setHome(esHome == 'H');
                                System.out.print("Nou gènere: ");
                                if (array[i].isHome()) {
                                    System.out.println("masculi");
                                } else {
                                    System.out.println("femeni");
                                }
                                break;
                            case 'N':
                                System.out.println("No canviem res...");
                                System.out.println("\n");
                                break;
                        }
                        System.out.println("\n Diners: " + array[i].getDiners());
                        System.out.println("\n");
                        System.out.print("Vols canviar el diners facturats?(S/N) ");
                        sn = entText.nextLine().toUpperCase().charAt(0);
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
                                System.out.println("\n");
                        switch (sn) {
                            case 'S':
                                System.out.println("Quants diners posem? ");
                                array[i].setDiners(entNum.nextInt());
                                System.out.println("\n");
                                System.out.println("Dades introduides... ");
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

        }
    }
    public static void llistarDj() {
        Scanner entText = new Scanner(System.in);
        Scanner entNum = new Scanner(System.in);
        char sn = 'S';
        int i;
        boolean algun = false;

        for (i = 0; i < array.length; i++) {
            Dj p = array[i];
            System.out.println("\n");

            if (p.isOmplit()) {
                algun = true;
                System.out.println(p);
                if (sn == 'N') {
                    break;
                }
            }
            if (!algun) {
                System.out.println("\nNo hi ha pilots per mostrar, si vols, primer crea'n.");
            }
            if (sn == 'N') {
                break;
            }
        }
        if (!algun) {
            System.out.println("\nNo hi ha pilots per mostrar, si vols, primer crea'n.");
        }
    }
}

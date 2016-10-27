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
        Scanner entrada = new Scanner(System.in);
        
        int valor=0;
        String nom=null;
        String lloc=null;
        int naixement=0;
        boolean sexe=false;
        double dines=0.0;
        
       
        do{
         
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
        valor = entrada.nextInt();
        
            switch (valor) {
                case 1:
                    System.out.print("Sortin.......");
                    break;
                case 2:
                    System.out.print("Introdueix el nom: ");
                    nom = entrada.next();
                    System.out.print("Introdueix el lloc de on es: ");
                    lloc = entrada.next();
                    System.out.print("Introdueix l'any de naixement: ");
                    naixement = entrada.nextInt();
                    System.out.print("Introdueix el sexe: ");
                    sexe=entrada.nextBoolean();
                    System.out.print("Introdueix qual a facturat duran lany: ");
                    dines=entrada.nextDouble();
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
            
        }while(valor!=1);
    }
}
        


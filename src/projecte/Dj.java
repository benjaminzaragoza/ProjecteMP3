/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author alumne
 */
public class Dj {
    

        private char eliminar = ' ';
        private String nom = null;
        private String lloc = null;
        private int naixement = 0;
        private boolean home = false;
        private boolean omplit = false;
        private double diners = 0.0;
        private char eshome = ' ';

   
        
     public char getEliminar() {
        return eliminar;
    }

    @Override
    public String toString() {
        return
                "\n nom=" + nom + 
                "\n lloc=" + lloc + 
                "\n naixement=" + naixement +
                "\n diners=" + diners +
                (home?"\n Genere masculi":"\n Genere femeni");
   
    }

    public void setEliminar(char eliminar) {
        this.eliminar = eliminar;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLloc() {
        return lloc;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public int getNaixement() {
        return naixement;
    }

    public void setNaixement(int naixement) {
        this.naixement = naixement;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

    public double getDiners() {
        return diners;
    }

    public void setDiners(double diners) {
        this.diners = diners;
    }

    public char getEshome() {
        return eshome;
    }

    public void setEshome(char eshome) {
        this.eshome = eshome;
    }
        
}

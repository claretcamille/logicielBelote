package GestionJoueur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilleclaret
 */
public class Equipe {
    
    private String j1;
    private String j2;
    private int numE;
    
    public Equipe(String nom1, String nom2, int num){
        this.j1 = nom1;
        this.j2 = nom2;
        this.numE = num;
    }
    
    public int  getNumE(){
        return this.numE;
    }
    
    public String[] getNomE(){
        String equipe [] = {this.j1, this.j2};
        return equipe;
    }
    
    public void ChangeJ1(String nom1){
        this.j1 = nom1;
    }
    
    public void ChangeJ2(String nom2){
        this.j2 = nom2;
    }
    
}

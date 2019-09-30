package GestionJoueur;


import GestionJoueur.Equipe;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilleclaret
 */
public class ListeEquipe {
    
    List<Equipe> jeu;
    int num;
    
    public ListeEquipe() {
        this.jeu = new ArrayList<Equipe>();
        this.num = 1;
    }
    
    public void ajoutEquipe(String j1, String j2){
        this.jeu.add(new Equipe(j1,j2,this.num));
        this.num ++;
    }
    
    public int getNbrEquipe(){
        return this.num-1;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GestionJoueur.ListeEquipe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camilleclaret
 */
public class ListeEquipeTest {
    
    public ListeEquipeTest() {
    }
    
   private ListeEquipe ll;
   private String e[] = {"jean","phill"};
    
    @Before
    public void setUp() {
        ll = new ListeEquipe();
    }

    @Test
    public void ajoutEquipe() {
        ll.ajoutEquipe(e[0],e[1]);
        assertEquals(ll.getNbrEquipe(),1);
    }
    
    @Test
    public void ajoutPlusieurEquipe(){
        for(int i = 0; i<10;i++){
            ll.ajoutEquipe(e[0],e[1]);
            assertEquals(ll.getNbrEquipe(),i+1);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GestionJoueur.Equipe;
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
public class EquipeTest {
    
    private Equipe E1;
     String nomE[]= {"Camille","Loïc"};
    
    @Before
    public void setUp() {
        E1 = new Equipe("Camille","Loïc",1);
    }

    @Test
    public void getNumE() {
        assertEquals(1,E1.getNumE());
    }
    
    @Test
    public void getNomE() {
        assertEquals(nomE[0],E1.getNomE()[0]);
        assertEquals(nomE[1],E1.getNomE()[1]);
    }
    
    @Test
    public void changeNom(){
        nomE[0]= "Jean";
        E1.ChangeJ1(nomE[0]);
        assertEquals(nomE[0],E1.getNomE()[0]);  
        assertEquals(nomE[1],E1.getNomE()[1]);
        E1.ChangeJ2(nomE[0]);
        assertEquals(nomE[0],E1.getNomE()[0]);  
        assertEquals(nomE[0],E1.getNomE()[1]);
    }
    
}

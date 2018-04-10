/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalavras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matheus
 */
public class BuscaPalavraTest {
    private NaiveBusca naive;
    private KnuthMorrisPartBusca kmp;
    private BoyerMooreBusca boyer;
    private RabinKarpBusca rabin;
    public BuscaPalavraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        LerArquivo.setTextoCompleto();
        naive = new NaiveBusca();
        kmp = new KnuthMorrisPartBusca();
        boyer = new BoyerMooreBusca();
        rabin = new RabinKarpBusca();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class NaiveBusca.
     */
    @Test
    public void testSearch() {
        assertEquals(true, naive.search(LerArquivo.getTextoCompleto(), "way"));
        assertEquals(false, naive.search(LerArquivo.getTextoCompleto(), "matheus"));
        assertEquals(false, kmp.search(LerArquivo.getTextoCompleto(), ""));
        assertEquals(false, boyer.search(LerArquivo.getTextoCompleto(), ""));
        assertEquals(false, rabin.search(LerArquivo.getTextoCompleto(), ""));

    }
    
}

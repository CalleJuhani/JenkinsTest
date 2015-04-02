package fi.jamk.testi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class RekisteriTest extends TestCase {
	Rekisteri lista;
	public RekisteriTest(String testname) {
		super(testname);
	}

	public static Test suite()
    {
        return new TestSuite( RekisteriTest.class );
    }
	
	public void testHenkiloMaara() {
		lista = new Rekisteri(2);
		assertTrue( lista.palautaHenkiloMaara() == 0);
		
		lista.lisaaHenkilo( new Henkilo("Mikko Moisio", "151085-1436", 200.0, false) );
		assertTrue( lista.palautaHenkiloMaara() == 1);
		
		lista.lisaaHenkilo( new Henkilo("Mikko Moisio", "151085-1436", 200.0, false) );
		assertTrue( lista.palautaHenkiloMaara() == 2);
		
		lista.lisaaHenkilo( new Henkilo("Mikko Moisio", "151085-1436", 200.0, false) );
		assertTrue( lista.palautaHenkiloMaara() == 2);
	}
	
	public void testEtsiHenkilo() {
		lista = new Rekisteri(3);
		lista.lisaaHenkilo( new Henkilo("Mikko Moisio", "151085-1436", 200.0, false) );
		lista.lisaaHenkilo( new Henkilo("Toni Pudas", "151085-1433", 300.0, false) );
		lista.lisaaHenkilo( new Henkilo("Arska Mies", "010188-1436", 400.0, false) );
		
		Henkilo tyyppi1 = lista.etsiHenkilo("151085-1433");
		Henkilo tyyppi2 = lista.etsiHenkilo("010189-0000");
		assertTrue(tyyppi1.kuiskaaLaina() == 300.0);
		assertTrue(tyyppi2 == null);
	}
	
	public void testPalautaHenkilo() {
		lista = new Rekisteri(3);
		lista.lisaaHenkilo( new Henkilo("Mikko Moisio", "151085-1436", 200.0, false) );
		lista.lisaaHenkilo( new Henkilo("Toni Pudas", "151085-1433", 300.0, false) );
		lista.lisaaHenkilo( new Henkilo("Arska Mies", "010188-1436", 400.0, false) );
		
		Henkilo tonip = lista.palautaHenkilo(1);
		Henkilo myssymosse = lista.palautaHenkilo(0);
		Henkilo nullref = lista.palautaHenkilo(3);
		assertTrue(tonip.kuiskaaLaina() == 300.0);
		assertTrue(myssymosse.kuiskaaLaina() == 200.0);
		assertTrue(nullref == null);
		
		
	}
}
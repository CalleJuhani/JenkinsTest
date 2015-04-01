package fi.jamk.testi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HenkiloTest {

	Henkilo tyyppi;
	@Before
	public void setUp() {
		tyyppi = new Henkilo("Mikko Moisio", "151085-1436", 200.0, false);
	}

	@After
	public void tearDown() {}
	    
	@Test
	public void palautaSotuShouldReturnCorrectSotu() {
		assertEquals("151085-1436", tyyppi.palautaSotu());
	}

}

package fi.jamk.testi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HenkiloTest extends TestCase {

	Henkilo tyyppi;
	public HenkiloTest(String testname) {
		super(testname);
	}

	public static Test suite()
    {
        return new TestSuite( HenkiloTest.class );
    }
	
	public void testSotu() {
		tyyppi = new Henkilo("Mikko Moisio", "151085-1436", 200.0, false);
		assertTrue("151085-1436" == tyyppi.palautaSotu());
	}
	
	public void testLaina() {
		tyyppi = new Henkilo("Mikko Moisio", "151085-1436", 200.0, false);
		assertTrue( 200.0 == tyyppi.kuiskaaLaina() );
		tyyppi.nostaLainaa(89.0);
		assertTrue( 289.0 == tyyppi.kuiskaaLaina() );
		tyyppi.maksaLainaa(60.0);
		assertTrue( 229.0 == tyyppi.kuiskaaLaina() );
	}
	
}

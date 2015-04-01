package fi.jamk.testi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HenkiloTest extends TestCase {

	public HenkiloTest(String testname) {
		super(testname);
	}

	public static Test suite()
    {
        return new TestSuite( HenkiloTest.class );
    }
	
	public void testHenkilo() {
		Henkilo tyyppi = new Henkilo("Mikko Moisio", "151085-1436", 200.0, false);
		assertTrue("151085-1436" == tyyppi.palautaSotu());
	}

}

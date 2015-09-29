package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
	private C12 c;
	
	@Before
	public void before(){
		c = new C12();
	}

	@Test
	public void testmA() {
		assertEquals("mA",c.mA());
	}

}

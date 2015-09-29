package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
	private C22 c;
	
	@Before
	public void before(){
		c = new C22();
	}

	@Test
	public void test() {
		assertEquals("mA",c.mA());
	}

}

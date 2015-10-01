package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

	private C52 c;
	
	@Before
	public void before(){
		c = new C52();
	}

	@Test
	public void test() {
		assertEquals("mA",c.mA());
	}

}

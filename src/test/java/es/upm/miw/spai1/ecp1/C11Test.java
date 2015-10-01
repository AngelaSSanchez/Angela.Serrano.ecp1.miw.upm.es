package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C11Test {
	private C11 c;
	
	@Before
	public void before(){
		c = new C11();
	}

	@Test
	public void testm1() {
		assertEquals("m11",c.m1());
	}
	
	@Test
	public void testm2() {
		assertEquals("m2",c.m2());
	}

}

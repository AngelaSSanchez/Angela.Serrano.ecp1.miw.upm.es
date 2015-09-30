package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

	private C31 c;

	@Before
	public void before(){
		c = new C31();
	}
	
	@Test
	public void testm1() {
		assertEquals("m1",c.m1());
	}
	
	@Test
	public void testm2() {
		assertEquals("m2",c.m2());
	}
	
	@Test
	public void testmB() {
		assertEquals("mB",c.mB());
	}

}

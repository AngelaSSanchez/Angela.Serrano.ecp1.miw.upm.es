package es.upm.miw.spai1.ecp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

	private C32 c;
	
	@Before
	public void before(){
		c = new C32();
	}

	@Test
	public void test() {
		assertEquals("mA",c.mA());
	}

}

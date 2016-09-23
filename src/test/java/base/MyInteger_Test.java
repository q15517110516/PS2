package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);

		MyInteger q = new MyInteger(18);
		MyInteger w = new MyInteger(86);
		MyInteger e = new MyInteger(47);

		assertTrue(q.isEven());
		assertFalse(q.isOdd());
		assertFalse(q.isPrime());
		assertTrue(w.isEven());
		assertFalse(w.isOdd());
		assertFalse(w.isPrime());
		assertFalse(e.isEven());
		assertTrue(e.isOdd());
		assertTrue(e.isPrime());

		int z = 38;
		int x = 29;
		int c = 48;

		MyInteger numz = new MyInteger(z);
		MyInteger numx = new MyInteger(x);
		MyInteger numc = new MyInteger(c);

		assertTrue(MyInteger.isEven(z));
		assertTrue(MyInteger.isOdd(x));
		assertTrue(MyInteger.isEven(c));
		assertFalse(MyInteger.isPrime(z));
		assertFalse(MyInteger.isOdd(c));
		assertFalse(MyInteger.isEven(x));

		assertTrue(numz.isEven(z));
		assertTrue(numx.isOdd(x));
		assertTrue(numc.isEven(c));
		assertFalse(numc.isOdd(c));
		assertFalse(numx.isEven(x));

		assertTrue(MyInteger.isEven(q));
		assertFalse(MyInteger.isPrime(w));
		assertFalse(MyInteger.isOdd(q));
		assertTrue(MyInteger.isPrime(e));
		assertTrue(MyInteger.isEven(w));

		assertTrue(q.equals(q));
		assertFalse(w.equals(q));
		assertFalse(e.equals(w));

		assertEquals(q.getiValue(), 18);
		assertEquals(e.getiValue(), 47);
		assertEquals(w.getiValue(), 86);

	}
}

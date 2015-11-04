package PaymentApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SalariedTest {
	private Salaried salariedTest;

	@Before
	public void setUp() {
		salariedTest = new Salaried("Mr. Paul", 27777.78, 12349876);

	}

	@Test
	public void testGetName() {
		assertEquals("Mr. Paul", salariedTest.getName());
	}

	@Test
	public void testGetGrossPayment() {
		assertEquals(27777.78, salariedTest.getGrossPayment(), 0.01);
	}

	@Test
	public void testGetBankAccount() {
		Integer expectedBankAcct = 12349876;
		assertEquals(expectedBankAcct, salariedTest.getBankAccount());
	}

}

package PaymentApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CommissionedTest {

	private Commissioned commissionedTest;

	@Before
	public void setUp() {
		commissionedTest = new Commissioned("Ms. Carla", 27777.78, 12349876);
		//salariedTest = new Salaried();
	}

	@Test
	public void testGetName() {
		assertEquals("Ms. Carla", commissionedTest.getName());
	}

	@Test
	public void testGetGrossPayment() {
		assertEquals(27777.78, commissionedTest.getGrossPayment(), 0.01);
	}

	@Test
	public void testGetBankAccount() {
		Integer expectedBankAcct = 12349876;
		assertEquals(expectedBankAcct, commissionedTest.getBankAccount());
	}


}

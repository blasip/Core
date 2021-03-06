package PaymentApplication;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	private List<Payee> payees;

	public PaymentSystem() {
		payees = new ArrayList<>();
	}

	public void addPayee(Payee payee) {
		if (!payees.contains(payee)) {
			payees.add(payee);
		}
	}

	public void processPayments() {
		for (Payee payee : payees) {
			Double grossPayment = payee.getGrossPayment();
			System.out.println("Paying to " + payee.getName());
			System.out.println("Gross " + grossPayment);
			System.out.println("Transferred to Account: "
					+ payee.getBankAccount());
		}
	}
}

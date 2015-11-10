package PaymentApplication;

public class Salaried extends Employee {

	public Salaried(String name, Double grossPay, Integer bankAccount) {
		super(name, grossPay, bankAccount);
	}

	@Override
	public void giveBonus(Double percentage) {
		Double multiplier = percentage / 100;
		bonus = grossPay * multiplier;

	}

	@Override
	public Double getGrossPayment() {

		return grossPay + bonus;
	}

}

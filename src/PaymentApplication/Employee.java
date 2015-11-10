package PaymentApplication;

abstract class Employee implements Payee {

	public String name;
	public Double grossPay;
	public Integer bankAccount;
	public Double bonus;

	Employee(String name, Double grossPay, Integer bankAccount) {
		this.name = name;
		this.grossPay = grossPay;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public abstract Double getGrossPayment();

	public abstract void giveBonus(Double percentage);

	public Integer getBankAccount() {
		return bankAccount;
	}

}

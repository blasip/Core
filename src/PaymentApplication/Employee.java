package PaymentApplication;

abstract class Employee implements Payee {

	public String name;
	public Double grossPay;
	public Integer bankAccount;
	
	Employee(String name, Double grossPay, Integer bankAccount) {
		this.name = name;
		this.grossPay = grossPay;
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getGrossPayment() {
		return grossPay;
	}

	@Override
	public Integer getBankAccount() {
		return bankAccount;
	}

}

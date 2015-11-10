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
	

	public String getName() {
		return name;
	}


	public Double getGrossPayment() {
		return grossPay;
	}


	public Integer getBankAccount() {
		return bankAccount;
	}

}

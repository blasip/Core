package PaymentApplication;

public class Salaried implements Payee {
	
	String name;
	Double grossPay;
	Integer bankAccount;
	
	Salaried (String name, Double grossPay, Integer bankAccount) {
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

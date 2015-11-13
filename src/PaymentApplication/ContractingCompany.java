package PaymentApplication;

public class ContractingCompany implements Payee {
	
	public String name;
	public Double grossPay;
	public Integer bankAccount;
	public Double additionalPay;

	ContractingCompany(String name, Double grossPay, Integer bankAccount) {
		this.name = name;
		this.grossPay = grossPay;
		this.bankAccount = bankAccount;
		this.additionalPay = 0.00;
	}
	public void payForServices(Double amount) {
				
		additionalPay += amount;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getGrossPayment() {
		return grossPay + additionalPay;
	}

	@Override
	public Integer getBankAccount() {
		return bankAccount;
	}

}
